package java8.feature.feature4;

import java.util.function.Function;

/**
 * @author Vekaco
 * @comment interface Function(since 1.8), parameters: one for input and another for output, you can cascade functions with andThen()
 */
public class Feature4 {
    public static void main(String[] args) {
        //input: x; output 2*x
        Function<Integer, Integer> function1 = x -> {System.out.printf("first function input:%s\n",x);return x*2;};
        //cascade
        Function<Integer, Integer> function2 = function1.andThen(x -> { System.out.printf("second function input:%s\n",x);return x*3;});
        //use apply() to get result via function
        Integer result = function2.apply(8);
        System.out.printf("result:%s",result);
    }

}
