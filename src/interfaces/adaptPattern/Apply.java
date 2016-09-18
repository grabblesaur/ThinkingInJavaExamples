package interfaces.adaptPattern;

/**
 * Created by qqq on 01.05.2016.
 */
public class Apply {
    public static void process(Processor processor, Object object) {
        System.out.println("Using Processor " + processor.name());
        System.out.println(processor.process(object));
    }
}
