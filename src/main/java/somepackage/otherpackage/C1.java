package somepackage.otherpackage;

/**
 * Created by Alex on 5/14/2017.
 */
public class C1 implements I1 {
    char[] defaultCharUnused;
    private char[] privateCharUnused;
    public char[] publicCharUnused;
    protected char[] protectedCharUnused;

    private int privateInitializedUnused = 1;
    private int privateInitializedIncremeted = 1;
    private int privateUsed;

    private static final int uncalledPrivateStaticFinalMethod() {
        return 1;
    }

    public void donothing(int usedInt, String unusedString) {
        usedMethodWithUnusedVar(usedInt);
    }

    private void usedMethodWithUnusedVar(int unusedInt) {
        System.out.println("nothing");
    }

    public void useSomeVars() {
        privateInitializedIncremeted ++;
        privateUsed = privateUsed + 1;
    }


}
