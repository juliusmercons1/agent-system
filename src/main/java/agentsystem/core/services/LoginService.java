package agentsystem.core.services;

public class LoginService {

	public boolean authenticateLogin(String userName, String userPassword, String userCode){
		boolean isAccountValid = false;
		FieldValidatorService fvalidator = new FieldValidatorService();
		
		/*//Text Field Validators
		if (userName != null && userName.trim() != "" ){
			if (userPassword != null && userPassword.trim() != "" ){
				if (userCode != null && userCode.trim() != "" ){
					isAccountValid = true;
				} 
			} 
		}*/
		
		if(fvalidator.isTextFieldValid(userName)){
			if(fvalidator.isTextFieldValid(userName)){
				if(fvalidator.isTextFieldValid(userName)){
					isAccountValid = true;
				}
			}
		}
		
		//TODO: Change return depending on the XML reply, change to Agent Object.
		return isAccountValid;
	}
}
