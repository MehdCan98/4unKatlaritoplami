import java.util.Scanner;
//Kullanıcıdan veri çekebilmek için Java Util kütüphansesinden Scanner sınıfını projemize dahil ediyoruz.


public class Main {
    public static void main(String[] args) {

        //Scanner sınıfımız için bir nesne üretiyoruz
        Scanner input = new Scanner(System.in);


        /*Kullanıcıdan alınacak değer için a adında ve toplamları alınacak değerler için de
        baslangiç değeri 0 olan bir değişken tanımladık*/
        int a, total =0;


        //Do döngüsü ile koşul sorgusu  yapılmadan önce kullanıcıdan veri almak için döngü en az bir kere çalıştırılıyor
        do {
            System.out.println("Değer giriniz: ");
            a = input.nextInt();

            //Girilen sayılardan çift ve 4'ün katı olanların toplanması için İf bloğu içinde koşullarımız belirtiliyor
            if ((a % 2 !=1) && (a % 4 ==0)){


                /*4'ün olan değerlerin döngü için ayrı ayrı toplanabilmesi için
                 değer değişkeni a'nın her döngüdeki değeri total değişkenine atanıyor*/
                total +=a;
            }

         //Döngünün kullanıcıdan gelecek tek değerle sonlanması koşulu while ile sağlanıyor
        }while (a % 2 ==0);


        //çift ve 4'ün katı olan sayıların toplam değeri ekrana yazdırılıyor
        System.out.println("toplam"+ total);
    }
}