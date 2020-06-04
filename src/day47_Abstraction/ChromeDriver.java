package src.day47_Abstraction;

public final class ChromeDriver extends RemoteWebDriver{
    public void get(String URL){
        System.out.println("Opening "+ URL + " in chrome browser");
    }
    public void quit(){
        System.out.println("Closing the chrome browser");
    }
}
