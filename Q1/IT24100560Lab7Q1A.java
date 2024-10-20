import java.util.Scanner;

public class IT24100560Lab7Q1A{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 1;
	int sum=0;
	int avg=0;
     
	int marks;
        System.out.println("Enter marks for four numbers:");

        while (count <= 4) {
            System.out.print("Enter Subject Mark "+ count + ":");
            marks=scan.nextInt();
	sum=sum+marks;
	avg=sum/count;

            count=count+1;
}


	  System.out.println();
	  System.out.println("Average is : " + avg);

	if (avg<=100 && avg>=75){
   System.out.print("overall Grade is : Distinction");
}
	else if(avg<=75 && avg >=50){
	  System.out.print("overall Grade is : Credit");
}
	else{
	  System.out.print("overall Grade is : Fail");
}

	
}
}