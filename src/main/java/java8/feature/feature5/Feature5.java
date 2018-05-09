package java8.feature.feature5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author Vekaco
 * @comment use map() with lambda to alter the elements in the list
 */
public class Feature5 {
    public static void main(String[] args) {
        List<Integer> costBeforeTax = Arrays.asList(100,200,300,400,500);
        //traditional way
        for (Integer element: costBeforeTax) {
            Double costAfterTax = element + 0.12 *element;
            System.out.printf("%s,",costAfterTax);
        }
        System.out.println();
        //use map() with lambda
        costBeforeTax.stream().map(x->x + 0.12 * x).forEach(x-> System.out.printf("%s,",x));
        System.out.println();
        //also you can package some logic in function
        Function<Integer, Double> tax = x->x+0.12 * x;
        costBeforeTax.stream().map(tax).forEach(x-> System.out.printf("%s,", x));
    }
}
