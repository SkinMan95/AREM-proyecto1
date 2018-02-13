package eci.arem.eci.bpmndoc.element;

import java.util.List;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public interface Element {

    /**
     * Gets all the sub elements of the current element
     *
     * @return list of the sub elements of the current element
     */
    List<Element> getSubElements();

    /**
     * Gets the type of element
     *
     * @return string with type of element
     */
    String getTypeName();

    /**
     * Gets the documentation for the current element
     *
     * @return string with the documentation of the current element
     */
    String getDocumentation();

    /**
     * Gets the name of the current element
     *
     * @return string with the name of the current element
     */
    String getName();
}
