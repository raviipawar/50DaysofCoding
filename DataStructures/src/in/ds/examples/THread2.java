package in.ds.examples;

class MultithreadingDemo implements Runnable
{
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");

        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}


 public class THread2 {

    public static void main(String[] args) {
        int n  = 5;
        for(int i = 0; i < 5  ; i++){
            Thread object;
            object = new Thread((Runnable) new MultithreadingDemo());
            object.start();
        }
    }
}
