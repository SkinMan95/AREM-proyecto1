package eci.arem.eci.bpmndoc.OutputGenerator;

import eci.arem.eci.bpmndoc.element.Element;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public interface OutputGenerator {

    /**
     * Gets the formatted output of the information given in the elements
     *
     * @param root element of the element's tree
     * @return string with the contents to be outputed in a file
     *
     * @throws OutputGeneratorException if an internal exception occurs
     */
    String getFormatedOutput(Element root) throws OutputGeneratorException;

    /**
     * Gets the filename extension to be put in the output file
     *
     * @return the filename extension
     */
    String getFilenameExtension();

}
