import java.util.Scanner;

public class FibonacciSeries {
    public static void fibonacci(int n){
        int first = 0;
        int second = 1;
        int next;

        System.out.println(first);
        System.out.println(second);

        for(int i=0; i<n; i++){
            next = first+second;
            System.out.println(next);
            first=second;
            second=next;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        fibonacci(n);
    }
}
