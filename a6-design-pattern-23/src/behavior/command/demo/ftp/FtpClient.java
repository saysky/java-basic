package behavior.command.demo.ftp;

public class FtpClient {
    private InfCommand command = null;

    public InfCommand getCommand() {
        return command;
    }

    public void setCommand(final InfCommand command) {
        this.command = command;
    }

    public void runCommand() {
        this.command.execute();
    }
}
