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
    static List<Integer> sepet = new ArrayList<>();
    static double toplamTutar =0;
    static boolean uyeGirisi = false;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("feature");

uyeGirisi();
        System.out.println("deneme");


    }
    public static void menu1(){  // Bilal ÇAKAR
        //İki seçenekli bir menu oluşturarak ilgili methodlara yönlendirilecekler
        // not olarak "üye girişi ile yapılan alışverişlerde kasada %10 indirim uygulanacaktır.
        //1 üye girişi uyeGirisi();
        //2 üye girişi yapmadan menu2()
        System.out.println("menu1");

    }
    public static void uyeGirisi(){  //Bayram ERDOĞAN
        //kullanıcı adı ardından şifre istenecek doğruluğu kontrol edilerek doğru giriş yapılır ise
        // uyeGirisi variablesi değeri "true" olarak güncellenecek
        // menu2() yönlendirilecek
        //Hatalı giriş için tekrar menu1() yönlendirilecek
//kullanıcı adı ardından şifre istenecek
        //Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen kullanici adinizi giriniz");
        String name =scan.nextLine();
        System.out.println("Lutfen kullanici sifrenizi giriniz");
        String pin =scan.next();
        //doğruluğu kontrol edilerek doğru giriş yapılır ise
        if (name.equals("Team5")&&pin.equals("Team5")||name.equals("Ahmet")&&pin.equals("Ahmet")){
            uyeGirisi=true;// uyeGirisi variablesi değeri "true" olarak güncellenecek
            System.out.println("Hosgeldiniz..."+name);
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            menu2();// menu2() yönlendirilecek

        }else {
            System.out.println("Hatali giris yaptiniz. Lutfen tekrar deneyiniz.");
            menu1();//Hatalı giriş için tekrar menu1() yönlendirilecek
        }
    }
    public static void menu2(){   //Ertuğrul TOKGÖZ
        //Alışveriş yapmak istediği market bölümüne yönlendirebilmek için
        //4 seçenekli menü oluşturulacak
        // 1 manavGoster()
        // 2 giyimGoster()
        // 3 sarkuteriGoster()
        // 4 cıkıs()
        System.out.println("Menu2");
        System.out.println("Lutfen Alisveris yapmak istediginiz market bolumunu seciniz \n1-Manav \n2-Giyim \n3-Sarkuteri \n4-Cikis");
        //Scanner scan=new Scanner(System.in);
        int secim =scan.nextInt();
        if (secim==1) {
            manavGoster();
        }if (secim==2) {
            giyimGoster();
        }if (secim==3) {
            sarkuteriGoster();
        }if (secim==4) {
            cikis();
        }else {
            System.out.println("Lutfen gecerli bolum seciniz");
            menu2();
        }

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
        List<String> urunListesi = new ArrayList<>();
        List<Double> urunFiyatlari = new ArrayList<>();
        urunListesi.add("Urun Kodu:1 - t-shirt - Fiyat:25.00");
        urunListesi.add("Urun Kodu:2 - Pantolon - Fiyat:40.00");
        urunListesi.add("Urun Kodu:3 - Gomlek - Fiyat:30.00");
        urunListesi.add("Urun Kodu:4 - Esofman - Fiyat:50.00");
        urunListesi.add("Urun Kodu:5 - Ayakkabi - Fiyat:80.00");
        urunFiyatlari.add(25.00);
        urunFiyatlari.add(40.00);
        urunFiyatlari.add(30.00);
        urunFiyatlari.add(50.00);
        urunFiyatlari.add(80.00);
        System.out.println(urunListesi.toString());

        //Scanner scan = new Scanner(System.in);
        System.out.println("Hangi urunu secmek istersiniz");
        int secim = scan.nextInt();
        System.out.println("lutfen adet giriniz");
        int adet = scan.nextInt();
        System.out.println("Alisverise devam etmek isterseniz 1 , Giyimalis'a gitmek isterseniz 2 yaziniz");

        System.out.println("Lutfen Alisveris yapmak istediginiz market bolumunu seciniz \n6-Giyim Goster \n7-Kasa \n8-Cikis");

        int secim1 =scan.nextInt();
        if (secim1==6) {
            giyimGoster();
        }if (secim==6) {
            kasa();
        }if (secim==7) {
            cikis();

        }else {
            System.out.println("Lutfen gecerli bolum seciniz");

        }

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
        switch (secim){
            case 10:
                toplamTutar+=2.00*miktar;
                break;
            case 11:
                toplamTutar+=4.00*miktar;
                break;
            case 12:
                toplamTutar+=2.50*miktar;
                break;
            case 13:
                toplamTutar+=3.50*miktar;
                break;
            case 14:
                toplamTutar+=1*miktar;
                break;
        }
        //seçim kodu sepet list ine eklenecek
        sepet.add(secim);
        //"ürününüz sepete eklenmiştir" yazıp
        System.out.println("Ürününüz sepete eklenmistir");
        //manavGoster() methoduna geri gönderecek
        manavGoster();


    }
    public static void giyimAlis(int secim,int miktar){     //Hasan Hüseyin GÜNEŞ
        //secim kodu ile alınan ürünün fiyatını miktar ile çarpıp çıakn sonucu "toplamTutar" variablesine eklenecek
        //seçim kodu sepet list ine eklenecek
        //"ürününüz sepete eklenmiştir" yazıp
        //giyimGoster() methoduna geri gönderecek
        switch (secim){
            case 20:
                toplamTutar+=25.00*miktar;
                break;
            case 21:
                toplamTutar+=40.00*miktar;
                break;
            case 22:
                toplamTutar+=30.00*miktar;
                break;
            case 23:
                toplamTutar+=50.00*miktar;
                break;
            case 24:
                toplamTutar+=80*miktar;
                break;
        }
        //seçim kodu sepet list ine eklenecek
        sepet.add(secim);
        //"ürününüz sepete eklenmiştir" yazıp
        System.out.println("Ürününüz sepete eklenmistir");
        //giyimGoster() methoduna geri gönderecek
        giyimGoster();

    }
    public static void sarkuteriAlis(int secim ,double miktar){     //Mustafa USLU
        //secim kodu ile alınan ürünün fiyatını miktar ile çarpıp çıakn sonucu "toplamTutar" variablesine eklenecek
        //seçim kodu sepet list ine eklenecek
        //"ürününüz sepete eklenmiştir" yazıp
        //sarkuteriGoster() methoduna geri gönderecek

    }
    public static void sepetGoster() {      //Fatih ÜSTÜNYER
        //Sepet listine kodları eklenen ürünlerin isimleri ve fiyatları ile gösterilmesi
        for (Integer w:sepet) {
            switch (w) {
                case 10:
                    System.out.println("Elma 2 tl");
                case 11:
                    System.out.println("Armut 4 tl");
                case 12:
                    System.out.println("Domates 2,5 tl");
                case 13:
                    System.out.println("Biber 3,5 tl");
                case 14:
                    System.out.println("Karpuz 1 tl");
                case 20:
                    System.out.println("t-shirt 30 tl");
                case 21:
                    System.out.println("Pantolon 40 tl");
                case 22:
                    System.out.println("Gömlek 30 tl");
                case 23:
                    System.out.println("Eşofman 50 tl");
                case 24:
                    System.out.println("Ayakkabı 80 tl");
                case 30:
                    System.out.println("Peynir 20 tl");
                case 31:
                    System.out.println("Zeytin 15 tl");
                case 32:
                    System.out.println("Salam 20 tl");
                case 33:
                    System.out.println("Sucuk 40 tl");
                case 34:
                    System.out.println("Pastırma 80 tl");
                case 40:
                    System.out.println("Kola 5");
                case 41:
                    System.out.println("Meyve suyu 4 tl");
                case 42:
                    System.out.println("Gazoz 2,5 tl");
                case 43:
                    System.out.println("Ayran 2 tl");
                case 44:
                    System.out.println("Limonata 1 tl");
                case 50:
                    System.out.println("Bulaşık deterjanı 20 tl");
                case 51:
                    System.out.println("Çamaşır deterjanı 30 tl");
                case 52:
                    System.out.println("Çamaşır suyu 15 tl");
                case 53:
                    System.out.println("Sıvı sabun 15 tl");
                case 54:
                    System.out.println("Dezenfektan 25 tl");
            }

        }
        }
    public static void kasa(){      //Mustafa KONYA
        // sepetGoster çağrılarak sepet gösterilecek
        // toplamTutar değişkeni ekrana yazdırılarak(eğer üye girişi yapılmış ise yani uyeGirisi=true ise %10 azaltılarak)
        // ödeme yaptığı değer kullanıcıdan istenecek eğer yetersiz bakiye ise sepetten çıkar methoduna yönlendirilecek
        // sepetGoster çağrılarak sepet gösterilecek
        sepetGoster();
        // toplamTutar değişkeni ekrana yazdırılarak(eğer üye girişi yapılmış ise yani uyeGirisi=true ise %10 azaltılarak)
        // ödeme yaptığı değer kullanıcıdan istenecek eğer yetersiz bakiye ise sepetten çıkar methoduna yönlendirilecek
        if (uyeGirisi) {
            System.out.println("Toplam odenecek tutar : " + toplamTutar * 0.9);
        } else {
            System.out.println("Toplam odenecek tutar : " + toplamTutar);
        }
        System.out.println("Yaptiginiz toplam odeme miktarini giriniz");
        Scanner scan = new Scanner(System.in);
        double toplamOdeme = scan.nextDouble();

        if (toplamOdeme < toplamTutar) {
            sepettenCikar();
        } else {
            System.out.println("Para ustunuz : " + (toplamTutar - toplamOdeme));
        }
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
        String arr4[] = {"1 su=0.50 $ ","2 Meyve Suyu=2 $", "3 Soda=0.50 $", "4 kola=1$", "5 Cay=1$","geri","Kasaya git","cikis"};
        for(int i=0; i<arr4.length; i++) {
            System.out.println(arr4[i]);
        }
        System.out.println("Lütfen Seciminizi yapiniz");
        Scanner scan = new Scanner(System.in);
        int secim=scan.nextInt();
        System.out.println("Miktari giriniz");
        int miktar=scan.nextInt();

        switch(secim) {
            case 1 :
                System.out.println("Siparisiniz : su " + miktar*0.50 +  "$ dir" );
                break;
            case 2 :
                System.out.println("Siparisiniz : Meyve suyu " + miktar*2 +  "$ dir");
                break;
            case 3 :
                System.out.println("Siparisiniz :Soda " + miktar*0.50 +  "$ dir");
                break;
            case 4 :
                System.out.println("Siparisiniz :Kola " + miktar*1 +  "$ dir");
                break;
            case 5 :
                System.out.println("Siparisiniz :Cay " + miktar*1 +  "$ dir");
                break;
            case 6 :
                menu2();
                break;
            case 7 :
                kasa();
                break;
            case 8:
                cikis();
                break;
            default:
                icecekGoster();
        }
        icecekAlis(secim,miktar);
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
        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();
        int urun = 0;
        switch(secim) {
            case 1 :
                System.out.println("Kac adet almak istersiniz.");
                urun = 50;
                break;
            case 2 :
                System.out.println("Kac adet almak istersiniz.");
                urun = 51;
                break;
            case 3 :
                System.out.println("Kac adet almak istersiniz.");
                urun = 52;
                break;
            case 4 :
                System.out.println("Kac adet almak istersiniz.");
                urun = 53;
                break;
            case 5 :
                System.out.println("Kac adet almak istersiniz.");
                urun = 54;
                break;
            case 6 :
                temizlikGoster();
                break;
            case 7 :
                kasa();
            case 8 :
                cikis();
            default:
                System.out.println("Gecerli sayi giriniz.");
                temizlikGoster();
            }
        int miktar = scan.nextInt();
        temizlikAlis(urun, miktar);


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
        switch (secim) {
            case 50 :
                toplamTutar += miktar*20 ;
                break;
            case 51 :
                toplamTutar += miktar*30 ;
                break;
            case 52 :
                toplamTutar += miktar*15 ;
                break;
            case 53 :
                toplamTutar += miktar*15 ;
                break;
            case 54 :
                toplamTutar += miktar*25 ;
                break;
            default:
                System.out.println("Lutfen verileri kontrol ediniz");
                temizlikGoster();
                break;
        }
        sepet.add(secim);
        System.out.println("ürününüz sepete eklenmiştir");
        temizlikGoster();

    }

}
