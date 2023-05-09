import java.util.*;
public class CodeChef42 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        int avg = sum / n;
        int diff = 0;
        for (int i = 0; i < n; i++) {
            diff += Math.abs(arr[i] - avg);
        }
        if (diff % 2 == 0) {
            System.out.println(diff / 2);
        } else {
            System.out.println((diff / 2) + 1);
        }
    }
}

