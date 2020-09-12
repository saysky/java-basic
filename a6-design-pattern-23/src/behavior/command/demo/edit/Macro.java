package behavior.command.demo.edit;

import java.util.ArrayList;
import java.util.List;

class Macro {
    private List<DocumentCommand> myCommands;

    public Macro() {
        myCommands = new ArrayList();
    }

    public void addCommand(DocumentCommand dc) {
        myCommands.add(dc);
    }

    public void removeCommand(DocumentCommand dc) {
        myCommands.remove(dc);
    }

    public void execute() {
        for (DocumentCommand dc : myCommands) {
            dc.execute();
        }
    }
}
