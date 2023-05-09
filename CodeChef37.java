import java.util.*;
public class CodeChef37 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            int N=input.nextInt();
            if(N%2==0 || N%7==0){
                System.out.println("YES");
            }
            else if((N%7)%2==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
    }
    
}
