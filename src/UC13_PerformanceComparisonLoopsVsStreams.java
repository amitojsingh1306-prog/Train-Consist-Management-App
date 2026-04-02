import java.util.*;

public class UC13_PerformanceComparisonLoopsVsStreams {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40,50);

        int sum1 = 0;
        for(int n : list)
            sum1 += n;

        int sum2 = list.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Loop Sum = " + sum1);
        System.out.println("Stream Sum = " + sum2);
    }
}