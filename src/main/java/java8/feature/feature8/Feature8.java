package java8.feature.feature8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vekaco
 * @comment collect, count and distinct with Collectors
 */

public class Feature8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abcd","ef", "abcdef","wrs","wrs");
        //filter out the elements whose length is greater than 2 and collect them in new list;
        List<String> filteredList = list.stream().filter(x->x.length()>2).collect(Collectors.toList());
        //count the  number of the elements whose length is greater than 2 in the origin
        Long count = list.stream().filter(x->x.length()>2).collect(Collectors.counting());
        //equals to:
        Long count2 = list.stream().filter(x->x.length()>2).count();
        System.out.printf("Original List: %s\nFiltered List:%s\nThere are %s(%s) elements whose length is greater than 2 in the origin",list,filteredList,count,count2);
        System.out.println();
        //get the first element after filtered.
        String firstElement = list.stream().filter(x->x.length()>2).findFirst().get();
        //distinct after filtered.
        List<String> distinctList = list.stream().filter(x->x.length()>2).distinct().collect(Collectors.toList());
        System.out.printf("The first element:%s\nList after distinct:%s",firstElement,distinctList);
    }
}
