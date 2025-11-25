public class VariableScope {
    public static void main(String[] args) {
        int a = 5;

        int b = 10;
        if(true){
            System.out.println(b);
        }

        System.out.println(b);

    }
}
