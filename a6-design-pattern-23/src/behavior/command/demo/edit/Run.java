package behavior.command.demo.edit;

/**
 * Macro是客户端进行调用，
 * document 是具体实现即(Receiver 接收者类)：
 *
 * @author liuyanzhao
 */
public class Run {
    public static void main(String[] args) {
        Document doc = new Document();
        Macro myMacro = new Macro();
        myMacro.addCommand(new OpenCommand(doc));
        myMacro.addCommand(new CopyCommand(doc));
        myMacro.addCommand(new PasteCommand(doc));
        DocumentCommand cc = new CloseCommand(doc);
        myMacro.addCommand(cc);
        myMacro.execute();

        System.out.println("------------------------------");
        myMacro.removeCommand(cc);
        myMacro.execute();

    }
}
