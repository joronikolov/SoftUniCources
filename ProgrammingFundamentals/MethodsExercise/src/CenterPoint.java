import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] firstPoint = new int[2];
        int[] secondPoint = new int[2];
        int[] thirdPoint = new int[2];
        int[] fourthPoint = new int[2];
        ;
        firstPoint[0] = Integer.parseInt(scan.nextLine());
        firstPoint[1] = Integer.parseInt(scan.nextLine());
        secondPoint[0] = Integer.parseInt(scan.nextLine());
        secondPoint[1] = Integer.parseInt(scan.nextLine());
        thirdPoint[0] = Integer.parseInt(scan.nextLine());
        thirdPoint[1] = Integer.parseInt(scan.nextLine());
        fourthPoint[0] = Integer.parseInt(scan.nextLine());
        fourthPoint[1] = Integer.parseInt(scan.nextLine());
        //System.out.printf("(%d, %d)", nearest(firstPoint, secondPoint)[0], nearest(firstPoint, secondPoint)[1]);
        double length1=calculateLength(firstPoint, secondPoint);
        double length2=calculateLength(thirdPoint, fourthPoint);
//        System.out.println(length1);
//        System.out.printf("(%d, %d)(%d, %d%n)", firstPoint[0], firstPoint[1], secondPoint[0], secondPoint[1]);
//        System.out.println(length2);
//        System.out.printf("(%d, %d)(%d, %d%n)", thirdPoint[0], thirdPoint[1], fourthPoint[0], fourthPoint[1]);
//        System.out.println("=".repeat(50));
        int[] first;
        int[] second;
        if (length1>=length2){
            first = nearest(firstPoint, secondPoint);
            second = nearest(firstPoint, secondPoint) == firstPoint ? secondPoint : firstPoint;
        }else {
            first = nearest(thirdPoint, fourthPoint);
            second = nearest(thirdPoint, fourthPoint) == thirdPoint ? fourthPoint : thirdPoint;
        }
        System.out.printf("(%d, %d)(%d, %d)", first[0], first[1], second[0], second[1]);


    }

    public static int[] nearest(int[] firstPoint, int[] secondPoint) {
        int sum1 = 0;
        int sum2 = 0;
        for (int e : firstPoint) {
            sum1 += Math.abs(e);
        }
        for (int e : secondPoint) {
            sum2 += Math.abs(e);
        }
        if (sum1 > sum2) {
            return secondPoint;
        }
        return firstPoint;

    }
    public static double calculateLength(int[] firstPoint, int[] secondPoint){
        return  Math.sqrt(Math.pow(Math.abs(firstPoint[0]-Math.abs(secondPoint[0])),2) + Math.pow(Math.abs(firstPoint[1]-Math.abs(secondPoint[1])),2));
    }
}
