public class floydtriangle {
    public static void main(String[] args) {

        int n = 5;      // number of rows
        int num = 1;    // starting number

        // outer loop  rows

        for(int i = 1; i <= n; i++) {

            // inner loop print elements in each row

            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;      // increase number
            }

            System.out.println();     // next line
        }
    }
}
