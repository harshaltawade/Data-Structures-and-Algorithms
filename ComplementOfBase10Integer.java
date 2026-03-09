import java.util.Scanner;

public class ComplementOfBase10Integer {
    public static int bitwiseComplement(int n) {
        int m = n;
        int mask = 0;
        if(n==0){
            return 1;
        }
        while(m!=0){
            m = m>>1;
            mask = (mask<<1)|1;
        }
        int ans = ~n & mask;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bitwiseComplement(n));
    }
}

/*
n=5     0000 0000 0101
~n      1111 1111 1010
create mask
mask     0
m = n
while m!=0: m>>1 and (mask<<1)|1
~n&mask = ans
*/