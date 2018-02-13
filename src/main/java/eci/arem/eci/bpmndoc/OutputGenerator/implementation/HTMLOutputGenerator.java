package eci.arem.eci.bpmndoc.OutputGenerator.implementation;

import eci.arem.eci.bpmndoc.OutputGenerator.OutputGenerator;
import eci.arem.eci.bpmndoc.OutputGenerator.OutputGeneratorException;
import eci.arem.eci.bpmndoc.element.Element;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class HTMLOutputGenerator implements OutputGenerator {

    @Override
    public String getFormatedOutput(Element root) throws OutputGeneratorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFilenameExtension() {
        return "html";
    }

}
