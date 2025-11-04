package p1;

public class Array {
	


	

		public static void main(String[] args) {
			
			int num[]=new int[20];
			
			num[0]=100;
			num[1]=200;
			num[2]=450;
			num[7]=390;
			num[16]=500;
			
			for(int i=0;i<num.length;i++)
			{
				System.out.println(num[i]);
			}
			
			System.out.println(num[21]);
			
		}

	}

