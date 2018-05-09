package java8.feature.feature3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Vekaco
 * @comment Predicate(since1.8) filter with stream.
 */
public class Feature3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Scala", "Redis", "MongoDB", "RabbitMQ","JSP");

        //stream filter with lambda (predicate), filter out the element start with 'J' in the list
        list.stream().filter(x->x.startsWith("J")).forEach(x-> {System.out.print(x);System.out.print(",");});
        System.out.println();
        //equals to:
        Predicate<String> predicate = x->x.startsWith("J");
        list.stream().filter(predicate).forEach(x-> {System.out.print(x);System.out.print(",");});
        System.out.println();
        //you can also cascade predicates
        Predicate<String> predicate2 = x->x.endsWith("a");
        //cascade predicates with and
        list.stream().filter(predicate.and(predicate2)).forEach(System.out::print);
        System.out.println();
        //equals to:
        list.stream().filter(predicate).filter(predicate2).forEach(System.out::print);
        System.out.println();
        //cascade predicates with or
        list.stream().filter(predicate.or(predicate2)).forEach(x->{System.out.print(x);System.out.print(",");});
    }
}
