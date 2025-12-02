package Assignments;

public class Shift_right {
    public void shiftRight_Delete(int[] a, int index) {
        for (int i = index; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = Integer.MIN_VALUE;
    }
    public static void main(String[] args){
        Shift_right sr=new Shift_right();
        int[]num={2,3,5,6,7};
        sr.shiftRight_Delete(num,2);
    }
}
