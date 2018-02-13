package eci.arem.eci.bpmndoc.filehandler.implementation;

import eci.arem.eci.bpmndoc.filehandler.FileException;
import eci.arem.eci.bpmndoc.filehandler.AbstractFileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class SimpleFileWriter implements AbstractFileWriter {

    @Override
    public void writeData(String filename, boolean overwrite, String data) throws FileException {
        assert data != null : "data is null";
        assert filename != null : "filename is null";
        
        System.out.println("Writing to file: " + filename);
        try {
            File f = new File(filename);
            
            if (f.exists() && !overwrite) {
                throw new FileException("File already exists, and is not set to overwrite");
            }
            
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename, overwrite));
            
            bufferedWriter.write(data);
            
            bufferedWriter.close();
        } catch (IOException ex) {
            throw new FileException(ex);
        }
    }
    
}
