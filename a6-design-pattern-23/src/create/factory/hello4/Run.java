package create.factory.hello4;

public class Run {

    public static void main(String[] args) {
        Shape shape = ShapeFactory.createShape("Circle");// Square,Circle
        shape.draw();
        shape.erase();

    }

}
