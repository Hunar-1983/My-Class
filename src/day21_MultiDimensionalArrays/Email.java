package src.day21_MultiDimensionalArrays;
/*
given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "
        Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elements could be more in the array
    print all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
 */
public class Email {
    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for (String each : emails) {
            if (each.endsWith("@gmail.com")) {
                continue;
            }
            System.out.println(each);


        }
    }
}