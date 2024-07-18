package lab.com;

class Application
{
    private int data;
    private boolean produced;
    public synchronized void produce(int value)
    {
        while (produced)
        {
            try 
            {
                wait();
            } 
            catch (InterruptedException e) 
            {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        System.out.println("Produced: " + value);
        produced = true;
        notify();
    }

    public synchronized int consume() 
    {
        while (!produced) 
        {
            try 
            {
                wait();
            }
            catch (InterruptedException e) 
            {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed: " + data);
        produced = false;
        notify();
        return data;
    }
}

class Producer implements Runnable
{
    private Application a;

    public Producer(Application a) {
        this.a = a;
    }

    @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++) {
            a.produce(i);
            try
            {
                Thread.sleep(1000); 
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private Application aa;

    public Consumer(Application aa) {
        this.aa = aa;
    }

    @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++)
        {
            aa.consume();
            try 
            {
                Thread.sleep(1000); 
            }
            catch (InterruptedException e) 
            {
                Thread.currentThread().interrupt();
            }
        }
    }
}


public class ProducerConsumerApp
{
	public static void main(String[] args) 
	{
		Application app = new Application();
        Thread producerThread = new Thread(new Producer(app));
        Thread consumerThread = new Thread(new Consumer(app));
        producerThread.start();
        consumerThread.start();

	}

}
