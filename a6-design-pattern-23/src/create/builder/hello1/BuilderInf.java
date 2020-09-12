package create.builder.hello1;

import create.builder.hello1.model.Room;


/**
 * 工人接口，定义了工人所要进行的工作。他们负责进行具体部件如窗户，地板的建造。同时因为房子是民工建的，因此建设完成后由他把房子递交回房主
 */
public interface BuilderInf {

    public void makeWindow();

    public void makeFloor();

    public Room getRoom();
}
