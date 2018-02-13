package eci.arem.eci.bpmndoc.OutputGenerator.implementation;

import eci.arem.eci.bpmndoc.OutputGenerator.OutputGenerator;
import eci.arem.eci.bpmndoc.OutputGenerator.OutputGeneratorException;
import eci.arem.eci.bpmndoc.element.Element;
import eci.arem.eci.bpmndoc.factory.stylesfactory.StylesFactory;
import java.util.List;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class HTMLOutputGenerator implements OutputGenerator {

    @Override
    public String getFormatedOutput(Element root) throws OutputGeneratorException {
        StringBuilder res = new StringBuilder();

        res.append(generateHeader());

        res.append("<ol>");
        res.append(generateOutput(root, 0));
        res.append("</ol>");

        res.append(generateEnd());
        return res.toString();
    }

    private StringBuilder generateOutput(Element e, int level) {
        StringBuilder res = new StringBuilder();

        level = Math.min(level, 6);

        if (level != 0 && !e.getName().equals("")) {
            res.append("<h" + level + "><li>" + genElementFormat(e));
        } else if (level != 0) {
            level--;
        }

        List<Element> list = e.getSubElements();
        if (!list.isEmpty()) {
            res.append("<ol>");
            for (Element element : list) {
                res.append(generateOutput(element, level + 1));
            }
            res.append("</ol>");
        }

        if (level != 0 && !e.getName().equals("")) {
            res.append("</li></h" + level + ">");
        }

        return res;
    }

    private StringBuilder genElementFormat(Element e) {
        if (e.getName().equals("")) {
            return new StringBuilder("");
        }

        StringBuilder s = new StringBuilder(e.getName() + " (" + e.getTypeName() + ")");
        if (e.getDocumentation() != "") {
            s.append("<br /><p>").append(e.getDocumentation()).append("</p>");
        }
        return s;
    }

    private String generateHeader() {
        String s = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "  <head>\n"
                + "    <meta charset=\"utf-8\" />\n"
                + "    <title>BPMN Documentation</title>\n"
                + "    <style>\n"
                + StylesFactory.getCSSStyles()
                + "    </style>\n"
                + "  </head>\n"
                + "  <body>\n"
                + "    <div class=\"contenedor\">"
                + "       <h1 class=\"title\">BPMN Documentation</h1>";

        return s;
    }

    private String generateEnd() {
        return "</div>\n"
                + "  </body>\n"
                + "</html>";
    }

    @Override
    public String getFilenameExtension() {
        return "html";
    }

}
