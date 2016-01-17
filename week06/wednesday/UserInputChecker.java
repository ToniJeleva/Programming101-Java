package wednesday;

public class UserInputChecker {

	interface Validator {
		public void validate(String input);
	}

	class PersonNameValidator implements Validator {

		@Override
		public void validate(String input) {
			if (input.length() < 0) {
				throw new IllegalArgumentException("The name is invalid.");
			}
		}

		class BulgarianPhoneNumberValidator implements Validator {

			@Override
			public void validate(String input) {
				if (input.length() >= 8 && input.substring(0, 4).equals("+359")) {
					throw new IllegalArgumentException("Invalid PhoneNumber");
				}
			}

		}

		/*
		 * class PersonAgeValidator implements Validator {
		 * 
		 * @Override public boolean validate(String input) { if
		 * (Integer.parseInt(input) > 0 || Integer.parseInt(input) < 120) {
		 * return true; } return false; }
		 */

	}

	public static void main(String[] args) {
		String test = "884";
		UserInputChecker checker = new UserInputChecker();
		UserInputChecker.PersonNameValidator val = checker.new PersonNameValidator();
		val.validate(test);

	}

}
