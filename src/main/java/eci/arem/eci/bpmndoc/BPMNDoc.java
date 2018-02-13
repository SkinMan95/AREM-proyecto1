package eci.arem.eci.bpmndoc;

import eci.arem.eci.bpmndoc.OutputGenerator.OutputGenerator;
import eci.arem.eci.bpmndoc.OutputGenerator.OutputGeneratorException;
import eci.arem.eci.bpmndoc.bpmnparser.BPMNParser;
import eci.arem.eci.bpmndoc.bpmnparser.BPMNParserException;
import eci.arem.eci.bpmndoc.element.Element;
import eci.arem.eci.bpmndoc.factory.BPMNDocFactory;
import eci.arem.eci.bpmndoc.factory.implementation.DummyBPMNDocFactory;
import eci.arem.eci.bpmndoc.filehandler.FileException;
import eci.arem.eci.bpmndoc.filehandler.FileReader;
import eci.arem.eci.bpmndoc.filehandler.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Main class
 */
public class BPMNDoc {

    private static Options getOptions() {
        Options options = new Options();

        options.addOption(Option.builder("src")
                .required()
                .longOpt("source")
                .hasArg()
                .desc("source XML BPMN from Bonita Software file to process")
                .build());

        options.addOption(Option.builder("dst")
                .longOpt("destination")
                .desc("destination of the generated BPMNDoc file")
                .hasArg()
                .required(false)
                .build());

        // TODO hacer gui
//        options.addOption(Option.builder()
//                .longOpt("gui")
//                .desc("launches with gui")
//                .build());
        return options;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CommandLineParser parser = new DefaultParser();

        Options options = BPMNDoc.getOptions();

        try {
            CommandLine line = parser.parse(options, args);

            //System.out.println(line.getOptionValue("src"));
            execute(line.getOptionValue("src"), "TODO");

        } catch (ParseException exp) {
            System.out.println("Unexpected exception:\n" + exp.getMessage());
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("java -jar bpmndoc.jar -src <xml bpmn file> "
                    + "[-dst <destination_folder>]", options);
        }
    }

    private static void execute(String src, String dst) {

        BPMNDocFactory factory = new DummyBPMNDocFactory();

        FileReader fr = factory.getFileReader();
        FileWriter fw = factory.getFileWriter();
        OutputGenerator og = factory.getOutputGenerator();
        BPMNParser par = factory.getBPMNParser();

        try {
            String data = fr.getText(src);
            Element root = par.getRootElement(data);
            String out = og.getFormatedOutput(root);
            fw.writeData(dst, false, out);
        } catch (FileException ex) {
            Logger.getLogger(BPMNDoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BPMNParserException ex) {
            Logger.getLogger(BPMNDoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (OutputGeneratorException ex) {
            Logger.getLogger(BPMNDoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
