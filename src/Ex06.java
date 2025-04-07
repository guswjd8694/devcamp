import java.util.Arrays;

public class Ex06 {
    static int[] shuffle(int[] newArr) {

        for (int i = newArr.length - 1; i > 0; i--){
            int randomIdx = (int)(Math.random() * (i + 1));
            int tmp = newArr[i];
            newArr[i] = newArr[randomIdx];
            newArr[randomIdx] = tmp;

        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
