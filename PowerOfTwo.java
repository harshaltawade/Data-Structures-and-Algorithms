import java.util.Scanner;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        while(n>1){
            if(n%2==1){
                return false;
            }
            n/=2;
        }
        return true;
    }
/*
2^n = 1,2,4,8,16,32,64,128,256,...

16 -> 8 -> 4 -> 2 -> 1
18 -> 9
20 -> 10 -> 5
2 -> 1
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}
