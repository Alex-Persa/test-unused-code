package somepackage;

import java.util.function.IntPredicate;
import java.util.prefs.PreferenceChangeListener;

/**
 * Created by Alex on 5/14/2017.
 */
public class Class1 {
    private int unusedPrivateIntVar1 = 1;
    private String usedGlobalPrivateStr;
    private static String unUsedGlobalPrivateStaticStr;

    private static int unusedPrivateStaticMethod() {
        return 5+2;
    }

    private void uncalledPrivateMethod() {

    }

    private final String unusedFinalMethod(String unusedParamStr, int unusedParamInt, String usedParamVarStr) {
        int unusedLocal;
        int unusedLocalInitialized = 1;
        Object usedLocal;
        usedLocal = new Object();
        System.out.println(usedLocal.hashCode());

        {
            String unusedInLocalBlock = "dasda";
        }

        return usedParamVarStr;
    }


    public void publicMethod() throws Exception {
        usedPrivateMethod(1, usedGlobalPrivateStr);
        try {

        } catch (Exception e) {
            throw new Error("asd");
        }

        IntPredicate intPredicate = (int a) -> {
            int b = a;
            a -= 1;
            return b == 0;
        };

    }

    private void usedPrivateMethod(int unusedParam, String usedParam) throws Exception {
        System.out.println(usedParam);
        try {

        } catch (Error e) {
            throw new Exception();
        }
    }


}
