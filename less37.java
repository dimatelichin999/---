import java.util.Scanner;

class less37 {
    public static void main(String args[]){

        Scanner console = new Scanner(System.in);
        int max = 0;
        while (console.hasNextInt())
        {
            int x = console.nextInt();
            if (x > max)
                max = x;
        }
        System.out.println(max);
    }
}