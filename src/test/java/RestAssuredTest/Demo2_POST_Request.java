package RestAssuredTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo2_POST_Request {

	// I need to prepare the data which I need to sent to the Server
	// To prepare testdata I don't want to hardcode so what I will do is
	// I created one class for Random data

	public static HashMap<String, String> map = new HashMap<String, String>();

	@BeforeClass
	public void postData() {
		map.put("firstname", RestUtils.getFirstName());
		map.put("lastname", RestUtils.getLastName());
		map.put("totalprice", RestUtils.getTotalPrice());
		map.put("checkin", RestUtils.getCheckIn());
		map.put("checkout", RestUtils.getCheckOut());
		map.put("additionalneeds", RestUtils.getadditinalNeeds());

		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		RestAssured.basePath = "/booking";
	}

	@Test
	public void testPost() {

		given()
				// here we specify the prerequisite the type of data we are posting and Body Of
				// the data

				.contentType("application/json").body(map)

				.when().post()

				.then() // here we can do validations
				.statusCode(201).body("successCode", equalTo("OPERATION_SUCCESS"))
				.body("message", equalTo("Operation Compleetd Successfully"));

	}
}
