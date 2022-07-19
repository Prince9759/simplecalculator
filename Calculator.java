package Calculator;
import java.util.*;
public class Calculator {
	private int num1,num2;
	 

	 public int getnumber1() {
		    return num1;
		    
		  }
		  public int getnumber2() {
			    return num2;
			    
			  }

		  public void setName(int num1,int num2) {
		    this.num1 = num1;
		    this.num2=num2;
		  }
	 

	  public static void calculator() 
     {
		  Scanner sc = new Scanner(System.in);
		  Calculator obj =  new Calculator();
		  
	        double result;
	        while(true) 
	        {
	        	System.out.println("enter 1 for Addition");
	        	System.out.println("enter 2 for substraction");
	        	System.out.println("enter 3 for multiplication");
	        	System.out.println("enter 4 for divide");
	        	System.out.println("enter 5 for exit");
	        	
	        	int x = sc.nextInt();
	        	if(x>5 || x<1) 
	        	{
	        		System.out.println("please enter valid input");
	        	}
	        	switch(x) 
	        	{
	        	case 1:
	        		System.out.println("enter the first value ");
	    	        int num1 =  sc.nextInt();
	    	        System.out.println("enter the second  value ");
	    	        int num2 =  sc.nextInt();
	        		 result = num1+num2;
	        		System.out.println(result);
	        		break;
	        	case 2:
	        		System.out.println("enter the first value ");
	    	        num1 =  sc.nextInt();
	    	        System.out.println("enter the second  value ");
	    	         num2 =  sc.nextInt();
	        		 result = num1-num2;
	        		System.out.println(result);
	        		break;
	         	case 3:
	         		System.out.println("enter the first value ");
	    	         num1 =  sc.nextInt();
	    	        System.out.println("enter the second  value ");
	    	         num2 =  sc.nextInt();
	        		 result = num1*num2;
	        		System.out.println(result);
	        		break;
	         	case 4:
	         		System.out.println("enter the first value ");
	    	        num1 =  sc.nextInt();
	    	        System.out.println("enter the second  value ");
	    	         num2 =  sc.nextInt();
	         		if(num2==0) 
	         		{
	         			System.out.println("enter valid number or always num2>0");
	         			break;
	         		}
	        		 result = num1/num2;
	        		System.out.println(result);
	        		break;
	         	case 5:
	        		System.exit(0);
	        	}
	        	
	        }
	        
		
     }

	public static void main(String[] args) {
		
		Calculator obj =  new Calculator();
		calculator();
       
       
		
		

	}

}