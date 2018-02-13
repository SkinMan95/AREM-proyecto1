package eci.arem.eci.bpmndoc.filehandler.implementation;

import eci.arem.eci.bpmndoc.filehandler.FileException;
import eci.arem.eci.bpmndoc.filehandler.FileWriter;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class SimpleFileWriter implements FileWriter {

    @Override
    public void writeData(String filename, boolean overwrite, String data) throws FileException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
