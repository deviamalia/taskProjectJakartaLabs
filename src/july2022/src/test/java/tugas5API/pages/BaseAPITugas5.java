package tugas5API.pages;

import static io.restassured.RestAssured.given;

//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

//import com.github.javafaker.Faker;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseAPITugas5 {
	
	
	

//	RequestSpecification CommonJsonSpec = new RequestSpecBuilder()
//			.setBaseUri("https://api-staging-builder.engineer.ai").setContentType(ContentType.JSON).build().log().all();
	
	
	
//	@BeforeTest 
//	public void signup() {
//		String payload = "{\n"
//				+ "    \"user\": {\n"
//				+ "        \"first_name\": \"Testlas4\",\n"
//				+ "        \"last_name\": \"\",\n"
//				+ "        \"email\": \"Testlas4@gmail.com\",\n"
//				+ "        \"password\": \"Testlas3\",\n"
//				+ "        \"phone_number\": \"+62-8532431415\",\n"
//				+ "        \"user_type\": \"User\",\n"
//				+ "        \"currency_id\": 10\n"
//				+ "    }\n"
//				+ "}";
		
//		Response signUpJsonSpec = given().spec(CommonJsonSpec).body(payload).when().post("/users");


//	}
}
