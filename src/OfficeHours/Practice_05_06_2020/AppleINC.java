package src.OfficeHours.Practice_05_06_2020;

import src.day24_Methods.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleINC {

    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.setInfo("Onur", "Junior Tester", 75000, 1234);

        Tester tester2 = new Tester();
        tester2.setInfo("Elton John", "Junior Tester", 75000, 1245);

        Tester tester3 = new Tester();
        tester3.setInfo("Rahman", "SDET", 120000, 22222);

        ScrumTeam scrum1 = new ScrumTeam(); // we can use the arraylists in scrumteam class
        scrum1.hireATester(tester3);
        scrum1.hireATester(tester1);
        scrum1.hireATester(tester2);

        //scrum1.fireATester(1245);

        // scrum1.testersTeam // returns the testersTeam arrayList form scrum1
        for (Tester each : scrum1.testersTeam) { // prints out everysingle tester from scrumteam
            System.out.println(each);
        }


        System.out.println("=====================================");

        Developer dev1 = new Developer();
        dev1.setInfo("Barzy", "Senior Developer", 120200, 1122337);

        Developer dev2 = new Developer();
        dev2.setInfo("Emrah", "Usta Developer", 100000, 223232);

        scrum1.hireADeveloper(dev1);
        scrum1.hireADeveloper(dev2);


        // scrum1.fireADeveloper(1122337);

        System.out.println(scrum1.devpTeam.size());

        for (Developer each : scrum1.devpTeam) { // arraylist of developer in scrum team
            System.out.println(each);
        }

        System.out.println("====================================================");

        System.out.println("In my scrum team, We have " + scrum1.testersTeam.size()
                + " testers and " + scrum1.devpTeam.size() + " developers");


        Tester teste1 = new Tester();
        tester1.setInfo("kardo", "SDET", 120000, 23546);

        Tester teste2 = new Tester();
        tester2.setInfo("Falah", "Jonior SDET", 90000, 726352);

        ScrumTeam scrum2 = new ScrumTeam();
        scrum2.hireATester(tester1);
        scrum2.hireATester(tester2);

        for (Tester each : scrum2.testersTeam) {
            System.out.println(each);
        }

        Developer developer1 = new Developer();
        developer1.setInfo("Hunar", "Sinior Developer", 200000, 265254);

        Developer developer2 = new Developer();
        developer2.setInfo("Adil", "Developer", 180000, 2615354);

        Developer developer3 = new Developer();
        developer3.setInfo("Rahman", "Developer", 190000, 162541);

        Developer developer4 = new Developer();
        developer4.setInfo("Barzi", "Developer", 185000, 26543);

        scrum2.hireADeveloper(developer1);
        scrum2.hireADeveloper(developer2);
        scrum2.hireADeveloper(developer3);
        scrum2.hireADeveloper(developer4);

        for (Developer each : scrum2.devpTeam) {
            System.out.println(each);
        }


        Tester test1 = new Tester();
        test1.setInfo("tareq", "Jonior SDET", 100000, 162542);

        Tester test2 = new Tester();
        test2.setInfo("Karwan", "Sinior SDET", 150000, 2564323);

        Tester test3 = new Tester();
        test3.setInfo("Mohammad", "SDET", 119000, 1241542);

        ScrumTeam scrum3 = new ScrumTeam();
        scrum3.hireATester(test1);
        scrum3.hireATester(test2);
        scrum3.hireATester(test3);

        for (int i = 0; i < scrum3.testersTeam.size(); i++) {
            System.out.println(scrum3.testersTeam.get(i));
        }

        Developer develop1 = new Developer();
        develop1.setInfo("Zana", "Sinior Developer", 175000, 26543);

        Developer develop2 = new Developer();
        develop2.setInfo("Dana", "Developer", 160000, 2543234);

        Developer develop3 = new Developer();
        develop3.setInfo("Twana", "jinior Developer", 130000, 587632);

        Developer develop4 = new Developer();
        develop4.setInfo("Rebaz", "Developer", 145000, 987785);

        Developer develop5 = new Developer();
        develop5.setInfo("Rebar", "Developer", 147000, 958756463);

        scrum3.hireADeveloper(develop1);
        scrum3.hireADeveloper(develop2);
        scrum3.hireADeveloper(develop3);
        scrum3.hireADeveloper(develop4);
        scrum3.hireADeveloper(develop5);

        for (int i = 0; i < scrum3.devpTeam.size(); i++) {
            System.out.println(scrum3.devpTeam.get(i));
        }


            ScrumTeam [] scrums = {scrum1, scrum2, scrum3};
        for (ScrumTeam each : scrums){
            for (Tester each2 : each.testersTeam){
                if (each2.salary > 120000){
                    System.out.println(each2);
                }
            }
            for (Developer each3 : each.devpTeam){
                if (each3.salary < 120000){
                    System.out.println(each3);
                }
            }
        }

        ArrayList<ScrumTeam> scrums1 = new ArrayList<>();
        scrums1.addAll(Arrays.asList(scrum1, scrum2, scrum3));

        for (ScrumTeam each : scrums1){
                if (each.testersTeam.removeIf( p -> p.salary < 100000)){
                    System.out.println(each.testersTeam);
                }
                if (each.devpTeam.removeIf( p -> p.salary < 120000)){
                    System.out.println(each.devpTeam);
                }
            }
        }





        /*
        create scrum2: 4 developers, 2 testers
        create scrum3: 5 developers, 3 testers
        create an array of scrum: {scrum1, scrum2, scrum3};
            1. iterator the array to print out all the testers who have salary > 120000
            2. print out all the developers who have salary < 120000
        create an ArrayList of scrum: {scrum1, scrum2, scrum3};
               1. remove all the testers who have salary < 100000
               2. remove all the developers who have salary < 120000
           NOTE: DO NOT create any ArrayList of Testers or Developers.
                Use the ArrayLists in ScrumTeam class only
         */
            }


