package create.builder.hello1;

public class Designer {

    public void command(BuilderInf builder) {
        // 先建造地板
        builder.makeFloor();
        // 再建造窗户
        builder.makeWindow();
    }
}
