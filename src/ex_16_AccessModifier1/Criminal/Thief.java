package ex_16_AccessModifier1.Criminal;

import ex_16_AccessModifier1.Police.Cop;

public class Thief {

    static void main(String[] args) {
        System.out.println("Using Cop class member INSIDE thief cop class");

        Cop thief = new Cop(5);
        System.out.println(thief.namePublic);
        //System.out.println(thief.gunPrivate); //'gunPrivate' has private access in 'ex_16_AccessModifier1.Police.Cop'
        //System.out.println(thief.iCardProtected); //'iCardProtected' has protected access in 'ex_16_AccessModifier1.Police.Cop
        //System.out.println(thief.internalPswdDefault); //'internalPswdDefault' is not public in 'ex_16_AccessModifier1.Police.Cop'. Cannot be accessed from outside package

        thief.IamPublicMethod();
        //thief.IamPrivateMethod(); //Cannot resolve method 'IamPrivateMethod' in 'JuniorCop'
        //thief.canIShootProtected(); //'canIShootProtected()' has protected access in 'ex_16_AccessModifier1.Police.Cop
        //thief.thisDefaultF1(); //'thisDefaultF1()' is not public in 'ex_16_AccessModifier1.Police.Cop'. Cannot be accessed from outside packag
    }
}
