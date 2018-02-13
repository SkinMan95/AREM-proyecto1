package eci.arem.eci.bpmndoc.filehandler;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public interface FileReader {

    /**
     * Reads the file previously specified and returns it's contents as a string
     *
     * @param filename of the file to be read
     * 
     * @return string with file contents
     * @throws FileException if the file does not exists or an error while reading the file
     */
    String getText(String filename) throws FileException;
}
