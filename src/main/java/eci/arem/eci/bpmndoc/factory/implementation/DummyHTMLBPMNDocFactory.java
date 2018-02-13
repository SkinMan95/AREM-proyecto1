package eci.arem.eci.bpmndoc.factory.implementation;

import eci.arem.eci.bpmndoc.OutputGenerator.OutputGenerator;
import eci.arem.eci.bpmndoc.OutputGenerator.implementation.DummyOutputGenerator;
import eci.arem.eci.bpmndoc.OutputGenerator.implementation.HTMLOutputGenerator;
import eci.arem.eci.bpmndoc.bpmnparser.BPMNParser;
import eci.arem.eci.bpmndoc.bpmnparser.implementation.BasicBPMNParser;
import eci.arem.eci.bpmndoc.factory.BPMNDocFactory;
import eci.arem.eci.bpmndoc.filehandler.implementation.DummyFileReader;
import eci.arem.eci.bpmndoc.filehandler.implementation.DummyFileWriter;
import eci.arem.eci.bpmndoc.filehandler.AbstractFileWriter;
import eci.arem.eci.bpmndoc.filehandler.AbstractFileReader;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class DummyHTMLBPMNDocFactory implements BPMNDocFactory {
    
    @Override
    public AbstractFileReader getFileReader() {
        return new DummyFileReader();
    }

    @Override
    public AbstractFileWriter getFileWriter() {
        return new DummyFileWriter();
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
