package eci.arem.eci.bpmndoc.element.implementation;

import eci.arem.eci.bpmndoc.element.Element;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class BPMNElement implements Element {

    private final List<BPMNElement> subElements;
    private final String name;
    private final String type;
    private final String documentation;

    public BPMNElement(String name, String type, String doc) {
        this.name = name;
        this.type = type;
        this.documentation = doc;

        subElements = new ArrayList<>();
    }

    public void addSubElement(BPMNElement newElement) {
        subElements.add(newElement);
    }

    @Override
    public List<Element> getSubElements() {
        return new ArrayList<>(subElements);
    }

    @Override
    public String getTypeName() {
        return type;
    }

    @Override
    public String getDocumentation() {
        return documentation;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BPMNElement{"
                + "name=" + name
                + ", type=" + type
                + ", documentation=" + documentation
                + ", size=" + subElements.size() + '}';
    }

}
