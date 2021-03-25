import com.liferay.headless.delivery.client.dto.v1_0.DocumentFolder;
import com.liferay.headless.delivery.client.resource.v1_0.DocumentFolderResource;

public class Folder_Add {

	/**
	 * java -classpath .:* -DsiteId=1234 Folder_Add
	 */
	public static void main(String[] args) throws Exception {
		DocumentFolderResource.Builder builder =
			DocumentFolderResource.builder();

		DocumentFolderResource documentFolderResource = builder.authentication(
			"test@liferay.com", "test"
		).build();

		DocumentFolder documentFolder =
			documentFolderResource.postSiteDocumentFolder(
				Long.valueOf(System.getProperty("siteId")),
				new DocumentFolder() {
					{
						name = "foo";
					}
				});

		System.out.println(documentFolder);
	}

}