package au.com.blinkmobile.cordova.sketch;

public class Manager {
    private static final Manager SINGLE_INSTANCE = new Manager();
    public String inputData;
    public static Manager getInstance() { return SINGLE_INSTANCE; }

    public Manager() { inputData = null; }
}