import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String favoriteBook = scan.nextLine();
        //String currentBook;
        int checkedBooks=0;
        while(true){
            String currentBook= scan.nextLine();
            if(currentBook.equals("No More Books")){
                System.out.printf("The book you search is not here!%nYou checked %d books.",checkedBooks);
                break;
            }

            if(currentBook.equals(favoriteBook)){
                System.out.printf("You checked %d books and found it.",checkedBooks);
                 break;
            }
            checkedBooks++;
        }
    }
}
