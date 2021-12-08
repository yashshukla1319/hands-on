//construct a complex object from simple objects using step-by-step approach
interface Packing {
    public String pack();
    public int price();
}
abstract class CD implements Packing{
    public abstract String pack();
}

abstract class Company extends CD{
    public abstract int price();
}
public class BuilderPattern {

}
