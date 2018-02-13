package eci.arem.eci.bpmndoc.OutputGenerator.implementation;

import eci.arem.eci.bpmndoc.OutputGenerator.OutputGenerator;
import eci.arem.eci.bpmndoc.OutputGenerator.OutputGeneratorException;
import eci.arem.eci.bpmndoc.element.Element;
import java.util.Stack;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class DummyOutputGenerator implements OutputGenerator {

    @Override
    public String getFormatedOutput(Element root) throws OutputGeneratorException {
        StringBuilder r = new StringBuilder();
        
        Stack<Element> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()) {
            Element u = s.pop();
            r.append(u.toString()).append("\n");
            for (Element v : u.getSubElements()) {
                s.push(v);
            }
        }
        
        return r.toString();
    }

    @Override
    public String getFilenameExtension() {
        return "html";
    }
    
}
