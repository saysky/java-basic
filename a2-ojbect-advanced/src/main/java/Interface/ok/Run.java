package Interface.ok;


/**
 * @author liuyanzhao
 */
public class Run {

    public static void main(String[] args) {
        DeskComputer deskComputer = new DeskComputer();
        MobileDisk mobileDisk = new MobileDisk();
        deskComputer.connect(mobileDisk);
        mobileDisk.connect(deskComputer);

    }

}
