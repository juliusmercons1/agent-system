package agentsystem.core.xml;

import org.jdom.Element;

import javax.xml.bind.annotation.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LoginRequest extends XmlBase{

    private String username;
    private String password;
    private String captcha;
    private String sessionId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public String getRootElement() {
        return "AGENT_LOGIN";
    }

    @Override
    public Map<String, String> getSubElements() {
        Map<String, String> elements = new LinkedHashMap<String, String>();
        elements.put("username", username);
        elements.put("password", password);
        elements.put("captcha", captcha);
        elements.put("session_id", sessionId);
        return elements;
    }
}
