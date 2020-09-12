package behavior.command.demo.ftp;

/*
 一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；
 对请求排队或记录请求日志，以及支持可撤销的操作。
 */
public class Run {


    public static void main(final String[] args) {
        final FtpServer receiver = new FtpServer();
        final InfCommand command = new ImpDeleteFileCommand(receiver);

        final FtpClient client = new FtpClient();
        client.setCommand(command);
        client.runCommand();
    }
}
