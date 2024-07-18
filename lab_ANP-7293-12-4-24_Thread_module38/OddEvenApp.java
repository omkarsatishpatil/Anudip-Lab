//Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
package lab.com;

class EvenRunnable implements Runnable 
{
    @Override
    public void run()
    {
        for (int i = 2; i <= 20; i =i+ 2) 
        {
            System.out.println("Even: " + i);
            try 
            {
                Thread.sleep(500); 
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}

class OddRunnable implements Runnable 
{
    @Override
    public void run() 
    {
        for (int i = 1; i <= 20; i = i+2) 
        {
            System.out.println("Odd: " + i);
            try
            {
                Thread.sleep(500);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}

public class OddEvenApp
{
	public static void main(String[] args) 
	{
		Thread evenThread = new Thread(new EvenRunnable());
        Thread oddThread = new Thread(new OddRunnable());
        
        evenThread.start();
        oddThread.start();

	}

}
