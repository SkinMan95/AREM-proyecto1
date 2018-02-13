package eci.arem.eci.bpmndoc.factory;

import eci.arem.eci.bpmndoc.OutputGenerator.OutputGenerator;
import eci.arem.eci.bpmndoc.bpmnparser.BPMNParser;
import eci.arem.eci.bpmndoc.filehandler.FileReader;
import eci.arem.eci.bpmndoc.filehandler.FileWriter;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public interface BPMNDocFactory {
    
    FileReader getFileReader();
    
    FileWriter getFileWriter();
    
    OutputGenerator getOutputGenerator();
    
    BPMNParser getBPMNParser();
    
}
