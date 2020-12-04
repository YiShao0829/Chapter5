
public class P48 {

	public static void main(String[] args) {
		Car5 car1=new Car5("1號車");
		car1.start();
		
		try
		{
			car1.join();
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("結束main()的處理工作");
	}

}
class Car5 extends Thread
{
	private String name;
	public Car5(String nm)
	{
		name=nm;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
}