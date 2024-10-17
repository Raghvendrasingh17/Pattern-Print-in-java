public class butterfly {

    public static void butterflyPattern(int n) {
        // 1st half
        for (int i=1; i<=n; i++) {
            // stars - i
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            // spaces - 2*(n-i)
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // stars - i
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }

        // 2nd half
        for (int i=n; i>=1; i--) {
            // stars - i
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            // spaces - 2*(n-i)
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            // stars - i
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to the next line
        }
    }

    public static void main(String[] args) {
        butterflyPattern(4); // calling the function with n=4
    }
}
