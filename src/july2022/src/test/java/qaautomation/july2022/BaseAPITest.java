package qaautomation.july2022;

import org.testng.annotations.BeforeMethod;

import static io.restassured.RestAssured.given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseAPITest {
	
	RequestSpecification commonJsonSpec = new RequestSpecBuilder()
			.setBaseUri("https://api-staging-builder.engineer.ai").setContentType(ContentType.JSON).build().log().all();
	
	RequestSpecification LoginJsonSpec;
	String token;
	
	@BeforeMethod 
	public void login() {
		
		String payload = "{\n"
				+ "    \"email\": \"testlabs@gmail.com\", \n"
				+ "    \"password\": \"builder123\"\n"
				+ "\n"
				+ "}\n"
				+ "";
		
		Response responseLogin = given().spec(commonJsonSpec).body(payload).when().post("/users/sign_in");
		token = responseLogin.jsonPath().get("user.authtoken");
		System.out.println(token);
		
		LoginJsonSpec = new RequestSpecBuilder()
				.setBaseUri("https://api-staging-builder.engineer.ai")
				.setContentType(ContentType.JSON).addHeader("authtoken", token)
				.build().log().all();
		
	}

}
