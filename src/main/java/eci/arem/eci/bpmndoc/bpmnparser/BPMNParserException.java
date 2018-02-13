package eci.arem.eci.bpmndoc.bpmnparser;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class BPMNParserException extends Exception {

    private static final long serialVersionUID = 3164351351L;

    public BPMNParserException() {
    }

    public BPMNParserException(String message) {
        super(message);
    }

    public BPMNParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public BPMNParserException(Throwable cause) {
        super(cause);
    }
}
