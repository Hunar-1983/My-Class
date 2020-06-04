package src.day47_Abstraction;

public class DriverObjects {
    public static void main(String[] args) {
        String URL = "https://www.google.com";
        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);

        driver.quit();

        System.out.println("==================================");

        FirefoxDriver driver2 = new FirefoxDriver();

        driver2.get("https://www.google.com");
        driver2.quit();

        System.out.println("==================================");

        OperaDriver driver3 = new OperaDriver();
        driver3.get("https://www.google.com");
        driver3.quit();

        System.out.println("==================================");

        EdgeDriver driver4 = new EdgeDriver();
        driver4.get("https://www.google.com");
        driver4.quit();
    }
}
