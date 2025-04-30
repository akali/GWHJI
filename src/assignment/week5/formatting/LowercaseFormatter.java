package assignment.week5.formatting;

public class LowercaseFormatter implements Formatter {
    @Override
    public String format(String input) {
        String result = "";
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            result += c;
        }
        return result;
    }
}
