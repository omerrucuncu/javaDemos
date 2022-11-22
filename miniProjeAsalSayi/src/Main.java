public class Main {
    public static void main(String[] args) {
        int number = -2;
        int remainder = number % 2;
        boolean isPrime = true;

        if (number==1){
            System.out.println("Lütfen 1'den büyük bir sayı giriniz");
            return;  // Bağlı bulunulan bloğu bitirmeye yarar
        }

        if (number<1){
            System.out.println("Geçersiz sayı");
        }

        for (int i = 2;i<number;i++){
            if (number % i == 0){
                isPrime = false;

            }
        }

        if(isPrime == true){
            System.out.println("Sayı asaldır");
        }
        else {
            System.out.println("Sayı asal değildir");
        }
    }
}