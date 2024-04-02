public class lesson_2 { public static void main(String[] args) {
    System.out.println("Задание_1 :");
    PrintThreeWords();
    System.out.println();
    System.out.println("Задание_2 :");
    checkSumSign();
    System.out.println();
    System.out.println("Задание_3 :");
    printColor();
    System.out.println();
    System.out.println("Задание_4 :");
    compareNumbers();
    System.out.println();
    System.out.println("Задание_5 :");
    sumNumb();
    System.out.println();
    System.out.println("Задание_6 :");
    checkNumbPositive();
    System.out.println();
    System.out.println("Задание_7 :");
    WholeNumb();
    System.out.println();
    System.out.println("Задание_8 :");
    String();
    System.out.println();
    System.out.println("Задание_9 :");
    leapYear();
    System.out.println();
    System.out.println("Задание_10 :");
    IntArray();
    System.out.println();
    System.out.println("Задание_11 :");
    FillArr();
    System.out.println();
    System.out.println("Задание_12 :");
    ArrayMult();
    System.out.println();
    System.out.println("Задание_13 :");
    SquarelArray();
    System.out.println();
    System.out.println("Задание_14 :");
    intArray();
}
    //Задание_1
    static void PrintThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //Задание_2
    static void checkSumSign() {
        int a = 10;
        int b = -20;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }
    //Задание_3
    static void printColor() {
        int a = 33;
        if (a <= 0) {
            System.out.println("Красный");
        } else if (a < 0 && a >= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    //Задание_4
    static void compareNumbers() {
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    //Задание_5
    static void sumNumb() {
        int NumbOne = 13;
        int NumbTwo = 5;
        if (NumbOne + NumbTwo >= 10 && NumbOne + NumbTwo <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    //Задание_6
    static void checkNumbPositive() {
        int numb = 12;
        if (numb >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    //Задание_7
    static boolean numbIsNegative(int numb) {
        return numb < 0;
    }
    static void WholeNumb() {
        boolean result = numbIsNegative(5);
        System.out.println(result);
    }
    //Задание_8
    static void StringPrint(String text, int quantity) {
        for(int i = 0; i < quantity; ++i) {
            System.out.println(text);
        }
    }
    static void String() {
        StringPrint("Hi!", 5);
    }
    //Задание_9
    static void leapYear() {
        int year = 2020;
        System.out.println(Year(year));
    }
    static boolean Year(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    //Задание_10
    public static void IntArray() {
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < array.length; ++i) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        int[] var5 = array;
        int var2 = array.length;
        for(int var3 = 0; var3 < var2; ++var3) {
            int value = var5[var3];
            System.out.print(value + " ");
        }
        System.out.println();
    }
    //Задание_11
    public static void FillArr() {
        int[] array = new int[100];
        int i;
        for(i = 0; i < array.length; ++i) {
            array[i] = i + 1;
        }
        for(i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    //Задание_12
    public static void ArrayMult() {
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i;
        for(i = 0; i < array.length; ++i) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        for(i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    //Задание_13
    public static void SquarelArray() {
        int counter = 5;
        int[][] table = new int[counter][counter];
        int i;
        for(i = 0; i < counter; ++i) {
            table[i][i] = 1;
        }
        for(i = 0; i < counter; ++i) {
            for(int j = 0; j < counter; ++j) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Задание_14
    public static int[] intArrays(int len, int initialValue) {
        int[] array = new int[len];
        for(int i = 0; i < len; ++i) {
            array[i] = initialValue;
        }
        return array;
    }
    public static void intArray() {
        int[] isArray = intArrays(3, 5);
        int[] var1 = isArray;
        int var2 = isArray.length;
        for(int var3 = 0; var3 < var2; ++var3) {
            int i = var1[var3];
            System.out.println(i);
        }
    }
}



