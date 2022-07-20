package Singleton;

public class Singleton {
    private static Singleton singleton;

    /**
     * Create private constructor
     */

    private Singleton()
    {
    }

    /**
     * Create a static method to get instance. getInstance is our method name
     */

    public static Singleton getInstance()
    {
        if (singleton == null)
        {
            synchronized (Singleton.class)
            {
                if(singleton==null)
                {
                    singleton = new Singleton();
                }

            }
        }
        return singleton;
    }

    public void displayMessage()
    {
        System.out.println("I have called using singleton object");
    }
}
