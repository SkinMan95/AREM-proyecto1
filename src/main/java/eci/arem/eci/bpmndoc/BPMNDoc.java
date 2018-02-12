package eci.arem.eci.bpmndoc;

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
                .desc("source XML file to process")
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
            
            System.out.println(line.getOptionValue("src"));

        } catch (ParseException exp) {
            System.out.println("Unexpected exception:\n" + exp.getMessage());
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("java -jar bpmndoc.jar -src <xml bpmn file> "
                    + "[-dst <destination_folder>]", options);
        }
    }

}
