public class test {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] newArr = new int[arr.length - 1];

        System.arraycopy(arr, 1, newArr, 0, newArr.length);

        for (int x: newArr) {
            System.out.println(x);
        }

    }

}
