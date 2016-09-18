package interfaces.adaptPattern;

import java.util.Arrays;

public abstract class StringProcessor implements Processor{
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);

    public static String s = "Hello World!";

    public static void main(String[] args) {
        Apply.process(new UpCase(), s);
        Apply.process(new DownCase(), s);
        Apply.process(new Splitter(), s);
        Apply.process(new Change(), s);
    }
}

class UpCase extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class DownCase extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

class Change extends StringProcessor {

    @Override
    public String process(Object input) {
        return ((String) input).replaceAll(" ", "||");
    }
}

