package lab8;

import java.util.Scanner;

public class p1 {

	private static Scanner keyboard;



	public static double getmax(double[] list)
	{
		double max =list[0];
		for(int i=0; i<list.length; i++)
			if(list[i]>max)
				max=list[i];
		return max;
		
	}
	public static double getmin( double[] list)
	{
		double min =list[0];
		for(int i=0; i<list.length; i++)
			if(list[i]>min)
				min=list[i];
		return min;
		
	}
    

	
	public static void main(String[] args) {
		double[] scores;
		scores= new double [7];
		double max,min;
		double sum=0;
		
		
		keyboard = new Scanner(System.in);
		System.out.println("enter the scores of 7 judges");
		for(int i=0; i<scores.length; i++ )
		{
			scores[i]=keyboard.nextFloat();
		}
		max =getmax(scores);
		min=getmin(scores);
		for(int i=0; i<scores.length; i++)
		{
		   if((scores[i]!=max) && (scores[i]!=min ))
		   {
			   sum +=scores[i];
		   }
		}
		System.out.println("entr the degree of defucility");
		double drgree_def =keyboard.nextFloat();
		double total= drgree_def*sum;
		double diver_score= total * 0.6;
		System.out.println("the score of diver=" + diver_score);
		
		
		
		
		

	}

}
