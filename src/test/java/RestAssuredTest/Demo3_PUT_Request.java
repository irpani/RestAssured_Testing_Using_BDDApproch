package RestAssuredTest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo3_PUT_Request {

	public static HashMap<String, String> map = new HashMap<String, String>();

	String emplName = RestUtils.getempName();
	String emplAge = RestUtils.getempAge();
	String emplSalary = RestUtils.getempsalary();
	int emp_id = 3526134;

	@BeforeClass
	public void putData() {

		map.put("name", emplName);
		map.put("age", emplAge);
		map.put("salary", emplSalary);

		RestAssured.baseURI = "https://gorest.co.in/public/v1/users";
		RestAssured.basePath = "/update/" + emp_id;
	}

	@Test
	public void testPut() {

		given().contentType("application/json").body(map).when().put().then() // here we can do validations
				.statusCode(200).log().all();

	}

}
