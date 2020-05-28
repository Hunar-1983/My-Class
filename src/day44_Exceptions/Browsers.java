package src.day44_Exceptions;
/*
1. create a class called Browsers
			actions: openBrowser(): opens the default browser
					 closeBrowser(): closes the default browser
	2. create a class called ChromeBrowser
			actions: openBrowser(): opens the chrome browser
					 closeBrowser(): closes the chrome browser
	3. creata a class called FirefoxBrowser
			actions: openBrowser(): opens the Firefox browser
					 closeBrowser(): closes the Firefox browser
	4. create a class called Opera browser
			actions: openBrowser(): opens the Opera browser
					 closeBrowser(): closes the Opera browser
	5. create a class called Test:
			create an object of each browsers and call the openBrowser & closeBrowser actions
 */
public class Browsers {

    public void openBrowser(){
        System.out.println("open the default browser");
    }
    public void closeBrowser(){
        System.out.println("closes the default browser");
    }
}

class ChromeBrowser extends  Browsers{
    public void openBrowser() {
        System.out.println("open the chrome browser");
    }

    public void closeBrowser(){
        System.out.println("close the chrome browser");
    }
}

class FirefoxBrowser extends Browsers{
    public void openBrowser() {
        System.out.println("open the Firefox browser");
    }

    public void closeBrowser(){
        System.out.println("close the Firefox browser");
    }
}

class OperaBrowser extends Browsers {
    public void openBrowser() {
        System.out.println("open the opera browser");
    }

    public void closeBrowser(){
        System.out.println("close the opera browser");
    }
}


class Test {
    public static void main(String[] args) {

        ChromeBrowser obj1 = new ChromeBrowser();
        obj1.openBrowser();
        obj1.closeBrowser();


        FirefoxBrowser obj2 = new FirefoxBrowser();
        obj2.openBrowser();
        obj2.closeBrowser();


        OperaBrowser obj3 = new OperaBrowser();
        obj3.openBrowser();
        obj3.closeBrowser();

    }
}

