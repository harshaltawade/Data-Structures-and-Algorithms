import java.util.Scanner;

public class DecimalToBinary {
    public static void method1(int n){
        int binary = 0;
        int i=0;
        while(n!=0){
            int digit = n%2;
            binary =(int)(digit*Math.pow(10,i)) + binary;
            i++;
            n/=2;
        }
        System.out.println(binary);
    }

    public static void method2(int n){
        int binary = 0;
        int i = 0;
        while(n!=0){
            int digit = n&1;
            binary = (int)(digit*Math.pow(10, i)) + binary;
            i++;
            n=n>>1;
        }
        System.out.println(binary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        method1(n);
        method2(n);
    }
}
