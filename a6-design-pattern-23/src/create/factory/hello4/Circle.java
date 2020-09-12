package create.factory.hello4;

public class Circle implements Shape {

    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("the circle is drawing...");
    }

    public void erase() {
        // TODO Auto-generated method stub
        System.out.println("the circle is erasing...");
    }

    private static class Factory extends ShapeFactory {
        protected Shape create() {
            return new Circle();
        }
    }

    static {
        ShapeFactory.addFactory("Circle", new Factory());
    }

}
