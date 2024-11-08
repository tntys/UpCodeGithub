Find the error and explain why error in the test code that provide in file: 

Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape Valid cause we’re upcasting a Circle to a Shape.
System.out.println(s1); // which version?                           Valid call the Circle class’s toString() method due to polymorphism, which overrides Shape’s toString().
System.out.println(s1.getArea()); // which version?                 Valid Polymorphism allows this to call Circle’s getArea() implementation, even though s1 is a Shape reference.
System.out.println(s1.getPerimeter()); // which version?            Valid calls Circle’s getPerimeter() implementation.
System.out.println(s1.getColor());                                  Valid getColor() is defined in Shape, so it can be called on s1
System.out.println(s1.isFilled());                                  Valid isFilled() is also defined in Shape, so this works without issues.
System.out.println(s1.getRadius());                                 Invalid causes a compilation error because s1 is of type Shape, which doesn’t have a getRadius() method.
    => System.out.println(((Circle) s1).getRadius());               Fixed


Circle c1 = (Circle)s1; // Downcast back to Circle                  Valid downcasts s1 back to Circle, which is allowed because s1 is actually a Circle object.
System.out.println(c1);                                             Valid calls Circle’s toString() method.
System.out.println(c1.getArea());                                   Valid calls are valid because c1 is explicitly a Circle reference.
System.out.println(c1.getPerimeter());                              Valid calls are valid because c1 is explicitly a Circle reference.
System.out.println(c1.getColor());                                  Valid calls are valid because c1 is explicitly a Circle reference.
System.out.println(c1.isFilled());                                  Valid calls are valid because c1 is explicitly a Circle reference.
System.out.println(c1.getRadius());                                 Valid calls are valid because c1 is explicitly a Circle reference.

Shape s2 = new Shape();                                             Invalid causes a compilation error because Shape is an abstract class and cannot be instantiated.
    => Shape s2 = new Circle();                                     Fixed

Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast         Valid because Rectangle is a subclass of Shape.
System.out.println(s3);                                             Valid calls the Rectangle class’s toString() method.
System.out.println(s3.getArea());                                   Valid Polymorphism allows this to call the Rectangle’s getArea() method.
System.out.println(s3.getPerimeter());                              Valid calls the Rectangle’s getPerimeter().
System.out.println(s3.getColor());                                  Valid calls getColor() from the Shape class.
System.out.println(s3.getLength());                                 Invalid causes a compilation error because s3 is a Shape reference, which doesn’t have access to the getLength() method from Rectangle.
    => System.out.println(((Rectangle) s3).getLength());            Fixed

Rectangle r1 = (Rectangle)s3; // downcast                           Valid This downcasts s3 back to Rectangle.
System.out.println(r1);                                             Valid explicitly a Rectangle reference.
System.out.println(r1.getArea());                                   Valid explicitly a Rectangle reference.
System.out.println(r1.getColor());                                  Valid explicitly a Rectangle reference.
System.out.println(r1.getLength());                                 Valid explicitly a Rectangle reference.

Shape s4 = new Square(6.6); // Upcast                               Valid upcasts a Square to a Shape.
System.out.println(s4);                                             Valid calls the Square class’s toString() method.
System.out.println(s4.getArea());                                   Valid Polymorphism allows this to call Square’s getArea().
System.out.println(s4.getColor());                                  Valid alls getColor() from Shape.
System.out.println(s4.getSide());                                   Invalid causes a compilation error because s4 is of type Shape, which doesn’t have a getSide() method.
    => System.out.println(((Square) s4).getSide());                 Fixed
// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square

Rectangle r2 = (Rectangle)s4;                                       Valid downcasts s4 to Rectangle, which is allowed because Square is a subclass of Rectangle.
System.out.println(r2);                                             Valid calls are valid because r2 is a Rectangle reference.
System.out.println(r2.getArea());                                   Valid calls are valid because r2 is a Rectangle reference.
System.out.println(r2.getColor());                                  Valid calls are valid because r2 is a Rectangle reference.
System.out.println(r2.getSide());                                   Invalid causes a compilation error because r2 is of type Rectangle, which does not have a getSide() method.
    => System.out.println(((Square) r2).getSide());                 Fixed
System.out.println(r2.getLength());                                 Valid getLength() is a method in Rectangle.

// Downcast Rectangle r2 to Square                                  Valid owncasts r2 to Square, which is valid since r2 references a Square object.
Square sq1 = (Square)r2;                                            Valid as sq1 is a Square reference.
System.out.println(sq1);                                            Valid as sq1 is a Square reference.
System.out.println(sq1.getArea());                                  Valid as sq1 is a Square reference.
System.out.println(sq1.getColor());                                 Valid as sq1 is a Square reference.
System.out.println(sq1.getSide());                                  Valid as sq1 is a Square reference.
System.out.println(sq1.getLength());                                Valid as sq1 is a Square reference.