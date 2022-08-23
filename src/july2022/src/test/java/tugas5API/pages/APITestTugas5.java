package tugas5API.pages;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class APITestTugas5  {
	

	RequestSpecification CommonJsonSpec = new RequestSpecBuilder()
			.setBaseUri("https://api-staging-builder.engineer.ai").setContentType(ContentType.JSON).build().log().all();
	
	@Test
	public void fakerTest() {
		Faker faker = new Faker();
		System.out.println(faker.name().firstName());
	}
	
	@Test
	public void signUpAPI() {
		
		String payload = "{\n"
				+ "    \"user\": {\n"
				+ "        \"first_name\": \"Testlas4\",\n"
				+ "        \"last_name\": \"\",\n"
				+ "        \"email\": \"Testlas4@gmail.com\",\n"
				+ "        \"password\": \"Testlas3\",\n"
				+ "        \"phone_number\": \"+62-8532431415\",\n"
				+ "        \"user_type\": \"User\",\n"
				+ "        \"currency_id\": 10\n"
				+ "    }\n"
				+ "}";
		
		Response responseUser = given().spec(CommonJsonSpec).body(payload).when().post("/users");
		System.out.println("responseuser" + responseUser);
		assertEquals(responseUser.statusCode(), 200);
		
	}

}
