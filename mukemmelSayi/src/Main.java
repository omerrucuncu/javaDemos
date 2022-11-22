public class Main {
    public static void main(String[] args) {
        // mükemmel sayı : Kendisinden başka pozitif tüm
        // bölenlerinin sayılarının toplamına eşit olan sayıdır
        boolean isPerfect = false;
        int bolenler = 0;
        int number = 8128;
        for (int i = 1;i<number;i++){
            if (number % i == 0){
                bolenler += i;
            }
        }

        if (bolenler == number ){
            isPerfect =true;
            System.out.println("Mükemmel sayıdır");
        }else {
            System.out.println("Değildir");
        }
    }
}