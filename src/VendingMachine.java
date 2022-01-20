import java.util.Scanner;

interface Items{
    String name();
    Integer price();
    Integer quantity();
}
enum Products{
    Coke(1,10,40),Pepsi(2,6,40),Sprite(3,4,40),Coffee(4,8,35),Mazza(5,5,45);
    int itemNo,quantity,price;
    Products(int itemNo, int quantity, int price) {
        this.itemNo = itemNo;
        this.quantity = quantity;
        this.price = price;
    }

    public int getItemNo() {
        return itemNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
enum Money{
    Five(5),Ten(10),Fifty(50),Hundred(100),Thundred(200);
    int value;
    Money(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }
}
interface Vending{
    public void selectItems();

}
class VendingImpl{
    public void selectItems(int i){
        Products products;
        for (Products prdts:Products.values()){
            if (i == prdts.getItemNo()){
                System.out.println(prdts);
            }
        }
    }

}
public class VendingMachine {
    public static void main(String[] arg){
        System.out.println("**********  Vending Machine  ***********");
        System.out.println("Selection Options: " +
                "Enter 1: Coke" +
                "Enter 2: Pepsi" +
                "Enter 3: Sprite" +
                "Enter 4: Coffee" +
                "Enter 5: Mazza" +
                "Enter 1: Coke");
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();
        System.out.println("Select Quantity: ");
        int no = sc.nextInt();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
