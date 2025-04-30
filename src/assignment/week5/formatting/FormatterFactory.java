package assignment.week5.formatting;

import java.util.HashMap;
import java.util.Map;

public class FormatterFactory {
    private static final Map<String, Formatter> formatters;
//    init block
    static {
        Formatter lower = new LowercaseFormatter();
        Formatter upper = new UppercaseFormatter();
        Formatter dash = new DashFormatter();
        Formatter reverse = new ReverseFormatter();
        Formatter camelCase = new CamelCaseFormatter();
        formatters = new HashMap<>(){{
            put("LowercaseFormatter", lower);
            put("UppercaseFormatter", upper);
            put("DashFormatter", dash);
            put("ReverseFormatter", reverse);
            put("CamelCaseFormatter", camelCase);
        }};
    }

    public static Formatter getFormatter(String name) {
        return formatters.get(name);
    }
}
