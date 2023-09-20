import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int studentSeats=0;
        int standardSeats=0;
        int kidSeats=0;
        int totalTickets=0;
        while(true){
            String movieName= scan.nextLine();
            if(movieName.equals("Finish")){
                break;
            }
            int theaterSeats= scan.nextInt();
            scan.nextLine();
            int curMovieTickets=0;
            for(int i=1; i<=theaterSeats; i++){
                String seatType = scan.nextLine();
                if(seatType.equals("End")){
                    break;
                }
                totalTickets++;
                curMovieTickets++;
                switch (seatType){
                    case "student":
                        studentSeats++;
                        break;
                    case "standard":
                        standardSeats++;
                        break;
                    case "kid":
                        kidSeats++;
                        break;
                }



            }
            System.out.printf("%s - %.2f%% full.%n", movieName, curMovieTickets*1.0/theaterSeats*100);
        }
        System.out.printf("Total tickets: %d%n",totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentSeats*1.0/totalTickets*100);
        System.out.printf("%.2f%% standard tickets.%n", standardSeats*1.0/totalTickets*100);
        System.out.printf("%.2f%% kids tickets.%n", kidSeats*1.0/totalTickets*100);
    }
}
