public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı : "+ mesaj.length());
        System.out.println("5.eleman : "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));*/

        System.out.println(mesaj.replace(' ','-')); // metinde karakter değiştirmek için
        System.out.println(mesaj.substring(2,5)); //mesajdan parça koparmak için
        for (String kelime : mesaj.split(" ")){ //split --> karakter veya karakter dizisine göre metni ayırır
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); // küçük harfe çevir
        System.out.println(mesaj.toUpperCase()); // büyük harfe çevir
        System.out.println(mesaj.trim()); // baştaki ve sondaki boşlukları atar


    }
}