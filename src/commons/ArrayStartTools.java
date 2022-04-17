package commons;

public class ArrayStartTools {
    public int[] generateRandomArray(int length) {
        int[] arrayRandom = new int[length];
        for (int i = 0; i < length; i++) {
            arrayRandom[i] = randomNumber(-20, 20);
        }
        return arrayRandom;
    }

    public void arrayPrint(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void arrayPrint(String[] array) {
        for (String j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void arrayPrint(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }

    public void arrayPrint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean arrayChecker(int enteredNumber, int[] array) {
        boolean found = false;

        for (int j : array) {
            if (enteredNumber == j) {
                found = true;
                break;
            }
        }
        return found;
    }

    public int[] arrayNumberDelete(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                array[i] = 0;
            }
        }
        return array;
    }

    public int[] copyIntArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public int[] removeAllFrom(int number, int[] array) {
        int removeCount = 0;
        for (int i : array) {
            if (i == number) {
                removeCount++;
            }
        }
        int[] arrayConverted = new int[array.length - removeCount];
        int g = 0;
        for (int j : array) {
            if (j != number) {
                arrayConverted[g] = j;
                g++;
            }
        }
        return arrayConverted;
    }

    public int[] removeOddFrom(int[] array) {
        int removeCount = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                removeCount++;
            }
        }
        int[] arrayConverted = new int[array.length - removeCount];
        int g = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                arrayConverted[g] = j;
                g++;
            }
        }
        return arrayConverted;
    }

    public int arrayMin(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (j >= min) {
                continue;
            }
            min = j;
        }
        return min;
    }

    public int arrayMax(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (max >= j) {
                continue;
            }
            max = j;
        }
        return max;
    }

    public double arrayMid(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return (double) sum / array.length;
    }

    public int[][] twoDemArrayInit(int length, int higth) {
        int[][] twoDemArrayRandom = new int[length][higth];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < higth; j++) {
                twoDemArrayRandom[i][j] = randomNumber(-10, 10);
            }
        }
        return twoDemArrayRandom;
    }

    public void twoDemArrayPrint(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public int[][] replaceWithZeroOnEvenIndex(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 1 || j % 2 == 1) {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    public int[] arrayMultipler(int[][] array) {
        int[] oneDemArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int result = 1;
            for (int j = 0; j < array[i].length; j++) {
                result *= Math.abs(array[i][j]);
            }
            oneDemArray[i] = result;
        }
        return oneDemArray;
    }

    public int arrayMaxIntChecker(int[] oneDemArray) {
        int maxIntCell = 1;
        for (int j : oneDemArray) {
            if (maxIntCell < j) {
                maxIntCell = j;
            }
        }
        return maxIntCell;
    }

    private int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public int[] replaceWithZeroOnEvenIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }
        return array;
    }

    public int[] bubbleSort(int[] array, int direction) {
        if (direction != 1 && direction != -1) {
            System.out.println("Wrong direction. (1 or -1 expected)");
        }
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (compareInt(array[i], array[i + 1]) == direction) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        return array;
    }

    private int compareInt(int a, int b) {
        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }

    public String[] bubbleSort(String[] array, int direction) {
        if (direction != 1 && direction != -1) {
            System.out.println("Wrong direction. (1 or -1 expected)");
        }
        boolean isSorted = false;
        String buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (compareStringIgnoreCase(array[i], array[i + 1]) == direction) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        return array;
    }

    private int compareStringIgnoreCase(String str1, String str2) {
        String s1 = str1.toLowerCase(), s2 = str2.toLowerCase();
        if (s1.charAt(0) > s2.charAt(0)) {
            return 1;
        } else if (s1.charAt(0) < s2.charAt(0)) {
            return -1;
        } else {
            if (s1.length() > 1 && s2.length() > 1) {
                return compareStringIgnoreCase(s1.substring(1), s2.substring(1));
            } else {
                return 0;
            }
        }
    }

    public int[][][] threeDemArrayInit(int length, int higth, int deeps) {
        int[][][] threeDemArrayRandom = new int[length][higth][deeps];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < higth; j++) {
                for (int f = 0; f < deeps; f++) {
                    threeDemArrayRandom[i][j][f] = randomNumber(1, 99);
                }
            }
        }
        return threeDemArrayRandom;
    }

    public int[][][] plusSomeNumberToElemArray(int[][][] array, int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int f = 0; f < array[i][j].length; f++) {
                    array[i][j][f] = array[i][j][f] + number;
                }
            }
        }
        return array;
    }
}

