package structure.composite;

/**
 * This class defines an object to which additional responsibilites can be
 * attached.
 *
 * @version 1.0
 * @updated 28-Aug-2012 10:42:50 PM
 */
public class ConcreteComponent extends Component {
    public ConcreteComponent() {
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public void Operation() {
        System.out.println("原始组件功能");
    }

}
