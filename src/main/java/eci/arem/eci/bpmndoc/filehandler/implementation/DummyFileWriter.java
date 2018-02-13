package eci.arem.eci.bpmndoc.filehandler.implementation;

import eci.arem.eci.bpmndoc.filehandler.FileException;
import eci.arem.eci.bpmndoc.filehandler.AbstractFileWriter;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class DummyFileWriter implements AbstractFileWriter {

    @Override
    public void writeData(String filename, boolean overwrite, String data) throws FileException {
        System.out.println("Filename: " + filename
                + "\nOverwrite: " + overwrite
                + "\nData:\n" + data);
    }

}
