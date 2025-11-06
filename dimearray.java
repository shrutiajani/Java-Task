package p1;

public class dimearray {

	public static void main(String[] args) {
		
		int [][] matrix = new int [2][3];
		
		matrix[0][0]= 11;
		matrix[0][1]= 22;
		matrix[0][2] =33;
		matrix[1][0]=111;
		matrix[1][1]=222;
		matrix[1][2]=333;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				System.out.println(matrix[i][j]+"");
			}
		}
		
		

	}

}
