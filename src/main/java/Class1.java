/**
 * Created by Alex on 5/14/2017.
 */
public class Class1 {
    private int i = 1;

    private static int doNothingMethodPrivateStatic() {
        return 5+2;
    }

    private void doNothingMethod() {

    }

    private final String doNothingFinalMethod() {
        return "nothing";
    }

    private static final int doNothingPrivateStaticFinalMethod() {
        return 1;
    }


    public void publicMethod() {
        usedPrivateMethod();
    }

    private void usedPrivateMethod() {

    }


}
