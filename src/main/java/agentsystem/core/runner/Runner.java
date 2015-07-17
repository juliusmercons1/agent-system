package agentsystem.core.runner;

import agentsystem.core.xml.LoginRequest;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

import java.io.StringReader;

public class Runner {

    public static void main(String[] args) throws Exception{
        parseXmlDocument();
    }

    public static void createXmlDocument() throws Exception{
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername("username");
        loginRequest.setPassword("password");
        loginRequest.setCaptcha("123456789");
        loginRequest.setSessionId("sessionId");

        System.out.println(loginRequest.generateXmlDocument());

    }

    public static void parseXmlDocument() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><PROCESS_TRXN>" +
                "<xs:attribute xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" name=\"resp_code\" type=\"xs:string\" use=\"required\"/>" +
                "<xs:attribute xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" name=\"error_desc\" type=\"xs:string\" use=\"required\"/>" +
                "<xs:attribute xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" name=\"process_type\" type=\"xs:string\" use=\"required\"/>" +
                "<xs:attribute xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" name=\"reserve1\" type=\"xs:string\" use=\" optional \"/>" +
                "<xs:attribute xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" name=\"reserve2\" type=\"xs:string\" use=\" optional \"/>" +
                "</PROCESS_TRXN >";
        StringReader stringReader = new StringReader(xml);
        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(stringReader);

        Element root = doc.getRootElement();
        System.out.println(root.getName());
    }
}
