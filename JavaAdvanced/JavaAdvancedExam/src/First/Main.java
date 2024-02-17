package First;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> henryMoney = new ArrayDeque<>();
        Deque<Integer> prices = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).forEach(henryMoney::push);
        Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).forEach(prices::offer);
        int foodEaten=0;
        int difference=0;
        while(!henryMoney.isEmpty() & !prices.isEmpty()){

            if(henryMoney.peek()+difference==prices.peek()){
                foodEaten+=1;
                difference=0;
                henryMoney.pop();
                prices.poll();
            } else if (henryMoney.peek()+difference>prices.peek()) {
                difference=henryMoney.peek()+difference-prices.peek();
                foodEaten+=1;
                prices.poll();
                henryMoney.pop();

            }else {
                henryMoney.pop();
                prices.poll();
                difference=0;
            }
        }
        if(foodEaten==1) {
            System.out.printf("Henry ate: %d food.%n", foodEaten);
        } else if (foodEaten>=4) {
            System.out.printf("Gluttony of the day! Henry ate %d foods.%n", foodEaten);
        } else if (foodEaten>1 & foodEaten<4) {
            System.out.printf("Henry ate: %d foods.%n", foodEaten);
        } else {
            System.out.println("Henry remained hungry. He will try next weekend again.");
        }


    }
}
