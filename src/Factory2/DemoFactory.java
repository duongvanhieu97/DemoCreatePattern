package Factory2;

public class DemoFactory {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.create("CIRCLE");
        shape1.draw();

        Shape shape2 = factory.create("RECTANGLE");
        shape2.draw();

        Shape shape3 = factory.create("SQUARE");
        shape3.draw();

//        Factory Method có thể giúp giảm sự phụ thuộc. Cho phép tạo ra các đối tượng mà không cần các thuộc tính mà cha nó tạo ra

    }
}
