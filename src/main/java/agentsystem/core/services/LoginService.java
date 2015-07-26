package agentsystem.core.services;

import agentsystem.core.constants.Constants;
import agentsystem.core.model.CurrentUser;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service("loginService")
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

    public CurrentUser getCurrentUser(HttpSession httpSession) {
        Object user = httpSession.getAttribute(Constants.LOGGED_IN_USER);
        if(user != null) {
            return (CurrentUser)user;
        }
        return null;
    }

    public void setCurrentUser(CurrentUser currentUser, HttpSession httpSession) {
        httpSession.setAttribute(Constants.LOGGED_IN_USER, currentUser);
    }
}
