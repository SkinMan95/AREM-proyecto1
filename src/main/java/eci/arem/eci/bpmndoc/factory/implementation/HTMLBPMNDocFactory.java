package eci.arem.eci.bpmndoc.factory.implementation;

import eci.arem.eci.bpmndoc.OutputGenerator.OutputGenerator;
import eci.arem.eci.bpmndoc.OutputGenerator.implementation.HTMLOutputGenerator;
import eci.arem.eci.bpmndoc.bpmnparser.BPMNParser;
import eci.arem.eci.bpmndoc.bpmnparser.implementation.BasicBPMNParser;
import eci.arem.eci.bpmndoc.factory.BPMNDocFactory;
import eci.arem.eci.bpmndoc.filehandler.AbstractFileWriter;
import eci.arem.eci.bpmndoc.filehandler.AbstractFileReader;
import eci.arem.eci.bpmndoc.filehandler.implementation.SimpleFileReader;
import eci.arem.eci.bpmndoc.filehandler.implementation.SimpleFileWriter;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class HTMLBPMNDocFactory implements BPMNDocFactory {
    
    @Override
    public AbstractFileReader getFileReader() {
        return new SimpleFileReader();
    }

    @Override
    public AbstractFileWriter getFileWriter() {
        return new SimpleFileWriter();
    }

    @Override
    public OutputGenerator getOutputGenerator() {
        return new HTMLOutputGenerator();
    }

    @Override
    public BPMNParser getBPMNParser() {
        return new BasicBPMNParser();
    }
    
}
