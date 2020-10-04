package main;

import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution{

    public static String toCamelCase(String s){
        var result = new StringBuilder();
        var split_strings = new ArrayList<>(Arrays.asList(s.split("[_-]")));
        result.append(split_strings.remove(0));
        for (String sub_string:split_strings){
            var capitalized = sub_string.substring(0, 1)
                    .toUpperCase()
                    +sub_string.substring(1);
            result.append(capitalized);
        }
        return result.toString();
    }
}