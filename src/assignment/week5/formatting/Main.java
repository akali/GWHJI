package assignment.week5.formatting;

public class Main {
    static String formatAll(Formatter[] formatters, String input) {
        for (Formatter f : formatters) {
            input = f.format(input);
        }
        return input;
    }
    public static void main(String[] args) {
        String test = "This is a text";
        Formatter lower = new LowercaseFormatter();
        Formatter upper = new UppercaseFormatter();
        Formatter dash = new DashFormatter();
        System.out.println(lower.format(test));
        System.out.println(upper.format(test));
        System.out.println(dash.format(test));

        System.out.println(FormatterFactory.getFormatter("DashFormatter").format(test));
        System.out.println(FormatterFactory.getFormatter("CamelCaseFormatter").format(test));
        System.out.println(formatAll(new Formatter[]{
                FormatterFactory.getFormatter("DashFormatter")
        }, test));
    }
}
