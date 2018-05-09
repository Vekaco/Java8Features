package java8.feature.feature2;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vekaco
 * @comment iterator for list
 */
public class Feature2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","Android", "Python","Redis");

        //traditional
        for(String str : list) {
            System.out.print(str);
            System.out.print(",");
        }
        System.out.println();
        //with list forEach(since 1.8) and lambda
        list.forEach(x-> {System.out.print(x);System.out.print(",");});
        System.out.println();
        //you can also handle element modification in lambda
        list.forEach(x->{String upper = x.toUpperCase();System.out.print(upper);System.out.print(",");});
        System.out.println();
    }
}
