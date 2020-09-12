package behavior.interpreter.operation;


/**
 * 加法运算
 * @author liuyanzhao
 */
public class ImpAddOperation implements InfOperation {

    @Override
    public double interpreter(Entity entity) {
        return entity.getNum1() + entity.getNum2();
    }
}
