package main;

public class DRoot {

    public static int sum_on_numeric_value(String string){
        return string.chars()
                .map(Character::getNumericValue)
                .sum();
    }
    public static int digital_root(int n) {
        var result = sum_on_numeric_value(String.valueOf(n));
        if (String.valueOf(result).length()>1){
            return digital_root(result);
        }
        else{
            return result;
        }
    }
}
