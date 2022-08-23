package qaautomation.july2022;

import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.given;


import org.testng.annotations.Test;

import io.restassured.response.Response;

public class APITestAfterRefactor extends BaseAPITest {
	String token; 
	
	
	@Test
	public void userAPI() {
		
		Response responseUser = given().spec(LoginJsonSpec).when().get("/user");
		
		assertEquals(responseUser.statusCode(), 200);
	}

	@Test
	public void negativeUserAPI() {
		
		Response responseUser = given().spec(commonJsonSpec).when().get("/user");
		
		assertEquals(responseUser.statusCode(), 401);
	}
	
	
	@Test
	public void configAPI() {
		Response responseUser = given().spec(commonJsonSpec).when().get("/configurations");
		
		assertEquals(responseUser.statusCode(), 200);
	}
	

}
