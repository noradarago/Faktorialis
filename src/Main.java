public class Main {

    public static int faktor(int n) {
        int szorzat = 1;
        for (int i = 2; i <= n; i++) {
            szorzat *= i;
        }
        return szorzat;
    }
    public static int faktorRek(int n){
        if(n == 1){
            return 1;
        }
        return  n*faktorRek(n-1);
    }
    public static void main(String[] args) {
        int szam = 14;

        for (int i = 1; i <=13; i++) {
            System.out.println(i+" " +faktor(i));

        }

        System.out.println(faktor(szam));

    }
}