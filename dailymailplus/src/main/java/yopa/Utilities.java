package yopa;

public class Utilities {

	

	public static void WaitForSomeTime(){
		{
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
	}
}
}
