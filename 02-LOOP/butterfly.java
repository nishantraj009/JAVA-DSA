public class butterfly {

    public static void Butterfly(int n) {
        
        for(int i=1; i<=n; i++) {
            
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            // Spaces
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            // Right Stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for(int i=n; i>=1; i--) {
            // Left Stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            // Spaces
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            // Right Stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Butterfly(4);
    }
}
