package RestAssuredTest;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	// These static methods we call directly ith class name
	public static String getFirstName() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return ("Jim" + generatedString);
	}

	public static String getLastName() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Brown" + generatedString);
	}

	public static String getTotalPrice() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("totalprice" + generatedString);
	}

	public static String depositpaid() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("depositpaid" + generatedString);
	}

	public static String getCheckIn() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("bookingdates-checkin" + generatedString);
	}

	public static String getCheckOut() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("bookingdates-checkout" + generatedString);
	}

	public static String getadditinalNeeds() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("additionalneeds" + generatedString);
	}

	public static String getempName() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return ("bookingdates-checkin" + generatedString);
	}

	public static String getempsalary() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return ("bookingdates-checkout" + generatedString);
	}

	public static String getempAge() {
		String generatedString = RandomStringUtils.randomAlphabetic(2);
		return ("additionalneeds" + generatedString);
	}

}
