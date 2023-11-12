package Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(", ");
        Article article = new Article(arr[0], arr[1], arr[2]);
        int n = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < n; i++){
            String[] comm = scan.nextLine().split(": ");
            switch(comm[0]){
                case "Edit":
                    article.edit(comm[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(comm[1]);
                    break;
                case "Rename":
                    article.rename(comm[1]);
                    break;
            }
        }
        System.out.println(article);

    }
}
