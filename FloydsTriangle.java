public class FloydsTriangle {

    public static void floyd(int n) {
        int counter = 1;
        for (int i=1; i<=n; i++) {
            // inner-loop to print the numbers in a row
            for (int j = 1; j<=i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        floyd(5); // calling the function with n=5
    }
}
