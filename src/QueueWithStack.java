import java.util.Stack;

public class QueueWithStack {
    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();
    public void add(int val){
        stack1.push(val);
        //System.out.println(stack1);
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
    }
    public int get(){
        int x = stack2.peek();
        stack2.pop();
        //System.out.println(stack2.peek());
        return x;
    }
    public static void main(String[] arg){
        QueueWithStack qs = new QueueWithStack();
        qs.add(1);
        qs.add(2);
        qs.add(3);
        qs.get();
        qs.get();
        qs.get();

    }
}
