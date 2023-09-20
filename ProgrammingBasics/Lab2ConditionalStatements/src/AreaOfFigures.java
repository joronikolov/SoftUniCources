import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String figureType=scan.nextLine();
       if(figureType.equals("square")){
           System.out.println("Enter square side dimensions:");
           double side=scan.nextDouble();
           System.out.println(side*side);
       } else if (figureType.equals("rectangle")) {
           System.out.println("Enter rectangle sideA dimension:");
           double sideA = scan.nextDouble();
           System.out.println("Enter rectangle sideB dimension:");
           double sideB = scan.nextDouble();
           System.out.println(sideA*sideB);
       }else if(figureType.equals("circle")){
           System.out.println("Enter circle radius:");
           double rad=scan.nextDouble();
           System.out.println(Math.PI*rad*rad);
       } else if (figureType.equals("triangle")) {
           System.out.println("Enter triangle sideA dimension:");
           double sideA = scan.nextDouble();
           System.out.println("Enter triangle sideA height:");
           double heightA = scan.nextDouble();
           System.out.println(sideA*heightA/2);

       }else{
           System.out.println("figure not defined");
       }

    }
}
