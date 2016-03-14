/*Name:Saiamulya Kandikonda
UNI:sk4060
This program is used to compute the mean, median, mode, and standard deviation 
of an array of data points that the user selects.*/

import java.util.Scanner;
public class StatisticsTester {
	
	public static void main (String args[])
	{
		/*These statements are used to ask the user for number of data 
		points and what they are*/

		Scanner scan = new Scanner (System.in);
		System.out.println("How many data points do you have? ");
		int number =scan.nextInt();
		double[]array1= new double [number];
		for (int i=0;i<array1.length;i++)
		{
		System.out.println("Enter a data point: ");
		array1[i]=scan.nextDouble();
		}

		/*These statements are used to reference Statistics.java to compute the 
		mean,median,mode,and standard deviation*/

		Statistics test1 = new Statistics();
		System.out.println("Check the mean: "+Math.round(test1.Average(array1)
			*100.0)/100.0);
		System.out.println("Check the median: "+Math.round(test1.Median(array1)
			*100.0)/100.0);
		System.out.println("Check the mode: "+Math.round(test1.Mode(array1)
			*100.00)/100.0);
		System.out.println("Check the standard deviation: "+Math.round
				(test1.StandardDeviation(array1)*100.00)/100.0);
	}
}
