import org.apache.commons.cli.CommandLine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CliTest {
    @Test
    public void it_will_take_the_args_from_cmd_line_and_process_the_file_and_options(){
        String [] args = {"-fl","./data/records"};
        Cli cli = new Cli(args);
        CommandLine cmds = cli.parse();
        assertTrue(cmds.hasOption("fl"));

    }
    @Test
    public void it_will_take_the_args_from_cmd_line_and_process_the_file_it_will_show_the_file(){
        String [] args = {"-nc","./data/records","./data/records"};
        Cli cli = new Cli(args);
        CommandLine cmds = cli.parse();
        String[] files = cmds.getArgs();
        assertEquals("./data/records",files[0]);
        assertEquals("./data/records",files[1]);

    }
    @Test
    public void it_will_take_the_args_from_cmd_line_and_process_the_file_it_will_show_more_than_files(){
        String [] args = {"-nc","./data/records"};
        Cli cli = new Cli(args);
        CommandLine cmds = cli.parse();
        String[] files = cmds.getArgs();
        assertEquals(files[0],"./data/records");
        assertTrue(cmds.hasOption("nc"));

    }
    @Test
    public void it_will_take_the_args_from_cmd_line_and_process_more_than_one_options(){
        String [] args = {"-nc","-fl","-lf","./data/records"};
        Cli cli = new Cli(args);
        CommandLine cmds = cli.parse();
        assertTrue(cmds.hasOption("nc"));
        assertTrue(cmds.hasOption("lf"));
        assertTrue(cmds.hasOption("fl"));

    }
}
