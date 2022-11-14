package Study;

public class VerySimple6 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <11; i++) {
            for (int j =1; j <11; j++) {
                sum=sum+1;
                System.out.printf(String.valueOf(sum+" "));
            }
            System.out.println("");
        }
    }
}
