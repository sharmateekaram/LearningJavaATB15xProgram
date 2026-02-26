package ex_16_AccessModifier1.Police;


public class JuniorCop{

    static void main(String[] args) {
        System.out.println("Using Cop class member INSIDE Junior cop class");

        Cop juniorcop = new Cop(5);
        System.out.println(juniorcop.namePublic);
        //System.out.println(juniorcop.gunPrivate); //'gunPrivate' has private access in 'ex_16_AccessModifier1.Police.Cop'
        System.out.println(juniorcop.iCardProtected);
        System.out.println(juniorcop.internalPswdDefault);

        juniorcop.IamPublicMethod();
        //JuniorCop.IamPrivateMethod(); //Cannot resolve method 'IamPrivateMethod' in 'JuniorCop'
        juniorcop.canIShootProtected();
        juniorcop.thisDefaultF1();
    }

}
