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
public class LoginController {

    private static final Logger LOGGER = Logger.getLogger(LoginController.class);

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage() {
        return "login/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String processLogin(@ModelAttribute LoginCredentials loginCredentials, HttpSession httpSession){
        LOGGER.info("credentials: " + loginCredentials);
        CurrentUser currentUser = new CurrentUser();
        currentUser.setSessionId("1234567890");
        loginService.setCurrentUser(currentUser, httpSession);
        return "redirect:/home";
    }
}
