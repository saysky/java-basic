package behavior.command.demo.ftp;

public class ImpDeleteFileCommand implements InfCommand {
    private FtpServer receive = null;

    private String status;

    public ImpDeleteFileCommand(final FtpServer receive) {
        this.receive = receive;
    }

    @Override
    public void execute() {
        this.receive.delete();
    }

}
