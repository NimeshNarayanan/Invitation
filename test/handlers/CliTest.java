package handlers;
import handlers.Cli;
import org.apache.commons.cli.CommandLine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CliTest {
    @Test
    public void it_will_take_the_args_from_cmd_line_and_process_the_file_and_options(){
        String [] args = {"-f","./data/records"};
        Cli cli = new Cli(args);
        CommandLine cmds = cli.parse();
        assertTrue(cmds.hasOption("f"));

    }
    @Test
    public void it_will_take_the_args_from_cmd_line_and_process_the_file_it_will_show_the_file(){
        String [] args = {"-c","bangladesh","./data/records"};
        Cli cli = new Cli(args);
        CommandLine cmds = cli.parse();
        String[] files = cmds.getArgs();
        assertEquals("./data/records",files[0]);

    }
    @Test
    public void it_will_take_the_args_from_cmd_line_and_process_the_file_it_will_show_more_than_files(){
        String [] args = {"-f","./data/records"};
        Cli cli = new Cli(args);
        CommandLine cmds = cli.parse();
        String[] files = cmds.getArgs();
        assertEquals(files[0],"./data/records");
        assertTrue(cmds.hasOption("f"));

    }

    @Test
    public void it_will_take_the_args_from_cmd_line_and_process_more_than_one_options(){
        String [] args = {"-c","bangladesh","-f","-l","./data/records"};
        Cli cli = new Cli(args);
        CommandLine cmds = cli.parse();
        assertTrue(cmds.hasOption("c"));
        assertTrue(cmds.hasOption("l"));
        assertTrue(cmds.hasOption("f"));

    }
}
