package src.My_Practice.homeWorke;

import src.Important.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setOfferInfo("Local", "HM", 120000, true);
        Offer offer2 = new Offer();
        offer2.setOfferInfo("Local", "DotNet", 100000, false);
        Offer offer3 = new Offer();
        offer3.setOfferInfo("International", "Soma", 40000, false);
        Offer offer4 = new Offer();
        offer4.setOfferInfo("International", "DotNet", 80000, true);
        Offer offer5 = new Offer();
        offer5.setOfferInfo("Local", "Cyber", 130000, false);


        ArrayList<Offer> offers = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4, offer5));

        for (Offer eachOffer : offers) {
            System.out.println(eachOffer);
        }
        System.out.println("=========================================");
        for (Offer eachOffer : offers) {
            if (eachOffer.isFullTime && eachOffer.location.equals("Local") && eachOffer.salary >= 100000) {
                System.out.println(eachOffer);
            }

        }
    }
}