public class NumbersEndingIn7 {
    public static void main(String[] args) {
        for(int i=1; i<=1000; i++){
            String str=String.valueOf(i);
            if(str.charAt(str.length()-1)=='7'){
                System.out.println(i);
            }
        }
    }
}
