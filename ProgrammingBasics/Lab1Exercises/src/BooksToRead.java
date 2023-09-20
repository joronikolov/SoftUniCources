import java.util.Scanner;

public class BooksToRead {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalNumberOfPages = Integer.parseInt(scan.nextLine());
        int pagesPerHour = scan.nextInt();
        int days=scan.nextInt();
        System.out.println((totalNumberOfPages/days)/pagesPerHour);
    }
}
