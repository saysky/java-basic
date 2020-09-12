package hello4;

public class Run {
    public static void main(String[] args) throws Exception {

        PasswordUtils passwordUtils = new PasswordUtils();
        System.out.println("加密后的：" + passwordUtils.encryptPassword("abc123"));
    }

}
