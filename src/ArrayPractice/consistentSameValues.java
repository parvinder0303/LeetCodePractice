package ArrayPractice;

public class consistentSameValues {
    public static void main(String args[]) {


        int nums[] = {1};

        int cn = 0, j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                j++;
                if (j > cn) {
                    cn = j;
                }
            } else {
                j = 0;
            }
        }
        System.out.println(cn);
    }
}
