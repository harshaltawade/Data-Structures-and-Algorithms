import java.util.Arrays;
import java.util.List;

//Functional Interface
interface Greeting {
    void sayHello();
}

interface Square {
    int calculate(int x);
}

interface Sum{
    int calculate(int a, int b);
}

public class LambdaExpressions {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello, How are you?");
        g.sayHello();

        Square s = (x) -> x*x;
        System.out.println(s.calculate(5));

        Sum addition = (a,b) -> a+b;
        System.out.println(addition.calculate(5,10));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.forEach(i -> System.out.println(i));
        list.forEach(i -> {i=i*i;System.out.println(i);});
    }
}