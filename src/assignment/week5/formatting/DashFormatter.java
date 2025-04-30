package assignment.week5.formatting;

public class DashFormatter implements Formatter {
    @Override
    public String format(String input) {
        return input.replace(' ', '-');
    }
}
