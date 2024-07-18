package lab.com;
import java.util.*;

class PrimeCalculator implements Runnable 
{
    private long start;
    private long end;
    private long sum;
    public PrimeCalculator(long start, long end) 
    {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() 
    {
        for (long no = start; no <= end; no++) 
        {
            if (isPrime(no)) 
            {
                sum = sum + no;
            }
        }
    }

    private boolean isPrime(long number)
    {
        if (number <= 1) 
        {
            return false;
        }
        for (long i = 2; i * i <= number; i++) 
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public long getSum() 
    {
        return sum;
    }
}

public class PrimeSumApplication
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner xyz = new Scanner(System.in);
        System.out.print("Enter the limit for prime number calculation: ");
        long limit = xyz.nextLong();
        System.out.print("Enter the number of threads: ");
        int numThreads = xyz.nextInt();

        long step = limit / numThreads;
        long start = 1;
        long end = step;

        PrimeCalculator[] p = new PrimeCalculator[numThreads];
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) 
        {
            p[i] = new PrimeCalculator(start, end);
            threads[i] = new Thread(p[i]);
            threads[i].start();
            start = end + 1;
            end += step;
        }

        long sum = 0;
        for (int i = 0; i < numThreads; i++)
        {
            threads[i].join();
            sum = sum + p[i].getSum();
        }

        System.out.println("Sum of prime numbers up to " + limit + " is: " + sum);

	}

}
