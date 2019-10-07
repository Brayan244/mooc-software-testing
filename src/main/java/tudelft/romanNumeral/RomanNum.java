package tudelft.romanNumeral;


import java.util.HashMap;
import java.util.Map;

public class RomanNum {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    private int extractValue(char stringValue) {
        return map.get(stringValue);
    }

    public int convertToInt(String numeralString){
        int LENGTH = numeralString.length();
        int finalValue = 0;

        for(int i = 0; i < LENGTH; i++) {
            int currentValue = this.extractValue(numeralString.charAt(i));
            int nextValue = i+1 < LENGTH ? this.extractValue(numeralString.charAt(i+1)): 0;

            if(currentValue >= nextValue) {
                finalValue += currentValue;
            } else {
                finalValue -= currentValue;
            }
        }

        return finalValue;
    };
}
