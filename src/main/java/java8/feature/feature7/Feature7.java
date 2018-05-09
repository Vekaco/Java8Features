package java8.feature.feature7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Vekaco
 * @comment sort with comparator
 */
public class Feature7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("44", "21", "33", "11");
        //forEach to print out the original natural order
        list.stream().forEach(x-> System.out.printf("%s,",x));
        System.out.println();
        //sort() with lambda, ASC
        list.sort((m,n)->m.compareTo(n));
        list.stream().forEach(x-> System.out.printf("%s,",x));
        System.out.println();
        //comparator with lambda, DESC(customized)
        Comparator<String> comparator = (m,n)->m.compareTo(n);
        list.sort(comparator.reversed());
        list.forEach(x-> System.out.printf("%s,",x));
    }
}
