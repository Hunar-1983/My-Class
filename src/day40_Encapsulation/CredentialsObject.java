package src.day40_Encapsulation;

public class CredentialsObject {
    public static void main(String[] args) {

        Credentials facebook = new Credentials();

        facebook.setUserName("hwnar23_hm@yhaoo.com");
        facebook.setPassWord("12345");

        System.out.println(  facebook.getUserName()  );
        System.out.println(  facebook.getPassWord()  );

    }
}
