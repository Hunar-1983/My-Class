package resources;

import src.day39_AccessModifiers.AccessModifiers;
public class AccessModifier_Test {
    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
        // System.out.println(  obj..defaultAccess  ); can not compiler because default access modifier visible just in the same package;
        System.out.println(  obj.publicAccess  ); // it's compiler because it's visible everywhere;

    }
}
