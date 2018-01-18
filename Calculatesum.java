import java.util.Scanner;

	
	public class Calculatesum
	{
	
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
	
			double input;
	    	double user;
	    	int check;
	    	int dollar;
	    	int moddollar;
	    	int quater;
	    	int modqtr;
	    	int dime;
	    	int moddime;
	    	int nickle;
	    	int modnkl;
	    	int penny;
	    	
	    	Scanner keyboard = new Scanner(System.in);

	    	System.out.println("How much money do you have? ");
	    	
	    	
	    	
	    	input = keyboard.nextDouble();
	    	
	    	if(input <.01 )
	    	{
	    		System.out.println("error not a denomination");
	    	}
	    	
	    	else
	    	{

		    	user = input * 100;
		    	check = (int)user%5;
		    	dollar = (int)user/100;
		    	moddollar = (int)user%100;
		    	quater = (int)moddollar/(25);
		    	modqtr = (int)moddollar%25;
		    	dime = modqtr/10;
		    	moddime = modqtr%10;
		    	nickle = moddime/05;
		    	modnkl = moddime%05;
		    	penny = modnkl/01;
		    	
		    
		    	System.out.println("You have");
		    	
		    	if(dollar > 1  )
		    	{
		    		System.out.println(dollar + " Dollars");
		    	}
		    	else if (dollar == 1)
		    	{
		    		System.out.println(dollar + " Dollar");
		    	}
		    	
		    	if(quater > 1  )
		    	{
		    		System.out.println(quater + " Quaters");
		    	}
		    	else if (quater == 1)
		    	{
		    		System.out.println(quater + " Quater");
		    	}
		    	
		    	if(dime > 1  )
		    	{
		    		System.out.println(dime + " Dimes");
		    	}
		    	else if (dime == 1)
		    	{
		    		System.out.println(dime + " Dime");
		    	}
		    	
		    	
		    	if(nickle > 1  )
		    	{
		    		System.out.println(nickle + " Nickles");
		    	}
		    	else if (nickle == 1)
		    	{
		    		System.out.println(nickle + " Nickle");
		    	}
		    	
		    	
		    	if(penny > 1  )
		    	{
		    		System.out.println(penny + " Pennies");
		    	}
		    	else if (penny == 1)
		    	{
		    		System.out.println(penny + " Penny");
		    	}
	    	}
	    		
	    		
	    	
	    	}
	    	}
	    	
	
	//}
