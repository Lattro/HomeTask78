public class Main
{
    public static void main(String[] args)
    {
        Value value = new Value();
        Decrement decrement = new Decrement(value);
        new Thread(decrement,"decrement").start();
        Increment increment = new Increment(value);
        new Thread(increment,"increment").start();
    }
}
