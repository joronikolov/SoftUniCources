import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Map<String, Integer>> log = new TreeMap<>();
        String[] command = scan.nextLine().split("\\s");
        while(!"end".equals(command[0])){
            String user = command[2].replace("user=","");
            String ip = command[0].replace("IP=","");
            log.putIfAbsent(user, new LinkedHashMap<>());
           if(!log.get(user).containsKey(ip)){
               log.get(user).put(ip,1);
           }else{
               log.get(user).put(ip,log.get(user).get(ip)+1);
           }
            command = scan.nextLine().split("\\s");
        }
        for(String userName : log.keySet()){
            System.out.println(userName+": ");
            List<String> ipList=log.get(userName).keySet().stream().collect(Collectors.toList());
            ipList.forEach(e->{
               if(ipList.indexOf(e)==ipList.size()-1){
                   System.out.printf("%s => %d.%n", e, log.get(userName).get(e));
               }else{
                   System.out.printf("%s => %d, ", e, log.get(userName).get(e));
               }
            });


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
