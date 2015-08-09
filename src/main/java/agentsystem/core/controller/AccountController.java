package agentsystem.core.controller;

import agentsystem.core.model.CurrentUser;
import agentsystem.core.model.LoginCredentials;
import agentsystem.core.services.LoginService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class AccountController {

    private static final Logger LOGGER = Logger.getLogger(AccountController.class);

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public String showAccountPage() {
        return "account/accountDetails";
    }

    @RequestMapping(value = "/account", method = RequestMethod.POST)
    public String showEditAccountPage(@ModelAttribute LoginCredentials loginCredentials, HttpSession httpSession){
    	return "account/editAccountDetails";
    }
}
