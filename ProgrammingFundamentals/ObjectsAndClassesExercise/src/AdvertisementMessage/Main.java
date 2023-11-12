package AdvertisementMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> phrases = new ArrayList<>();
        List<String> events = new ArrayList<>();
        List<String> authors = new ArrayList<>();
        List<String> cities = new ArrayList<>();
        phrases.add("Excellent product.");
        phrases.add("Such a great product.");
        phrases.add("I always use that product.");
        phrases.add("Best product of its category.");
        phrases.add("Exceptional product.");
        phrases.add("I can’t live without this product.");
        events.add("Now I feel good.");
        events.add("I have succeeded with this product.");
        events.add("Makes miracles. I am happy of the results!");
        events.add("I cannot believe but now I feel awesome.");
        events.add("Try it yourself, I am very satisfied.");
        events.add("I feel great!");
        authors.add("Diana");
        authors.add("Petya");
        authors.add("Stella");
        authors.add("Elena");
        authors.add("Katya");
        authors.add("Iva");
        authors.add("Annie");
        authors.add("Eva");
        cities.add("Burgas");
        cities.add("Sofia");
        cities.add("Plovdiv");
        cities.add("Varna");
        cities.add("Ruse");
        for(int i = 0; i < n; i++){
            String phrase = phrases.get(new Random().nextInt(phrases.size()-1));
            String event = events.get(new Random().nextInt(events.size()-1));
            String author = authors.get(new Random().nextInt(authors.size()-1));
            String city = cities.get(new Random().nextInt(cities.size()-1));
            System.out.printf("%s %s %s – %s%n", phrase, event, author, city);
        }




    }
}
