package testing;

public class Sample<I, O> {
    public I input;
    public O output;
    public String[] explanation;

    public String getMessage() {
        return String.join("\n", explanation);
    }
}
