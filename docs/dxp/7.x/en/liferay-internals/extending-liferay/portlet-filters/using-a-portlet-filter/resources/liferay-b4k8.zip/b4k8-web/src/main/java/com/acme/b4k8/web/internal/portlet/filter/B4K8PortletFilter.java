package com.acme.b4k8.web.internal.portlet.filter;

import com.acme.b4k8.constants.B4K8PortletKeys;
import com.acme.b4k8.model.Member;
import com.acme.b4k8.web.internal.constants.B4K8WebKeys;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.filter.FilterChain;
import javax.portlet.filter.FilterConfig;
import javax.portlet.filter.PortletFilter;
import javax.portlet.filter.RenderFilter;

import org.osgi.service.component.annotations.Component;

@Component(
	property = {
		"javax.portlet.name=" + B4K8PortletKeys.B4K8,
		"service.ranking:Integer=1"
	},
	service = PortletFilter.class
)
public class B4K8PortletFilter implements RenderFilter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(
			RenderRequest renderRequest, RenderResponse renderResponse,
			FilterChain filterChain)
		throws IOException, PortletException {

		Optional.ofNullable(
			(List<Member>)renderRequest.getAttribute(B4K8WebKeys.MEMBERS)
		).ifPresent(
			members -> renderRequest.setAttribute(
				B4K8WebKeys.MEMBERS, _obfuscateEmailAddresses(members))
		);

		System.out.println("B4K8PortletFilter.doFilter");
		filterChain.doFilter(renderRequest, renderResponse);
	}

	@Override
	public void init(FilterConfig filterConfig) throws PortletException {
	}

	private List<Member> _obfuscateEmailAddresses(List<Member> members) {
		List<Member> newMembers = new ArrayList<>();

		for (Member member : members) {
			String emailAddress = member.getEmailAddress();

			Member newMember = new Member(
				emailAddress.replaceFirst("(.+)(...)@(...)(.*)", "$1...@...$4"),
				member.getName());

			newMembers.add(newMember);
		}

		return newMembers;
	}

}