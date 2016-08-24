import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Robin on 23/08/2016.
 */
public class Pick {

    private ArrayList<Integer> numbers = new ArrayList<>();

    public Pick (int min, int max) {
        int i = min;
        while(i <= max) {
            numbers.add(i);
            i++;
        }
        Collections.shuffle(numbers);
    }

    public int getRandom() {
        int retour = -1;
        if (numbers.size() > 0) {
            retour = numbers.get(0);
            numbers.remove(0);
        }
        return retour;
    }

    public boolean isFinish() {
        if (numbers.size() > 0)
            return false;
        else
            return true;
    }

}
