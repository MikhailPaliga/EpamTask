package Task2;

public class Main {

    public static void main(String[] args) {
        Sort sort = new Sort();
        int [] arr = {5,34,2,67,12,98,4,6,7,34,52};
        int number = 4;
        sort.bubbleSort(arr);
        System.out.println(sort.checkNumber(sort.bubbleSort(arr), number));
    }
}
