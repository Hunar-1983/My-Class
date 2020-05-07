package src.day35_Static;
/*
 1. use for loop to print out the info of each offer
            2. write a program that can only retain the offers if:
                    1. the offer is for fulltime position
                    2. offer is from your local area
                    3. salary is greater than 100K
 */
import java.util.ArrayList;
import java.util.Arrays;

public class OfferObject {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
            offer1.setInfo("VA", "BOA", 100000, true);

        Offer offer2 = new Offer();
        offer2.setInfo("KY", "CapitalOne", 120000, false);

        Offer offer3 = new Offer();
        offer3.setInfo("MD", "Chase", 95000, true);

        Offer offer4 = new Offer();
        offer4.setInfo("BayArea", "Google", 115000, false);


        Offer [] offers = {offer1, offer2,offer3, offer4};

        String myLocation = "VA";
        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList(offers));
        //Accept.removeIf( each -> each.salary < 100000 || each.isFullTime == false || !each.location.equals(myLocation));
        Accept.removeIf( p -> p.salary < 100000);
        Accept.removeIf(p -> p.isFullTime == false);
        Accept.removeIf(p -> !p.location.equals(myLocation));
        for (Offer eachOffer : Accept) {
                System.out.println(eachOffer);
            }




    }
}
