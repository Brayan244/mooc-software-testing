package tudelft.romanNumeral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    private RomanNum romanNum;

    @BeforeEach
    public void initialize(){
        this.romanNum = new RomanNum();
    }

    @Test
    public void singleNumber() {
        int result = romanNum.convertToInt("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void multipleNumbers() {
        int result = romanNum.convertToInt("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void substractiveNotation () {
        int result = romanNum.convertToInt("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void complexNumeral(){
        int result = romanNum.convertToInt("XIX");
        Assertions.assertEquals(19, result);
    }

    @Test
    public void invalidRomanNumeral(){
        int result = romanNum.convertToInt("IC");
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void numeralWhitLowerCases() {
        int result = romanNum.convertToInt("XiX");
        Assertions.assertEquals(19, result);
    }

    @Test
    public void bigRomanNumeral() {
        int result = romanNum.convertToInt("MCMLXXXVIII");
        Assertions.assertEquals(1988, result);
    }

    @Test
    public void nonRomanNumeralInput() {
        int result = romanNum.convertToInt("Hi!!");
        Assertions.assertEquals(-1, result);
    }
}
