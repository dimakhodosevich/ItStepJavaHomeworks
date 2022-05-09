package by.itstep.khodosevich.fourteenstage.levelF.module;

public class Swap {
    private Swap() {
    }

    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
