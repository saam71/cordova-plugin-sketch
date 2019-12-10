package au.com.blinkmobile.cordova.sketch;

public class SingleManager {
    private static final SingleManager SINGLE_INSTANCE = new SingleManager();
    public String inputData;

    public static SingleManager getInstance() { return SINGLE_INSTANCE; }

    public SingleManager() { inputData = null; }
}