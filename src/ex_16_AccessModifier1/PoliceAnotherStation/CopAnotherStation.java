package ex_16_AccessModifier1.PoliceAnotherStation;
import ex_16_AccessModifier1.Police.Cop;

public class CopAnotherStation extends Cop {

    public CopAnotherStation(int bullet) {
        super(bullet);
    }

    static void main(String[] args) {
        System.out.println("Using Cop class member INSIDE Another packasge class: CopAnotherStation");

        CopAnotherStation cas = new CopAnotherStation(5);
        System.out.println(cas.iCardProtected);
        //System.out.println(cas.internalPswdDefault); //'internalPswdDefault' is not public in 'ex_16_AccessModifier1.Police.Cop'. Cannot be accessed from outside package
        cas.canIShootProtected(); //REASONNN
       // cas.thisDefaultF1(); //'thisDefaultF1()' is not public in 'ex_16_AccessModifier1.Police.Cop'. Cannot be accessed from outside package

        Cop c1 = new CopAnotherStation(5);
        c1.IamPublicMethod();
        //c1.canIShootProtected(); REASONNN // //'internalPswdDefault' is not public in 'ex_16_AccessModifier1.Police.Cop'. Cannot be accessed from outside package
        // c1.thisDefaultF1(); ////'thisDefaultF1()' is not public in 'ex_16_AccessModifier1.Police.Cop'. Cannot be accessed from outside package

        Cop cop1 = new Cop(5);
        System.out.println(cop1.namePublic);
        //System.out.println(cop1.gunPrivate); //'gunPrivate' has private access in 'ex_16_AccessModifier1.Police.Cop'
        // System.out.println(cop1.iCardProtected); //'iCardProcted' has protected access in 'ex_16_AccessModifier1.Police.Cop'
        //System.out.println(cop1.internalPswdDefault); //'internalPswdDefault' is not public in 'ex_16_AccessModifier1.Police.Cop'. Cannot be accessed from outside package

        cop1.IamPublicMethod();
        // cop1.IamPrivateMethod(); //Cannot resolve method 'IamPrivateMethod' in 'JuniorCop'
        // cop1.canIShootProtected(); //'canIShootProtected()' has protected access in 'ex_16_AccessModifier1.Police.Cop'
        // cop1.thisDefaultF1(); //'thisDefaultF1()' is not public in 'ex_16_AccessModifier1.Police.Cop'. Cannot be accessed from outside packag


/*      REASONNN
       Question :  With Parent type reference + Child object, it is NOT allowing to call protected members
                    but with Child type reference + Child object, it is allowing to call protected members

        This behavior is related to how inheritance and access modifiers work in object-oriented programming languages
         like Java or C#. The core reason lies in the distinction between declared type and actual type,
         and how the protected keyword functions [1].
        Key Concepts
        protected Access: Members declared as protected are accessible within the same class, within all subclasses
              (regardless of the package), and within all other classes in the same package as the defining class.
        Compile-Time Checks: The compiler verifies access permissions based on the declared type (the reference type)
              of the variable, not the actual object type at runtime [1].
            Interview::above line
       */




    }

}
