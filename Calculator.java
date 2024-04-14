import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the choice \n 1.addition \n 2.subtract \n 3.multiply \n 4.division");
	    int choice =  sc.nextInt();
		System.out.println("Enter the 1st number");
		int a= sc.nextInt();
		System.out.println("Enter the 2nd number");
	    int b= sc.nextInt();
		switch(choice)
    {
    case 1 :
     
     int add= a+b;
     System.out.println(add);
     
     break; 
  
    case 2 :
        int sub=a-b;
        System.out.println(sub);
   
     break; 

     case 3:
	  int div = a / b;
	  System.out.println(div);
     break;

     case 4;
	  int multi = a * b;
	  System.out.println(multi);
     break;
    
     default : 
     System.out.println("Invalid Choice");
}
		
	}
}
