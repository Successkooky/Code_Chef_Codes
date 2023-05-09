import java.util.*;
public class CodeChef38 {

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		for (int i=0;i<t;i++ ){
		    int a=input.nextInt();
		    int b=input.nextInt();
		    int Sum=a+b;
		    if(Sum%2==0){
		        System.out.println("Bob");
		    }
		    else{
		        System.out.println("Alice");
		    }
		} 
	}
    
}
