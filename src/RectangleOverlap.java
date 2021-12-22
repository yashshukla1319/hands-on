class Rect{
    Point topLeft,bottomRight;
    Rect(Point topLeft,Point bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    public boolean overlapping(Rect other){
        if (this.topLeft.x > other.bottomRight.x  ||
                this.bottomRight.x < other.topLeft.x  ||
                this.topLeft.y < other.bottomRight.y  ||
                this.bottomRight.y > other.topLeft.y)
        { return false; }
        return true;
    }
}
class Point{
    int x,y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class RectangleOverlap {
    public static void main(String[] arg){
        Point l1 = new Point(4,5);
        Point l2 = new Point(1,5);
        Point r1 = new Point(3,5);
        Point r2 = new Point(0,5);
        Rect one = new Rect(l1,r1);
        Rect two = new Rect(l2,r2);
        if (one.overlapping(two)){
            System.out.println("Over lapping rectangles");
        }
        else{
            System.out.println("Non over lapping rectangles");
        }
    }

}
