package arrays;

public class Arrays {
    public static void main(String[] args) {
        String[] stringArr = new String[5];

        stringArr[0] = "hello";
        stringArr[1] = "hi";
        stringArr[2] = "hola";
        stringArr[3] = "ciao";
        // stringArr[4] = "haloj";
        String x = stringArr[1];
        String y = stringArr[4];

        System.out.println(x);
        System.out.println(y);

        int[] nums = {2,3,54,6,8};
        int a = nums[4];
        System.out.println(a);

        double[] nums2 = {2.0,3.0};
        System.out.println(nums2[1]);
    }
}
