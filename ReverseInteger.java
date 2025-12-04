import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int x) {

        int num = 0;
        while(x!=0){
            if(num>Integer.MAX_VALUE/10 || num<Integer.MIN_VALUE/10)
            {
                return 0;
            }
            num = num*10 + x%10;
            x/=10;
        }
        return num;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(reverse(x));
    }
}
