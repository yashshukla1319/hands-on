
public class StackWithArray {
    int[] arr = new int[6];
    int top;
    StackWithArray(){
        top=-1;
    }
    public void push(int x) {
        if (top > 5) {
            System.out.println("Stack Overflow");
        } else {
            top+=1;
            arr[top]=x;
        }
    }
    public void pop(){
        if (!(top <0)){
            System.out.println("Popped Element: "+arr[top]);
            top-=1;

        }
        else{
            System.out.println("Stack is empty");
            //arr =new int[top];
        }
    }
    public void print(){
        for (int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] arg){
        StackWithArray stack = new StackWithArray();
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
