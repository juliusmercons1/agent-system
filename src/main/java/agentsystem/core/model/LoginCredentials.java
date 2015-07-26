package agentsystem.core.model;

public class LoginCredentials {

    private String username;
    private String password;
    private String captcha;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LoginCredentials");
        sb.append("{username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", captcha='").append(captcha).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
