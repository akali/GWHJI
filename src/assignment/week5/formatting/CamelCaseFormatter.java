package assignment.week5.formatting;

public class CamelCaseFormatter implements Formatter {
    @Override
    public String format(String input) {
        String result = "";
        for (int i = 0; i < input.length(); ++i) {
            char c = input.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (i > 0) {
                    char previous = input.charAt(i - 1);
                    if (!Character.isAlphabetic(previous)) {
                        c = Character.toUpperCase(c);
                    }
                }
                result += c;
            }
        }
        return result;
    }
}
