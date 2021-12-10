import java.util.ArrayList;
import java.util.List;

//construct a complex object from simple objects using step-by-step approach
interface Item{
    public String name();
    public Packing packing();
    public int price();
}
interface Packing {
    public String packing();
}
class Wrapper implements Packing{
    public String packing(){
        return "Wrapper";
    }
}

class Bottle implements Packing{
    public String packing(){
        return "Bottle";
    }
}
abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract int price();
}
abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract int price();
}
class VegBurger extends Burger {

    @Override
    public int price() {
        return 100;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
class Coke extends ColdDrink {

    @Override
    public int price() {
        return 50;
    }

    @Override
    public String name() {
        return "Coke";
    }
}

class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        int cost = 0;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().packing());
            System.out.println(", Price : " + item.price());
        }
    }
}
    class MealBuilder {

        public Meal prepareVegMeal (){
            Meal meal = new Meal();
            meal.addItem(new VegBurger());
            meal.addItem(new Coke());
            return meal;
        }
}
public class BuilderPattern{
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

    }
}