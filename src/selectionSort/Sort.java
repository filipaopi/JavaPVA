package selectionSort;

import java.util.ArrayList;
import java.util.Random;

public class Sort {
    private static ArrayList<Integer> list;

    public static void main(String[] args) {
        list = createList(20, 0, 100);


        if (!isSorted(list)) {
            BubbleSort.sort(list);

        }
        printArray(list);
    }

    private static ArrayList<Integer> createList(int size, int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(min, max));
        }
        return list;
    }

    private static boolean isSorted(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private static void printArray(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private class SelectionSort {

        private static void sort(ArrayList<Integer> list) {
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(j) < list.get(i)) {
                        swap(list, i, j);
                    }
                }
            }
        }
    }

    private class BubbleSort {
        private static void sort(ArrayList<Integer> list) {
            while (!isSorted(list)) {
                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i) > list.get(i + 1)) {
                        swap(list, i, i + 1);
                    }
                }
            }
        }
    }

    private class InsertionSort {
        private static void sort(ArrayList<Integer> list) {}
    }

}
