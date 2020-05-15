package src.day40_Encapsulation;

public class Person {

    public String name;;

    private long SNN;
    private int ID;

    public Person(String name){
        this.name = name;
    }

    public long getSNN (){
        return SNN;
    }

    public void setSNN(long SSN){
        this.SNN = SSN;
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setNameAndID(long SSN, int ID){
        setSNN(SNN);
        setID(ID);
    }


}
