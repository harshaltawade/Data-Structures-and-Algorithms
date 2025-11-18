import java.util.Scanner;

public class Patterns {

    public static void pattern1(int n){
        int i=0;
        int j=0;
        while(i<n){
            while (j<n) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            j=0;
            i++;
        }
    }

    public static void pattern2(int n){
        int i=0;
        int j=0;
        while(i<n){
            while(j<n){
                System.out.print((i+1)+" ");
                j++;
            }
            i++;
            j=0;
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :  ");
        int n = sc.nextInt();

        // pattern1(n);
        pattern2(n);

    }
}
