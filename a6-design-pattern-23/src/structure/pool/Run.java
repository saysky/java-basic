package structure.pool;

/**
 * @author liuyanzhao
 */
public class Run {

    public static void main(String[] args) throws Exception {
        ConnectionPool connectionPool = new ConnectionPool();
        Connection connect = connectionPool.getConnection();

        System.out.println("返回对象是connect=" + connect);
    }

}
