import java.util.*;

// Define the HealthAdviceResource class
public abstract class HealthAdviceResource {
    protected int id;
    protected List<String> keywords;
    protected String rubric;

    public abstract void open();

    public abstract void close();
}
