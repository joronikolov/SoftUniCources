
import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int numberOfPeople = Integer.parseInt(scan.nextLine());
       numberOfPeople=Math.abs(numberOfPeople);
       int[] curState = Arrays.stream(scan.nextLine().split(" "))
               .mapToInt(Integer::parseInt)
               .toArray();
       int cabinCapacity=0;
       String message="";
       for(int i =0 ; i< curState.length; i++){
           cabinCapacity=4-curState[i];
           if(numberOfPeople>0){
               if(cabinCapacity>0){
                   if(numberOfPeople>=cabinCapacity){
                       numberOfPeople-=cabinCapacity;
                       curState[i]=4;

                   }else {
                       cabinCapacity-=numberOfPeople;
                       curState[i]+=numberOfPeople;
                       numberOfPeople=0;


                   }

               }
           }
//           else {
//               cabinCapacity=curState[i];
//           }
       }
       boolean emty=false;
       for (int e : curState){
           if(e<4){
               emty=true;
           }
       }
       if(numberOfPeople>0){
           System.out.printf("There isn't enough space! %d people in a queue!%n", numberOfPeople);
           for (int e : curState){
               System.out.printf("%d ", e);
           }
       } else if (numberOfPeople==0 && !emty) {
           for (int e : curState){
               System.out.printf("%d ", e);
           }
       }else {
           System.out.println("The lift has empty spots!" );
           for (int e : curState){
               System.out.printf("%d ", e);
           }
       }

    }
}
// 90/100 - Judge - could not find the error