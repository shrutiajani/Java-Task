package p1;
import java.util.Scanner;

public class arrayexample1 {




		public static void main(String[] args) {
			
			
			Scanner scan=new Scanner(System.in);
			int []num=new int[5];
			for(int i=0;i<num.length;i++)
			{
				System.out.print("Enter element ");
				
				num[i]=scan.nextInt();
			}
			for(int i=0;i<num.length;i++)
			{
				System.out.println(num[i]);
			}
			
		}

	}

