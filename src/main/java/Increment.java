public class Increment implements Runnable
{
    Value value;
    public Increment(Value value)
    {
        this.value = value;
    }
    public void run()
    {
       synchronized (value)
       {
           int i  = value.getI();
           value.setI(i+10);
           System.out.println(Thread.currentThread().getName());
           System.out.println("i = "+ value.getI());
           value.notify();
       }
    }
}
