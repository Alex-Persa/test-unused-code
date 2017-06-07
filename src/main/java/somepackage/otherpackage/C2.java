package somepackage.otherpackage;

/**
 * Created by Alex on 5/14/2017.
 */
public class C2 implements I1 {
    char[] defaultCharUnused;
    private char[] privateCharUnused;
    public char[] publicCharUnused;
    protected char[] protectedCharUnused;

    private int privateInitializedUnused = 1;
    private int privateInitializedUsed = 1;
    private int privateUsed;



    public void donothing(int usedInt, String unusedString) {
        usedMethodWithUnusedVar(usedInt);
    }

    private void usedMethodWithUnusedVar(int unusedParamInt) {

    }

    public int useSomeVars() {
        return privateInitializedUsed + privateUsed;
    }


}
