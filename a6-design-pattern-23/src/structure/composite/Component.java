package structure.composite;

/**
 * This class defines the interface for objects that can have responsibilities
 * added to them dynamically.
 *
 * @version 1.0
 * @updated 28-Aug-2012 10:42:46 PM
 */
public abstract class Component {

    public Component() {

    }

    public void finalize() throws Throwable {

    }

    public abstract void Operation();

}
