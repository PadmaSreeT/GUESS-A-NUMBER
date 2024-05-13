package sita;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main1{

	public static void main(String[] args) throws NumberFormatException, IOException {
	    int x=1;
		while(x!=0)
		{
		int min=0;
		int max=100;
		int guess = 0;
		int n =(int)(Math.random()*(max-min+1)+min);
		System.out.println("DO YOU WANT TO PLAY??????");
		System.out.println("press enter or type 'no'");
		InputStreamReader read = new InputStreamReader(System.in);
	    BufferedReader in=new BufferedReader(read); 
	    String answer=in.readLine();
	    if (!answer.equals("no"))
	    {
	    	System.out.println("INSTRUCTIONS:");
			System.out.println("1.YOU NEED TO GUESS THE RANDOM NUMBER BETWEEN 1-100\n"
					+ "2.YOU ARE HAVING ONLY THREE CHANCES\n"
					+ "3.YOU WILL HAVE SCORE BASED ON IT\n"
					+ "    LETS GET START!!!!!    \n");
		 System.out.println("Guess a random number between 1-100\n");
	    for(int a=1;a<=3;a++)
	    {
	    	InputStreamReader reads= new InputStreamReader(System.in);
		    BufferedReader br=new BufferedReader(reads); 
		    guess=Integer.parseInt(br.readLine());
		    {
		    	if (a==1 && n==guess)
			    {
			       System.out.println("Congrats!your guess is correct");
			       System.out.println("your score is 30");
			       break;
			    }
		    	else if (a==2 && n==guess)
			    {
			       System.out.println("Congrats!your guess is correct");
			       System.out.println("your score is 20");
			       break;
			    }
		    	if (a==3 && n==guess)
			    {
			       System.out.println("Congrats!your guess is correct");
			       System.out.println("your score is 10");
			       break;
			    }
		    	if (a==3 && n!=guess)
		    	{
		    		System.out.println("Sorry!your score is 0");
		    		break;
		    	}
		    	if(n>guess)
				{
				   System.out.println("your guess is low!Try again");
				}
				else 
			    {
					System.out.println("your guess is high!Try again");
			    }
	    
		    }
	    } 
	    if (guess!=n)
	    {
	    System.out.println("correct number is "+n);
	    }
	    }
	    if(answer.equals("no"))
	    {
	    	System.out.println("THANKYOU");
	    	x=0;
	    }
		}

       }
	}