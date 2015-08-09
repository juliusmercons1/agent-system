package agentsystem.core.controller;

import agentsystem.core.model.CurrentUser;
import agentsystem.core.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String redirectToHomePage(HttpSession httpSession) {
        CurrentUser currentUser = loginService.getCurrentUser(httpSession);
        if(currentUser != null) {
            return "redirect:/home";
        } else {
            return "redirect:/login";
        }
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage(ModelMap model, HttpSession httpSession){
        CurrentUser currentUser = loginService.getCurrentUser(httpSession);
        List<String> players = new ArrayList<String>();
        players.add("player1");
        players.add("player2");
        model.put("currentUser", currentUser);
        model.put("players", players);
        return "home/homepage";
    }
}
