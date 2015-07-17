package agentsystem.core.xml;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.StringWriter;
import java.util.Map;

public abstract class XmlBase {

    private static final Namespace XS = Namespace.getNamespace("xs", "http://www.w3.org/2001/XMLSchema");

    public abstract String getRootElement();

    public abstract Map<String, String> getSubElements();

    public String generateXmlDocument() {

        Element root = new Element(getRootElement());
        Document doc = new Document(root);
        doc.setRootElement(root);

        for(Map.Entry<String, String> element: getSubElements().entrySet()){
            Element attributeUsername = new Element("attribute", XS);
            attributeUsername.setAttribute("name", element.getKey());
            attributeUsername.setText(element.getValue());
            root.addContent(attributeUsername);
        }

        try{
            XMLOutputter xmlOutput = new XMLOutputter();

            // display nice nice
            xmlOutput.setFormat(Format.getPrettyFormat());
            StringWriter stringWriter = new StringWriter();

            xmlOutput.output(doc, stringWriter);

            return stringWriter.toString();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
