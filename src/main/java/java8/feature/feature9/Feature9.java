package java8.feature.feature9;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vekaco
 * @comment match() streamAPI
 */
public class Feature9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","Scala","C++","NET","JSP");
        //return true if any element matched.
        boolean ifAny = list.stream().anyMatch(x->x.startsWith("J"));
        //return true if all elements matched.
        boolean ifAll = list.stream().allMatch(x->x.startsWith("J"));

        System.out.printf("If any element start with 'J'? %s\nIf all the elements start with 'J'? %s",ifAny,ifAll);
    }
}
