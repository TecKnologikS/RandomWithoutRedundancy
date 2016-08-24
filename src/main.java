import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.System.out;

/**
 * Created by Robin on 23/08/2016.
 */
public class main {

    static long startWith;
    static long startWithout;
    static long finishWith;
    static long finishWithout;

    public static void main(String[] args)
    {
        /*** Test with redundancy ***/
        out.println("START Draw N°1");
        startWith = System.currentTimeMillis();
        pickWithRedundancy(0, 10000);
        finishWith = System.currentTimeMillis();
        out.println("END Draw N°1");


        /*** Test without redundancy ***/
        out.println("START Draw N°2");
        startWithout = System.currentTimeMillis();
        pickWithoutRedundancy(0, 10000);
        finishWithout = System.currentTimeMillis();
        out.println("END Draw N°2");

        /*** Time To Do ***/
        out.println("Draw N°1 : " + (finishWith - startWith) + " ms");
        out.println("Draw N°2 : " + (finishWithout - startWithout) + " ms");

    }

    public static void pickWithRedundancy(int min, int max) {
        Random random = new Random();
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < (max - min + 1); i++) {

            int tmp = 0;
            do {
                tmp = random.nextInt(max - min + 1) + min;
            } while (result.contains(tmp));

            //out.println(tmp + "");
            result.add(tmp);
        }
    }

    public static void pickWithoutRedundancy(int min, int max) {
        Pick pick = new Pick(min, max);
        while (!pick.isFinish()) {
            //out.println("" + pick.getRandom());
            pick.getRandom();
        }
    }
}
