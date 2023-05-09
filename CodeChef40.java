import java.util.*;
public class CodeChef40 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        for (int i = 0; i < t; i++) {
            int fact=1;
            int n=input.nextInt();
            for (int j = 1; j <=n ; j++) {
                fact*=j;
               
                
            }
            System.out.println(fact);
            
        }
    }
    
}
