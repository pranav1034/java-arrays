import java.util.Scanner;

public class MeanHeight {
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	double[] heights = new double[11];
	double sum = 0;
	
	//taking input
	for(int i = 0; i < 11 ; i++){
	   System.out.print("Enter height of player " + (i+1) + ": ");
	   heights[i] = sc.nextDouble();
	   sum += heights[i];	
	}
	//Calculating mean
	double mean = sum / 11;
	
	//print result
	System.out.println("The mean height of football team is: " + mean);

	}
}
