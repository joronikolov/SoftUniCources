import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> inputList1 = new ArrayList<>(Arrays.stream(scan.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList()));
        String command = scan.nextLine();
        while(!command.equals("end")){
            System.out.println(processCommand(command.split(" "), inputList1));
            command = scan.nextLine();
        }
    }
    public static String processCommand(String[] input, List<Integer> list){
        StringBuilder res= new StringBuilder();
        switch (input[0]){
            case "Contains":
                if(list.contains(Integer.parseInt(input[1]))){
                    res = new StringBuilder("Yes");
                }else {
                    res = new StringBuilder("No such number");
                }
                break;
            case "Print":
                switch(input[1]){
                    case "even":
                        for(int e : list){
                            if(e%2==0){

                                res.append(String.valueOf(e)).append(" ");
                            }
                        }
                        break;
                    case "odd":
                        for(int e : list){
                            if(e%2!=0){

                                res.append(String.valueOf(e)).append(" ");
                            }
                        }
                        break;
                }

                break;

            case "Get":
                int sum=0;
                for(int e : list){
                  sum+=e;
                }
                res = new StringBuilder(String.valueOf(sum));
                break;
            case "Filter":
                int number=Integer.parseInt(input[2]);
                switch(input[1]){
                    case "<":
                        for(int e : list){
                            if(e<number){

                                res.append(e).append(" ");
                            }
                        }
                        break;
                    case ">":
                        for(int e : list){
                            if(e>number){

                                res.append(e).append(" ");
                            }
                        }
                        break;
                    case ">=":
                        for(int e : list){
                            if(e>=number){

                                res.append(e).append(" ");
                            }
                        }
                        break;
                    case "<=":
                        for(int e : list){
                            if(e<=number){

                                res.append(e).append(" ");
                            }
                        }
                        break;

                }
                break;


        }
        return res.toString();
    }
}
