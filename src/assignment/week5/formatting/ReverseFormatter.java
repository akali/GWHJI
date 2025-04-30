package assignment.week5.formatting;

import java.util.Collections;

public class ReverseFormatter implements Formatter {
    @Override
    public String format(String input) {
        String result = "";
        for (char c : input.toCharArray()) {
            result = c + result;
        }
        return result;
    }
}
