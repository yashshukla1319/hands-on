import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class StackWithQueue {
    Queue<Integer> queue = new ConcurrentLinkedQueue<>();
    Queue<Integer> queue2 = new ConcurrentLinkedQueue<>();
    int top;
    StackWithQueue(){
        //top=-1;
    }
    public void push(int x) {
        if (top > 5) {
            System.out.println("Stack Overflow");
        } else {
            //top+=1;
            queue.add(x);
            queue2.add(queue.poll());
        }
        queue2.addAll(queue);
    }
    public void pop(){
        if (!(queue2.isEmpty())){
            System.out.println("Popped Element: "+queue2.remove());
        }
        else{
            System.out.println("Stack is empty");
            //arr =new int[top];
        }
    }
    public void print(){
        //for (int i=top;i>=0;i--){
            System.out.println(queue2);
        }
    public static void main(String[] arg){
        StackWithQueue stack = new StackWithQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.print();
    }
}
