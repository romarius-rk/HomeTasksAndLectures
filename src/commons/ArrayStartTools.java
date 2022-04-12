package commons;

public class ArrayStartTools {
    public int[] arrayInit (int lengt) {
        int[] arrayRandom = new int[lengt];
        for (int i = 0; i < lengt; i++) {
            arrayRandom[i] = (int) (Math.random() * 10);
        }
        return arrayRandom;
    }

    public boolean arrayChecker(int enteredNumber, int[] array) {
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (enteredNumber == array[i]) {
                found = true;
            }
        }
        return found;
    }
}
