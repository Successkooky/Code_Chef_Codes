import java.util.*;
public class CodeChef36 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
           
            int X=input.nextInt();
            int Y=input.nextInt();
            int Z=input.nextInt();
           
            int FB=X+Y;
            int Train=Z;
            if (FB>Train) {
                System.out.println("TRAIN");
                
            }
            else if(FB<Train){
                System.out.println("PLANEBUS");
            }
            else{
                System.out.println("EQUAL");
            }
        }
    }
    
}
