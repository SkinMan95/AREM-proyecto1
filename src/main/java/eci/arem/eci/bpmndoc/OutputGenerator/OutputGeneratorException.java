package eci.arem.eci.bpmndoc.OutputGenerator;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class OutputGeneratorException extends Exception {

    private static final long serialVersionUID = 3164351351L;

    public OutputGeneratorException() {
    }

    public OutputGeneratorException(String message) {
        super(message);
    }

    public OutputGeneratorException(String message, Throwable cause) {
        super(message, cause);
    }

    public OutputGeneratorException(Throwable cause) {
        super(cause);
    }
}
