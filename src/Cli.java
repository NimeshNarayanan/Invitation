
import org.apache.commons.cli.*;

public class Cli {
    private String[] args = null;
    private Options options = new Options();

    public Cli(String[] args) {

        this.args = args;

        options.addOption("h", "help", false, "Show help");
        options.addOption("fl", "char", false, "First last name");
        options.addOption("lf", "char", false, "Last first name");
        options.addOption("nc", "char", false, "Name with Country");

    }

    public CommandLine parse() {

        CommandLineParser parser = new BasicParser();

        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            help();
        }
        return cmd;
    }

    private void help() {
        // This prints out some help
        HelpFormatter formater = new HelpFormatter();

        formater.printHelp("Invitation", options);
        System.exit(0);
    }
}