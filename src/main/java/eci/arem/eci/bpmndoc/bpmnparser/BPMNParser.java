package eci.arem.eci.bpmndoc.bpmnparser;

import eci.arem.eci.bpmndoc.element.Element;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public interface BPMNParser {

    /**
     * Gets the root element of the element's tree
     * 
     * @param src file's source code
     *
     * @return the root element
     * @throws BPMNParserException if the source's text was not set
     */
    Element getRootElement(String src) throws BPMNParserException;
}
