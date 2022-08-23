package qaautomation.july2022;

import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.given;


import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.response.Response;

public class APITestAfterRefactorKolak extends BaseAPITestKolak {
	String token; 
	
	
	@Test
	public void userAPI() {
		
		Response responseUser = given().spec(LoginJsonSpec).when().get("/me/status");
		
		assertEquals(responseUser.statusCode(), 200);
	}
	
	@Test
	public void userNegativeAPI() {
		
		Response responseUser = given().spec(commonJsonSpec).when().get("/user");
		
		assertEquals(responseUser.statusCode(), 401);
	}
	

	@Test
	public void configAPI() {
		
		Response responseUser = given().spec(commonJsonSpec).when().get("/help");
		
		assertEquals(responseUser.statusCode(), 200);
	}

	
	@Test 
	public void fakerTest() {
		Faker faker = new Faker();
		System.out.println(faker.name().firstName());
		System.out.println(faker.internet().emailAddress());
		System.out.println(faker.phoneNumber().cellPhone());
	}
}
