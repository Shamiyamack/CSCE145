/*
 * Written by Shamiya Mack
 */
import java.util.Scanner;
public class BelowAverageWinter {
	public static void main(String[] args) {
    	
		// Welcome message 
		System.out.println("Welcome to the below average temperature tester program.");
		
		//To get user input
		Scanner k = new Scanner(System.in);
		
		//Array storing 10 temperatures
		double [] temperatures = new double [10];	
		
//		temperatures[0] = 10;
//		temperatures[temperatures.length - 1] = 5;
		
		// Loop to get temperatures from the user 
		
				for(int i = 0; i < 10; i++) 
		{
			System.out.println("Please enter the temperature for day" + (i+1)+": ");
			//syntax for calling point
			temperatures[i] = k.nextDouble();
		}
				double sum = 0; 
				for(int i = 0; i < 10; i++) 
				{
					sum = sum+temperatures[i];
				}
				
				double tempAvg = sum/10;
				System.out.println("The average temperature was " + tempAvg); 
								
				for(int i = 0; i < 10; i++)
				{
					if(temperatures[i] < tempAvg)
					{
						System.out.println("The days that were below average were " + (i+1)); 
					}

				}
				
				
				
						
				
			
			
			
			
			
		
		}

}
