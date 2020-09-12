package behavior.interpreter.operation;


/**
 * 减法运算
 * @author liuyanzhao
 */
public class ImpMinusOperation implements InfOperation {

    @Override
    public double interpreter(Entity entity) {
        return entity.getNum1() - entity.getNum2();
    }
}
