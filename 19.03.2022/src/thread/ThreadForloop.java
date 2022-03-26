package thread;

class MyThread extends Thread
{
	public MyThread(String string) {
		super(string);
	}
	public void run()
	{
		for(int i=1;i<=6;i++)
		{
			System.out.println("i="+i+"thread"+Thread.currentThread());
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			}
	}
}


public class ThreadForloop {

	public static void main(String[] args) {
		MyThread ob=new MyThread("first");
				MyThread ob1=new MyThread("second");
				ob.start();
				ob1.start();
	}

}
