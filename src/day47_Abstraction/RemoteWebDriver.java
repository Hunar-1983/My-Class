package src.day47_Abstraction;

public abstract class RemoteWebDriver {
    protected abstract void get(String URL);

    public abstract void quit();

}
