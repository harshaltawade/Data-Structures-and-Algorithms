public class BitwiseOperators {
    public static void main(String[] args) {
        int a=11;
        int b=2;

        System.out.println(" a&b : "+(a&b));
        System.out.println(" a|b : "+(a|b));
        System.out.println(" ~a : "+(~a));
        System.out.println(" ~b : "+(~b));
        System.out.println(" a^b : "+(a^b));
        System.out.println(" a<<b : "+(a<<b));
        System.out.println(" a>>b : "+(a>>b));
        System.out.println(" a++ : "+(a++));
        System.out.println(" ++a : "+(++a));
        System.out.println(" a-- : "+(a--));
        System.out.println(" --a : "+(--a));

        for(int i=0; i<=15; i+=2){
            System.out.println(i);
            if((i&1)==1){
                
                continue;
            }
            i++;
        }
    }
}
