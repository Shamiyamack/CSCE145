import java.util.Scanner;
//method that handles the dialog

/*
 * Written by: Shamiya Mack 
 */

public class DateAndTimeTester {

	public void run() { 
		String userInput = " ";
		do {
				
		System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it's valid"); 

		Scanner k = new Scanner(System.in);

		String input = k.nextLine();
		//checks to see if the date and time are valid or invalid 
		if(isValid(input))
		{
			System.out.println("The date and time is valid!");
		}
		else
		{
			System.out.println("The date and time is invalid!");
		}
		System.out.println("Would you like to exit? Type \"quit\" to exit or press [ENTER] to continue ");
		userInput = k.nextLine();
		} while(!userInput.equalsIgnoreCase("quit"));
	}
	public boolean isValid(String input) {
		String[] dateTime = input.split(" ");

		if(dateTime.length != 2 ) {
			return false;
		}
		String date = dateTime[0]; //MM//DD  
		String time = dateTime[1]; //hh:mm  
		//parsed date values to class-level variables
		int month = getMonth(date); 
		int day = getDay(date);
		int hour = getHour(time);
		int min = getMinute(time); 

		return isValidDate(date) && isValidTime(time);
	}
	
	public boolean isValidDate(String date) {
		int month = getMonth(date); 
		int day = getDay(date);

		if(month < 1 || month > 12)
		{
			return false;
		}
		if(month == 2 && day > 28)
		{
			return false;
		}
		if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) 
		{
			return false;
		}

		if(day < 1 || day > 31)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public boolean isValidTime(String time) {

		int hour = getHour(time);
		int min = getMinute(time); 
		//splits the input into time components 
		String[] parts = time.split(":");

		if(parts.length != 2)
		{
			return false;
		}
		if(hour < 1 || hour > 12)
		{
			return false; 
		}
		if(min < 0 || min > 59)
		{
			return false;
		}
		else 
		{
			return true; 
		}
	}
	
	//returns the value of the string date
	public int getMonth(String date) {
		String[] parts = date.split("/");//splits the date
		return Integer.parseInt(parts[0]);
	}
	//returns the value of the string date
	public int getDay(String date) {
		String[] parts = date.split("/");
		return Integer.parseInt(parts[1]);//splits the date
	}
	//returns the value of the string time
	public int getHour(String time) {
		String[] parts = time.split(":");//splits the hour
		return Integer.parseInt(parts[0]);
	}
	// returns of the value of the string time
	public int getMinute(String time) {
		String[] parts = time.split(":");//splits the minute
		return Integer.parseInt(parts[1]);
	}

}