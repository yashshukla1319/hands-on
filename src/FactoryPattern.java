interface Shape{
    void shape();
}

class Square implements Shape{

    @Override
    public void shape() {
        System.out.println("Square Class");
    }
}
class Rectangle implements Shape{

    @Override
    public void shape() {
        System.out.println("Rectangle Class");
    }
}
class Circle implements Shape{

    @Override
    public void shape() {
        System.out.println("Circle Class");
    }
}
class FactoryPattern {
    public Shape getshape(String name) {
        if (name.equals("square")){
            return new Square();
        }
        if (name.equals("circle")){
            return new Circle();
        }
        if (name.equals("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
class draw{
    public static void main(String[] args){
        FactoryPattern fp = new FactoryPattern();
        Shape shape = fp.getshape("circle");
        shape.shape();
    }
}
