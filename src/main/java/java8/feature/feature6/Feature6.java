package java8.feature.feature6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * @author Vekaco
 * @comment map(), reduce() with lambda; map() can transfer elements separately while reduce() combine them.
 */

public class Feature6 {
    public static void main(String[] args) {
        List<Integer> costBeforeTax = Arrays.asList(100,200,300,400,500);
        //traditional way
        double total = 0;
        for (Integer element:costBeforeTax) {
            double price = element + element*0.12;
            total += price;
        }
        System.out.println("Total:" + total);
        //use map(), reduce() with lambda
        double bill = costBeforeTax.stream().map(x-> x+ x*0.12).reduce((sum, x) ->sum + x).get();
        System.out.println("Bill:" + bill);
        //you can also pick out the functions separately.
        Function<Integer, Double> tax = x->x+x*0.12;
        double bill2 = costBeforeTax.stream().map(tax).reduce((sum,x)->sum+x).get();
        System.out.println("Bill2:" + bill2);
    }
}
