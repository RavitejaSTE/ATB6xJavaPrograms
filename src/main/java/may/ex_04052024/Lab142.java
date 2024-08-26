package may.ex_04052024;

public class Lab142 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("arr size is "+arr.length);

        int max_num = Integer.MIN_VALUE;

        System.out.println("Initial Max value is "+max_num);

        int row = arr.length;

        for (int i=0; i<row; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
                int val = arr[i][j];
                if (val > max_num) {
                    max_num = val;
                }
            }
        }
        System.out.println("Max num is "+max_num);
    }
}
