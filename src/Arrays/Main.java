package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrayss arr=new Arrayss();
        int[]numbers2=new int[5];
        int[]numbers={1,2,3,4,5};
        arr.input(numbers2);
        arr.Traversal(numbers2);
        arr.Reverse_traversal(numbers2);
        arr.update(numbers,3,6);
        arr.delete(numbers,1);
        arr.SHIFTLEFTDELETE(numbers,2);
        arr.Traversal(numbers);
        arr.LinearSearch(numbers,5);
    }
}
