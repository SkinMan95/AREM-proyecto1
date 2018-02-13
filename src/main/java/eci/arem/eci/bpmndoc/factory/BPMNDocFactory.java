package eci.arem.eci.bpmndoc.factory;

import eci.arem.eci.bpmndoc.OutputGenerator.OutputGenerator;
import eci.arem.eci.bpmndoc.bpmnparser.BPMNParser;
import eci.arem.eci.bpmndoc.filehandler.AbstractFileWriter;
import eci.arem.eci.bpmndoc.filehandler.AbstractFileReader;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public interface BPMNDocFactory {
    
    AbstractFileReader getFileReader();
    
    AbstractFileWriter getFileWriter();
    
    OutputGenerator getOutputGenerator();
    
    BPMNParser getBPMNParser();
    
}
