package katas.katas.RomanNumbers;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;


public class RomanNumbersTest {
    private RomanNumbers romanNumbers = new RomanNumbers();

    @Test
    public void pass1toRoman() {
        String roman = romanNumbers.passToRoman(1);

        assertThat(roman, equals("I"));
    }

    @Test
    public void pass2toRoman() {
        String roman = romanNumbers.passToRoman(2);

        assertThat(roman, equals("II"));
    }

    @Test
    public void pass3toRoman() {
        String roman = romanNumbers.passToRoman(3);

        assertThat(roman, equals("III"));
    }

    @Test
    public void pass4toRoman() {
        String roman = romanNumbers.passToRoman(4);

        assertThat(roman, equals("IV"));
    }

    @Test
    public void pass5toRoman() {
        String roman = romanNumbers.passToRoman(5);

        assertThat(roman, equals("V"));
    }

    @Test
    public void pass6toRoman() {
        String roman = romanNumbers.passToRoman(6);

        assertThat(roman, equals("VI"));
    }

    @Test
    public void pass7toRoman() {
        String roman = romanNumbers.passToRoman(7);

        assertThat(roman, equals("VII"));
    }

    @Test
    public void pass8toRoman() {
        String roman = romanNumbers.passToRoman(8);

        assertThat(roman, equals("VIII"));
    }

    @Test
    public void pass9toRoman() {
        String roman = romanNumbers.passToRoman(9);

        assertThat(roman, equals("IX"));
    }
}
