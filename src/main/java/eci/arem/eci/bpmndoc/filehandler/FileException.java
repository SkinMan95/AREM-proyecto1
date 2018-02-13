package eci.arem.eci.bpmndoc.filehandler;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class FileException extends Exception{
    
    private static final long serialVersionUID = 5165432135465L;
    
    public FileException() {
    }

    public FileException(String message) {
        super(message);
    }

    public FileException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileException(Throwable cause) {
        super(cause);
    }
    
}
