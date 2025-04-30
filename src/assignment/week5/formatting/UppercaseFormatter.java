package assignment.week5.formatting;

public class UppercaseFormatter implements Formatter {
    @Override
    public String format(String input) {
        String result = "";
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            result += c;
        }
        return result;
    }
}
