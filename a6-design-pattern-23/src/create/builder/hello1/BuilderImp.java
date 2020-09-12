package create.builder.hello1;

import create.builder.hello1.model.Floor;
import create.builder.hello1.model.Room;
import create.builder.hello1.model.Window;


class BuilderImp implements BuilderInf {

    public Room room = new Room();

    @Override
    public void makeWindow() {
        System.out.println("安装窗户");
        room.setWindow(new Window());
    }

    @Override
    public void makeFloor() {
        System.out.println("安装地板");
        room.setFloor(new Floor());
    }

    @Override
    public Room getRoom() {
        return new Room();
    }

}
