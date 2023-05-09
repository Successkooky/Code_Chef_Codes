import java.util.*;
public class CodeChef39 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i <T; i++) {
            int X=input.nextInt();
            if (X%4==0) {
                System.out.println("North");
                
            }
            else if(X%4==1){
                System.out.println("East");
            }
            else if(X%4==2){
                System.out.println("South");
            }
            else{
                System.out.println("West");
            }
            
        }
    }
    
}
