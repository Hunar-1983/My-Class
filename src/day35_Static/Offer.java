package src.day35_Static;
/*
. Create a class called Offer that has:
    instance fields :
            location, company, salary , isFullTime
    instance methods :
        setOfferInfo: can set the location, company, salary , isFullTime of the offer
        toString -- print all info about offers
    create a class called MyOffers
        Create 5 offer objects, and add them into the list of offers, and then:
            1. use for loop to print out the info of each offer
 */
public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;

    public void setInfo(String location, String company, double salary, boolean isFullTime){
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString (){
        return "Location: "+location+", Company: "+company+", Salary: $"+salary+", This offer is full time: "+isFullTime;
    }


}
