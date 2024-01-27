import java.sql.Time;
import java.sql.Timestamp;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Robotics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<String> freeRobots = new ArrayDeque<>();
        Deque<String> busyRobots = new ArrayDeque<>();
        String[] robots=scan.nextLine().split(";");
        Map<String, Integer[]> freeOn = new HashMap<>();
        Integer[] time = Arrays.stream(scan.nextLine().split(":")).map(Integer::parseInt).toArray(Integer[]::new);
        for(String s : robots){
            Map<String, Integer[]> map=new HashMap<>();
            map.put(s.split("-")[0], time);
            freeRobots.offer(map);
            freeOn.put(s.split("-")[0], time);
        }

        String command = scan.nextLine();
        while(!"End".equals(command)){
            changeTime(1, time);
            if (!freeRobots.isEmpty()){
                freeOn.put(freeRobots.peek().keySet().forEach();)
                busyRobots.offer(freeRobots.poll());
            }
        }
    }
    private static Integer[] changeTime(int interval, Integer[] curTime){
        curTime[2]+=interval;
        if(curTime[2]>=60){
            curTime[2]-=60;
            curTime[1]=curTime[1]++;
        }
        if(curTime[1]==60){
            curTime[1]=0;
            curTime[0]++;
        }
        return curTime;
    }
}
