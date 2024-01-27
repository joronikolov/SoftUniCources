import java.util.*;
import java.util.stream.Collectors;

public class LogsAgregator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        Map<String, Map<String, Integer>> log = new TreeMap<>();
        String[] command = scan.nextLine().split("\\s");
        for(int i=0; i<n; i++){
            String user = command[1];
            String ip = command[0];
            int duration=Integer.parseInt(command[2]);
            log.putIfAbsent(user, new TreeMap<>());
           if(!log.get(user).containsKey(ip)){
               log.get(user).put(ip,duration);
           }else{
               log.get(user).put(ip,log.get(user).get(ip)+duration);
           }
            command = scan.nextLine().split("\\s");
        }
        for(String userName : log.keySet()){

            int sum = 0;
            for(int f:log.get(userName).values()){
                sum+=f;
            }
            String ips = String.join( ", ",  log.get(userName).keySet());
            System.out.printf("%s: %d [%s]%n", userName, sum, ips);
//            ipList.forEach(e->{
//               if(ipList.indexOf(e)==ipList.size()-1){
//                   System.out.printf("%s => %d.%n", e, log.get(userName).get(e));
//               }else{
//                   System.out.printf("%s => %d, ", e, log.get(userName).get(e));
//               }
//            });


        }

//        log.forEach((k, v)->{
//            System.out.println(k);
//            AtomicInteger i= new AtomicInteger();
//            v.forEach((curIp, cnt)-> {
//                System.out.printf(i.get() != 0 ? ",%n" : "" + "%s => %d", curIp, cnt);
//                i.getAndIncrement();
//            });
//        });
    }
}
