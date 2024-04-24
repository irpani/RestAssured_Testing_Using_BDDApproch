package RestAssuredTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

/*
 * 
 * In this class we will focus on JSON Response
(1).Test Status code
(2).Log response
(3).Verifying Single conent in response body
(4).Verifying multiple conent in response body
(5).Setting parameter and  Header
 * 
 */

public class Demo5_BasicValidations_JSONResponse {
	// Here we mainly focus on json response ...
	// (1). *****Status code Validation*****

	@Test(priority = 1)
	public void testStatusCode() {

		given().when().get("https://jsonplaceholder.typicode.com/posts/5").then().statusCode(200).log().all();
		// log.all --> will help us to get all logger Information for the response
	}

	// ****logger response*****
	// (2). log.all --> will help us to get all logger Information for the response
	@Test(priority = 2)
	public void logResponse() {

		given().when().get("https://jsonplaceholder.typicode.com/posts/1").then().statusCode(200).log().all();

	}

	// *****Verifying Single conent in response body******

	@Test(priority = 3)
	public void testSingleContent() {

		given().when().get("https://jsonplaceholder.typicode.com/posts/4").then().statusCode(200).body(".title",
				equalTo("eum et est occaecati"));

	}

	// *****Verifying Multiple conent in response body******
	@Test(priority = 4)
	public void testMultipleContent() {

		// given().when().get("http://services.groupkt.com/country/get/iso2code/IN").then().statusCode(200)
		// .body("RestResponse.result.name", hasItems("India", "Australia", "united
		// states of america"));

	}

	// *****Setting parameter and Header******
	@Test(priority = 3)
	public void testParamHeader() {

		given().param("MyName", "paven").header("Myhesder", "Indian").when()
				.get("https://jsonplaceholder.typicode.com/posts/4").then().statusCode(200)
				.body(".title", equalTo("eum et est occaecati"));

	}

}
