
import java.util.*;

// Define the abstract Chat class
public abstract class Chat {
    protected int id;
    protected String name;
    protected List<String> messages;

    public abstract void open();

    public abstract void close();

    public abstract String getUserInput();

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(String message);

    public abstract void displayMessage(String message);
}