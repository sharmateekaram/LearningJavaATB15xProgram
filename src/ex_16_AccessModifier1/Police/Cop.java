package ex_16_AccessModifier1.Police;

public class Cop {

    public String namePublic ="CopAkash";
    private int gunPrivate;
    protected String iCardProtected ="iCard123";
    String internalPswdDefault = "CopPswd@9876@#";

    public Cop(int bullet) {
        this.gunPrivate = bullet;
    }



    public void IamPublicMethod(){
        System.out.println("I am public method to Cop class");
    }
    private void IamPrivateMethod(){
        System.out.println("I am private method to Cop class");
    }
    protected void canIShootProtected() {
        System.out.println("Yes you can !! as This is protected method");
    }
    void thisDefaultF1() {
        System.out.println("Hi, Cop! this is default");
    }


}
