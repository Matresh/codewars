package main;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOdd {
    /*
    *
    * Given an array of integers, find the one that appears an odd number of times.

      There will always be only one integer that appears an odd number of times.
    * */
    public static int findIt(int[] a) {
        Map<Integer, Long> frequency_map = Arrays.
                stream(a).
                boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return frequency_map.
                entrySet().
                stream().
                filter(x -> x.getValue() %2 == 1).
                findAny().
                orElseThrow().
                getKey();
    }
}