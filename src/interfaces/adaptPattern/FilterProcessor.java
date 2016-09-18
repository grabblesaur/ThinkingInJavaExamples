package interfaces.adaptPattern;

/**
 * Created by qqq on 01.05.2016.
 */
class FilterAdapter implements Processor {
    Filter mFilter;

    public FilterAdapter(Filter filter) {
        mFilter = filter;
    }

    @Override
    public String name() {
        return mFilter.name();
    }

    @Override
    public Waveform process(Object input) {
        return mFilter.process(((Waveform) input));
    }
}

public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
}
