package src.day47_Abstraction;

public final class OperaDriver extends RemoteWebDriver {

    @Override
    protected void get(String URL) {
        System.out.println("Opening "+ URL + " in the opera browser");
    }

    @Override
    public void quit() {
        System.out.println("Closing the opera browser");
    }
}
