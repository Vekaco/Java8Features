package java8.feature.feature11;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * @author Vekaco
 * @comment with statistics and get the min, max, sum,count or average. There are Int/Long/DoubleStream and corresponding Int/Long/DoubleSummaryStatistics.
 */

public class Feature11 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2,3,5,7,11,13,17,19,23,29);
        //get corresponding *SummaryStatistics with summaryStatistics()
        IntSummaryStatistics statistics = primes.stream().mapToInt(x->x).summaryStatistics();
        //get max
        System.out.printf("Max:%s\n",statistics.getMax());
        //get min
        System.out.printf("Min:%s\n",statistics.getMin());
        //get sum
        System.out.printf("Sum:%s\n",statistics.getSum());
        //get average
        System.out.printf("Avg:%s\n",statistics.getAverage());
        //get count
        System.out.printf("Count:%s\n",statistics.getCount());
    }
}
