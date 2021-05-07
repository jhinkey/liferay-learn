import com.liferay.headless.admin.user.client.dto.v1_0.UserAccount;
import com.liferay.headless.admin.user.client.pagination.Page;
import com.liferay.headless.admin.user.client.pagination.Pagination;
import com.liferay.headless.admin.user.client.resource.v1_0.UserAccountResource;

public class Users_GET {

	/**
	 * java -classpath .:* Users_GET
	 */
	public static void main(String[] args) throws Exception {
		UserAccountResource.Builder builder = UserAccountResource.builder();

		UserAccountResource userAccountResource = builder.authentication(
			"test@liferay.com", "test"
		).build();

		Page<UserAccount> userAccounts =
			userAccountResource.getUserAccountsPage(
				null, null, Pagination.of(1, 2), null);

		System.out.println(userAccounts);
	}

}