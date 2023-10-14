import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        String value = scan.nextLine();
        print(type, value);


    }
    public static void print(String type, String value){
        Scanner scan = new Scanner(System.in);
        switch(type){
            case "int":
                System.out.println(Integer.parseInt(value)*2);
                break;
            case "real":
                System.out.printf("%.2f%n", Double.parseDouble(value)*1.5);
                break;
            case "string":
                System.out.printf("$%s$%n", value);
                break;
        }
    }
}
