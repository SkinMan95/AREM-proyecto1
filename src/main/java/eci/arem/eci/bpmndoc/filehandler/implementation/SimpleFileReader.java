package eci.arem.eci.bpmndoc.filehandler.implementation;

import eci.arem.eci.bpmndoc.filehandler.FileException;
import eci.arem.eci.bpmndoc.filehandler.AbstractFileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class SimpleFileReader implements AbstractFileReader {

    @Override
    public String getText(String filename) throws FileException {
        StringBuilder result = new StringBuilder();

        System.out.println("Opening file: " + filename);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

            System.out.println("Reading file: " + filename);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.append(line).append("\n");
            }

            bufferedReader.close();
        } catch (IOException ex) {
            throw new FileException(ex);
        }
        System.out.println("File: " + filename + " closed.");

        return result.toString();
    }

}
