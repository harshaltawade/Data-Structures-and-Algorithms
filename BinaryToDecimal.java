import java.util.Scanner;

public class BinaryToDecimal {
    public static void method1(int n){
        int decimal = 0;
        int i=0;
        while(n!=0){
            int bit = n%10;
            decimal = (int)Math.pow(2,i)*bit + decimal;
            n/=10;
            i++;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        method1(n);
    }
}
