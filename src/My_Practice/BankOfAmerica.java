package src.My_Practice;

import src.Important.Array;
import src.day34_CustomClass.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {

        Testers tester1 = new Testers();
        tester1.setTesterInfo("Roshna", 12345, "SDET", 12345);

        Testers tester2 = new Testers();
        tester1.setTesterInfo("Hasti", 6789, "SDET", 56789);
        Testers [] testersTeam = {tester1, tester2};
        ArrayList<Testers> TesterTeam = new ArrayList<>(Arrays.asList(tester1, tester2));

        developer developer1 = new developer();
        developer1.setDeveloperInfo("Hunar", 1234, "Developer", 1234);

        developer developer2 = new developer();
        developer2.setDeveloperInfo("Dosti", 12, "Developer", 6758);

        developer developer3 = new developer();
        developer3.setDeveloperInfo("Rahman", 5876, "Developer", 28932322);

        developer developer4 = new developer();
        developer4.setDeveloperInfo("Barzi", 24323, "Developer", 398028);

        developer [] developersTeam = {developer1, developer2, developer3, developer4};

        ArrayList<developer> DevelopersTeam = new ArrayList<>(Arrays.asList(developer1, developer2, developer3, developer4));

        ArrayList <ScrumTeam> team = new ArrayList<>();
        for (int i =0; i < team.size(); i++){
        }




    }
}
