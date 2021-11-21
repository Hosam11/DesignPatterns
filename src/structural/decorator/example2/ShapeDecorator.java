package structural.decorator.example2;

public class ShapeDecorator implements  Shape{
    // Protected variable
    protected Shape decoratedShape;

    // Method 1
    // Abstract class method
    public ShapeDecorator(Shape decoratedShape) {
        // This keyword refers to current object itself
        this.decoratedShape = decoratedShape;
    }
    // Method 2 - draw()
    // Outside abstract class
    @Override
    public void draw() { decoratedShape.draw(); }


}
