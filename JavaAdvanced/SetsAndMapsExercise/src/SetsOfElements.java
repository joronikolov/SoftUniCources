import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dim =Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int n= dim[0];
        int m =dim[1];
        Set<Integer> setN = new LinkedHashSet<>();
        Set<Integer> setM = new LinkedHashSet<>();
        for(int i=0; i<n; i++){
            setN.add(Integer.parseInt(scan.nextLine()));
        }
        for(int i=0; i<m; i++){
            int v = Integer.parseInt(scan.nextLine());
            if(setN.contains(v)){
                setM.add(v);
            }
        }
        setN.forEach(e->{if(setM.contains(e)) {
            System.out.printf("%d ", e);
        }
        });
       // System.out.println(setM.toString().replaceAll("[\\[\\],]",""));

    }
}
