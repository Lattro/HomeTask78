public class Decrement implements Runnable
{
    Value value;
    public Decrement(Value value)
    {
        this.value = value;
    }
    public void run()
    {
        synchronized (value)
        {
            try
            {
                value.wait();
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            int i = value.getI();
            value.setI(i-5);
            System.out.println(Thread.currentThread().getName());
            System.out.println("i = "+ value.getI());
        }
    }
}
