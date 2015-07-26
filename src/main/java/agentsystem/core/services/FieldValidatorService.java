package agentsystem.core.services;

public class FieldValidatorService {

	/**
	 * Validates that basic input text is not null or empty space.
	 * @param inputField
	 * @return
	 */
	public boolean isTextFieldValid(String inputField){
		boolean isAccountValid = false;
		if (inputField != null && inputField.trim() != "" ){
			return true;
		} 
		return isAccountValid;
	}
	
}
