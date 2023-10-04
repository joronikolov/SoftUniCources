import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String action = scan.nextLine();
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        switch (action){
            case "add":
                System.out.println(add(a,b));
                break;
            case "subtract":
                System.out.println(subtract(a,b));
                break;
            case "divide":
                System.out.println(divide(a,b));
                break;
            case "multiply":
                System.out.println(multiply(a,b));
                break;

        }

    }

    public static int add(int a, int b){

        return a+b;
    }
    public static int subtract(int a, int b){

        return a-b;
    }
    public static int multiply(int a, int b){

        return a*b;
    }
    public static int divide(int a, int b){

        return a/b;
    }
}
