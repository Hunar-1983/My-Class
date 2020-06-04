package src.day47_Abstraction;

public final class EdgeDriver extends RemoteWebDriver {
    @Override
    protected void get(String URL) {
        System.out.println("Opening "+ URL + " in the edge browser");
    }

    @Override
    public void quit() {
        System.out.println("Closing the edge browser");

    }
}
