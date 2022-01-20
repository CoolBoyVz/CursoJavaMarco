package Paquete;

public class Main {

	public static void main(String[] args) {

		int x[][];
		x = new int[3][3];
		
		x[0][0] = 0;
		x[0][1] = 1;
		x[0][2] = 2;
		x[1][0] = 3;
		x[1][1] = 4;
		x[1][2] = 5;
		x[2][0] = 8;
		x[2][1] = 9;
		x[2][2] = 10;


		
	   for(int i=0;i<3;i++)
	   {
		 
		   for(int j =0;j<3;j++)
		   {
		   System.out.println("x["+i+"]["+j+"]"+x[i] [j]);			   
	   }
	
	   }

}
}