import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//üye girişi için Kullanıcı adı "Team5" şifre "Team5"
//üye girişi için Kullanıcı adı "Ahmet" şifre "Ahmet"

//          Manav           -               Giyim               -               Şarküteri

//Sıra No	Ürün	Fiyat	-    Sıra No	Ürün	    Fiyat	-    Sıra No	Ürün	    Fiyat
//10	    Elma	2,00	-    20	        t-shirt	    25,00	-    30 	    Peynir	    20,00
//11	    Armut	4,00	-    21	        Pantolon	40,00	-    31      	Zeytin	    15,00
//12	    Domates	2,50    -	 22	        Gomlek	    30,00	-    32	        Salam	    20,00
//13	    Biber	3,50	-    23  	    Eşofman	    50,00	-    33	        Sucuk	    40,00
//14	    Karpuz	1,00	-    24	        Ayakkabi	80,00	-    34	        Pastırma	80,00

//          İçecek                              Temizlik

//Sıra No	Ürün	    Fiyat	-    Sıra No	Ürün	             Fiyat
//40	    Kola	    5,00	-    50	        Bulaşık Deterjanı       20,00
//41	    Meyve_Suyu	4,00	-    51	        Çamaşır Deterjanı       30,00
//42	    Gazoz	    2,50    -	 52	        Çamaşır Suyu	        15,00
//43	    Ayran	    1,50	-    53  	    Sıvı Sabun	            15,00
//44	    Limonata	1,00	-    54	        Dezenfektan     	    25,00



public class Alisveris {
    List<Integer> sepet = new ArrayList<>();
    double toplamTutar =0;
    boolean uyeGirisi = false;
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("feature");


