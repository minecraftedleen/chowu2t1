public class RectangleRunner {
    public static void main(String[] args) {

        // creating one instance/object from the Rectangle class
        Rectangle rect1 = new Rectangle(5, 6);
        rect1.printArea();  // calling a method on the object

        // creating ANOTHER instance/object from the Rectangle class
        Rectangle rect2 = new Rectangle(10, 8);
        rect2.printArea();  // calling a method on the object

        Rectangle rect3 = new Rectangle(7, 10);
        rect3.printArea();  // calling a method on the object
        rect1.printPerimeter();
        rect2.printPerimeter();
        rect3.printPerimeter();
    }
}


