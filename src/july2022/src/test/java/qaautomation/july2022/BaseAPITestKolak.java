package qaautomation.july2022;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeMethod;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseAPITestKolak {
	RequestSpecification commonJsonSpec = new RequestSpecBuilder()
			.setBaseUri("https://kolakproject.herokuapp.com").setContentType(ContentType.JSON).build().log().all();

	RequestSpecification LoginJsonSpec;
	String token;
	
	@BeforeMethod
	public void login() {
		
		String payload = "{\n"
				+ "    \"username\" : \"jajanbareng\",\n"
				+ "    \"password\" : \"passwordsangatkuat\"\n"
				+ "\n"
				+ "}";
		
		Response responseLogin = given().spec(commonJsonSpec).body(payload).when().post("/login");
		token = responseLogin.jsonPath().get("Authorization");
		System.out.println(token);
		
		LoginJsonSpec = new RequestSpecBuilder()
				.setBaseUri("https://kolakproject.herokuapp.com")
				.setContentType(ContentType.JSON).addHeader("Authorization", "Bearer "+token)
				.build().log().all();
	}

}
