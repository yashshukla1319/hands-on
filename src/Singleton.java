public class Singleton {
    private static Singleton obj=new Singleton();//Early, instance will be created at load time
    private void Singleton(){}

    public static Singleton getA(){
        return obj;
    }
    public void doSomething(){
        //write your code
    }
}
class Lazy{
    private static Lazy obj;
    private void Lazy(){}

    public static Lazy getA(){
        if (obj == null){
            synchronized(Singleton.class){
                if (obj == null){
                    obj = new Lazy();//instance will be created at request time
                }
            }
        }
        return obj;
    }

    public void doSomething(){
        //write your code
    }
}