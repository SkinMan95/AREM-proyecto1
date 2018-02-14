package eci.arem.eci.bpmndoc.bpmnparser.implementation;

import eci.arem.eci.bpmndoc.bpmnparser.BPMNParser;
import eci.arem.eci.bpmndoc.bpmnparser.BPMNParserException;
import eci.arem.eci.bpmndoc.element.Element;
import eci.arem.eci.bpmndoc.element.implementation.BPMNElement;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class BasicBPMNParser implements BPMNParser {

    @Override
    public Element getRootElement(String src) throws BPMNParserException {
        if (src == null) {
            throw new BPMNParserException("The xml source is null!");
        }

        Element result;

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(src));
            Document document = builder.parse(is);
            document.getDocumentElement().normalize();
            result = explore(document.getDocumentElement());
            //System.out.println(result);
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            throw new BPMNParserException(ex);
        }

        assert result != null;
        return result;
    }

    private BPMNElement explore(org.w3c.dom.Element root) {
        assert root != null : "The root element can't be null";
        
        BPMNElement res = null;

        String name = root.getAttribute("name");
        String type = root.getTagName().replace("model:", "");
        String doc = getElementDocumentation(root);

        NodeList l = root.getChildNodes();

        List<BPMNElement> list = new ArrayList<>();
        for (int i = 0; i < l.getLength(); i++) {
            Node n = l.item(i);
            if (n.getNodeType() == Node.ELEMENT_NODE) {
                org.w3c.dom.Element el = (org.w3c.dom.Element) n;
                
                BPMNElement actual = explore(el);
                
                if (actual != null) {
                    list.add(actual);
                }
            }
        }

        if (doc != null || !list.isEmpty()) {
            res = new BPMNElement(name, type, doc == null ? "" : doc);
            
            for (BPMNElement element : list) {
                res.addSubElement(element);
            }
        }
        
        //System.out.println(res);
        
        return res;
    }

    private String getElementDocumentation(org.w3c.dom.Element e) {
        NodeList l = e.getChildNodes();
        String ans = null;
        for (int i = 0; i < l.getLength(); i++) {
            Node n = l.item(i);
            if (n.getNodeType() == Node.ELEMENT_NODE) {
                org.w3c.dom.Element el = (org.w3c.dom.Element) n;
                //System.out.println("'" + el.getTagName() + "'");
                if (el.getTagName() == "model:documentation") {
                    assert ans == null : "more than one documentation tag";
                    ans = el.getTextContent();
                    //System.out.println(">>'" + el.getTextContent()+ "'");
                }
            }
        }

        return ans;
    }

}
