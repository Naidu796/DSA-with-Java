import java.util.Scanner;

class exa3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();       // Reads an integer input
        s.nextLine();              // Consumes the newline character
        String a = s.nextLine();   // Reads the full string input
        
        System.out.println(N + " " + a); // Prints N and S separated by a space
    }
}

