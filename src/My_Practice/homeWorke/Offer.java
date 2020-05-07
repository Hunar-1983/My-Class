package src.My_Practice.homeWorke;

public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;

    public void setOfferInfo(String location, String company, double salary, boolean isFullTime){
    this.location = location;
    this.company = company;
    this.salary = salary;
    this.isFullTime = isFullTime;
    }

    public String toString (){
        return "Location is: "+ location+", Company name is: "+company+", Salary is: "+salary+", This offer is: "+isFullTime;
    }

}
