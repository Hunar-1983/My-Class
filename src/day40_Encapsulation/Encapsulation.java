package src.day40_Encapsulation;

public class Encapsulation {
    private long SSN;
 // getter only return the value of private variable not for setting value(giving value);
    public long getSSN(){  // this method helping us to get the SSN value rather than it's private;
        return SSN;
    }
   // setter helping us to set a value to private variable in another class;
    public void setSSN(long SSN) {
        this.SSN = SSN;
    }
}
