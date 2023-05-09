import java.util.*;
public class CodeChef41 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            int n=input.nextInt();
            int arr[]=new int[n];
            int fre[]=new int[1001];
            for (int j = 0; j < n; j++) {
                arr[j]=input.nextInt();
                fre[arr[j]]++;
                
            }
            Arrays.sort(fre);
            System.out.println(n-fre[1000]);
            
        }
    }
    
}
