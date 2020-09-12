package create.builder.hello1;

import create.builder.hello1.model.Room;

/*
场景： 
 建房过程
 - 建筑工对象建站了房子，
 - 设计师负责规划建站的各个细节部分
 扩展性体现在：
 工人可以随意换， 设计师也可以随意换 
 
 
 * */
public class Run {

    public static void main(String[] args) {
        // 先找来一个工人
        BuilderInf builder = new BuilderImp();
        // 再找来一个房屋设计师
        Designer designer = new Designer();
        // 工人按照设计师设计建造
        designer.command(builder);
        // 工人向雇主交房子

        Room newRoom = builder.getRoom();
    }

}
