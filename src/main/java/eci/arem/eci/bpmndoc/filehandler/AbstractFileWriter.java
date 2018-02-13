package eci.arem.eci.bpmndoc.filehandler;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public interface AbstractFileWriter {

    /**
     * Writes the data to the specified
     *
     * @param filename file name to write
     * @param overwrite set to overwrite if the file already exists
     * @param data to be writen in file
     *
     * @throws FileException if file exists and is not set to overwrite or if
     * there's an error writing
     */
    void writeData(String filename, boolean overwrite, String data) throws FileException;

}