        menu1();

    }
    public static void menu1(){  // Bilal ÇAKAR
        //İki seçenekli bir menu oluşturarak ilgili methodlara yönlendirilecekler
        // not olarak "üye girişi ile yapılan alışverişlerde kasada %10 indirim uygulanacaktır.
        //1 üye girişi uyeGirisi();
        //2 üye girişi yapmadan menu2()


    }
    public static void uyeGirisi(){  //Bayram ERDOĞAN
        //kullanıcı adı ardından şifre istenecek doğruluğu kontrol edilerek doğru giriş yapılır ise
        // uyeGirisi variablesi değeri "true" olarak güncellenecek
        // menu2() yönlendirilecek
        //Hatalı giriş için tekrar menu1() yönlendirilecek
        System.out.println("eeeeee");

    }
    public static void menu2(){   //Ertuğrul TOKGÖZ
        //Alışveriş yapmak istediği market bölümüne yönlendirebilmek için
        //4 seçenekli menü oluşturulacak
        // 1 manavGoster()
        // 2 giyimGoster()
        // 3 sarkuteriGoster()
        // 4 cıkıs()

    }
    public static void manavGoster(){   //Fethullah KAYA
        //manav ürünlerini fiyatları ile birlikte gösteren ve geri (menu2()methodu) ile Kasaya git (kasa()methodu) bir menü oluşturulacak ve geri ()
        //almak istediği ürün kodunu müşteriden alacak ardından miktar soracak ve bu sayıları "manavAlis(secim , miktar)"
        //parametre olarak methoda gönderecek
        //1 ürün kodu  ürün adı   fiyatı
        //2 ürün kodu  ürün adı   fiyatı
        //3 ürün kodu  ürün adı   fiyatı
        //4 ürün kodu  ürün adı   fiyatı
        //5 ürün kodu  ürün adı   fiyatı
        //6 geri
        //7 kasaya git
        //8 çıkış




    }
    public static void giyimGoster(){   //Fidan TANRIVERDİ
        //giyim ürünlerini fiyatları ile birlikte gösteren bir menü oluşturulacak
        //almak istediği ürün kodunu müşteriden alacak ardından miktar soracak ve bu sayıları "giyimAlis(secim , miktar)"
        //parametre olarak methoda gönderecek
        //1 ürün kodu  ürün adı   fiyatı
        //2 ürün kodu  ürün adı   fiyatı
        //3 ürün kodu  ürün adı   fiyatı
        //4 ürün kodu  ürün adı   fiyatı
        //5 ürün kodu  ürün adı   fiyatı
        //6 geri
        //7 kasaya git
        //8 çıkış

    }
    public static void sarkuteriGoster(){   //Hafsa Zeynep TEMİZ
        //sarküteri ürünlerini fiyatları ile birlikte gösteren bir menü oluşturulacak
        //almak istediği ürün kodunu müşteriden alacak ardından miktar soracak ve bu sayıları "sarküteriAlis(secim , miktar)"
        //parametre olarak methoda gönderecek
        //1 ürün kodu  ürün adı   fiyatı
        //2 ürün
        // kodu  ürün adı   fiyatı
        //3 ürün kodu  ürün adı   fiyatı
        //4 ürün kodu  ürün adı   fiyatı
        //5 ürün kodu  ürün adı   fiyatı
        //6 geri
        //7 kasaya git
        //8 çıkış

    }
    public static void manavAlis(int secim, double miktar){  //Basri AKBAŞ
        //secim kodu ile alınan ürünün fiyatını miktar ile çarpıp çıakn sonucu "toplamTutar" variablesine eklenecek
        //seçim kodu sepet list ine eklenecek
        //"ürününüz sepete eklenmiştir" yazıp
        //manavGoster() methoduna geri gönderecek

    }
    public static void giyimAlis(int secim,int miktar){     //Hasan Hüseyin GÜNEŞ
        //secim kodu ile alınan ürünün fiyatını miktar ile çarpıp çıakn sonucu "toplamTutar" variablesine eklenecek
        //seçim kodu sepet list ine eklenecek
        //"ürününüz sepete eklenmiştir" yazıp
        //giyimGoster() methoduna geri gönderecek

    }
    public static void sarkuteriAlis(int secim ,double miktar){     //Mustafa USLU
        //secim kodu ile alınan ürünün fiyatını miktar ile çarpıp çıakn sonucu "toplamTutar" variablesine eklenecek
        //seçim kodu sepet list ine eklenecek
        //"ürününüz sepete eklenmiştir" yazıp
        //manavGoster() methoduna geri gönderecek

    }
    public static void sepetGoster() {      //Fatih ÜSTÜNYER
        //Sepet listine kodları eklenen ürünlerin isimleri ve fiyatları ile gösterilmesi

    }
    public static void kasa(){      //Mustafa KONYA
        // sepetGoster çağrılarak sepet gösterilecek
        // toplamTutar değişkeni ekrana yazdırılarak(eğer üye girişi yapılmış ise yani uyeGirisi=true ise %10 azaltılarak)
        // ödeme yaptığı değer kullanıcıdan istenecek eğer yetersiz bakiye ise sepetten çıkar methoduna yönlendirilecek

    }
    public static void sepettenCikar() {  // Hamza KAYALI
        //öncelikle sepetGoster() methodu çağrılarak sepet listelenecek
        //listeden seçilen ürün list den silinecek
        //toplamTutar variablesinden seçilen ürün fiyatı çıkarılacak
        //tekrar kasa() methoduna gönderilecek

    }
    public static void cikis(){
        //sepet kontrolu yapılarak boş ise programdan çıkış yapılır dolu ise kasaya yönlendirilir.





    }
    public static void icecekGoster() {   //Ramazan GÜNERİ
        //İçecek ürünlerini fiyatları ile birlikte gösteren bir menü oluşturulacak
        //almak istediği ürün kodunu müşteriden alacak ardından miktar soracak ve bu sayıları "giyimAlis(secim , miktar)"
        //parametre olarak methoda gönderecek
        //1 ürün kodu  ürün adı   fiyatı
        //2 ürün kodu  ürün adı   fiyatı
        //3 ürün kodu  ürün adı   fiyatı
        //4 ürün kodu  ürün adı   fiyatı
        //5 ürün kodu  ürün adı   fiyatı
        //6 geri
        //7 kasaya git
        //8 çıkış
    }
    public static void temizlikGoster() {   //Sedat Engin
        //İçecek ürünlerini fiyatları ile birlikte gösteren bir menü oluşturulacak
        //almak istediği ürün kodunu müşteriden alacak ardından miktar soracak ve bu sayıları "giyimAlis(secim , miktar)"
        //parametre olarak methoda gönderecek
        //1 ürün kodu  ürün adı   fiyatı
        //2 ürün kodu  ürün adı   fiyatı
        //3 ürün kodu  ürün adı   fiyatı
        //4 ürün kodu  ürün adı   fiyatı
        //5 ürün kodu  ürün adı   fiyatı
        //6 geri
        //7 kasaya git
        //8 çıkış
    }
    public static void icecekAlis(int secim,int miktar) {     //Mehmet Yeşil
        //secim kodu ile alınan ürünün fiyatını miktar ile çarpıp çıakn sonucu "toplamTutar" variablesine eklenecek
        //seçim kodu sepet list ine eklenecek
        //"ürününüz sepete eklenmiştir" yazıp
        //giyimGoster() methoduna geri gönderecek
    }
    public static void temizlikAlis(int secim,int miktar) {     //Yusuf Horuz
        //secim kodu ile alınan ürünün fiyatını miktar ile çarpıp çıakn sonucu "toplamTutar" variablesine eklenecek
        //seçim kodu sepet list ine eklenecek
        //"ürününüz sepete eklenmiştir" yazıp
        //giyimGoster() methoduna geri gönderecek


    }

}
