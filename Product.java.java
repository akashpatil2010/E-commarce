package Shopping;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("\n 1.Pen \n 2.Pencil \n 3.Notebook \n 4.Marker \n 5.Books \n 6.Geometry Box \n 7.Paper \n 8.Generate Bill ");
		
		int sum=0;
		boolean flag=false;
		do
		{
			System.out.println("Enter your choice: ");
			int material=sc.nextInt();
			
			
			
			
			switch(material)
			{
			case 1:System.out.println("\n Enter the number of Pens: ");
				int no=sc.nextInt();
				int value=no*10;
				sum=sum+value;
				break;
				
			case 2:System.out.println("\n Enter the number of Pencils: ");
				int no1=sc.nextInt();
				int value1=no1*5;
				sum=sum+value1;
				break;
				
			case 3:System.out.println("\n Enter the number of Notebook: ");
				int no2=sc.nextInt();
				int value2=no2*25;
				sum=sum+value2;
				break;
				
			case 4:System.out.println("\n Enter the number of Marker: ");
				int no3=sc.nextInt();
				int value3=no3*15;
				sum=sum+value3;
				break;
				
			case 5:System.out.println("\n Enter the number of Books: ");
				int no4=sc.nextInt();
				int value4=no4*30;
				sum=sum+value4;
				break;
				
			case 6:System.out.println("\n Enter the number of Geometry box: ");
				int no5=sc.nextInt();
				int value5=no5*50;
				sum=sum+value5;
				break;
				
			case 7:System.out.println("\n Enter the number of paper: ");
				int no6=sc.nextInt();
				int value6=no6*2;
				sum=sum+value6;
				break;
				
			case 8:flag=true;
			
			}
			
		}while(flag!=true);
		
		System.out.println("Total bill is: "+sum);
		sc.close();
	}

}
