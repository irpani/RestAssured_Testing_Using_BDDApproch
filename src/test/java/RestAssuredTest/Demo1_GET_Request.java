package RestAssuredTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class Demo1_GET_Request {

	@Test
	public void page2Details() {

		given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).statusLine("HTTP/1.1 200 OK")
				.assertThat().body("page", equalTo(2)).assertThat().body("total", equalTo(12)).assertThat()
				.body("total_pages", equalTo(2));

	}

}
