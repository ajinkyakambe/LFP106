package day6logicalprograms;
import java.util.Scanner;

public class StopWatch 
{
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	
	//to start timer
	public void start()
	{
		startTimer=System.currentTimeMillis();
		System.out.println("Start Time is: "+startTimer);
	}
	
	// to stop timer
	public void stop()
	{
		stopTimer=System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTimer);
	}
	
	public long getElapsedTime()
	{
		elapsed=stopTimer-startTimer;
		return elapsed;
	}
	
	public static void main(String[] args) throws Exception
	{
		
		
		System.out.println("Press '1' to Start Time: ");
		System.out.println("Press '2' to Stop Time: ");
		int inputProcess = 0;

		
		//scanning input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number:");
		inputProcess = input.nextInt();
		

        StopWatch sw=new StopWatch();
		if(inputProcess == 1){
			sw.start();
			System.out.print("Again Enter number:");
		    inputProcess = input.nextInt();
			System.out.print(inputProcess);
		} else if (inputProcess == 2) {
			sw.stop();
			long l=sw.getElapsedTime();
			System.out.println();
			System.out.println("Total Time Elapsed(in millisec) is:"+l);
			System.out.println();
			System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
		}

		input.close();
		
	}
}