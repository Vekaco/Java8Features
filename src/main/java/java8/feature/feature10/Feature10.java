package java8.feature.feature10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @autor Vekaco
 * @comment alter or concat elements in the list with lambda expression and collectors
 */
public class Feature10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","c", ".net");
        //uppercase elements and concat them with delimiter ',' into string.
        String string = list.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
        //uppercase elements and collect them into new list
        List<String> upperCased = list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
        System.out.printf("Concat String:%s\nUppercased list:%s",string,upperCased);
    }
}
