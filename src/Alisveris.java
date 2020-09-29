import java.util.*;
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
    static List<Double> miktarlar = new ArrayList<>();
    static double toplamTutar =0;
    static boolean uyeGirisi = false;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //menu1();
        StringBuilder stb = new StringBuilder();
        stb.append("semra");
        System.out.println(stb.equals(stb.reverse()));                          //true
        System.out.println(stb.toString().equals(stb.reverse().toString()));    //false

    }
    public static void main (String a){

    }
    public static void menu1()  {  // Bilal ÇAKAR
        //İki seçenekli bir menu oluşturarak ilgili methodlara yönlendirilecekler
        // not olarak "üye girişi ile yapılan alışverişlerde kasada %10 indirim uygulanacaktır.
        //1 üye girişi uyeGirisi();
        //2 üye girişi yapmadan menu2()
        System.out.println("____________________________Market Girişi__________________________________________________");
        System.out.println("___________________________________________________________________________________________");
        System.out.println("Team5 Marketimize Hoşgeldiniz\n\nYüzde 10 indirimimizden yararlanmak için üye girişi yapabilir\nYada üye girişi yapmadan devam edebilirsiniz");
        System.out.println("Lütfen seçim yapınız.\n 1 - Üye girişi Yap\n 2 - Alışverişe başla\n 3 - Çıkış");
        int secim = scan.nextInt();
        switch (secim){
            case 1 : uyeGirisi();
            break;
            case 2 : menu2();
            break;
            case 3 : cikis();
            break;
            default:
                System.out.println("Lütfen doğru girişi yapınız.");
                menu1();
        }
    }
    public static void uyeGirisi(){  //Bayram ERDOĞAN
        //kullanıcı adı ardından şifre istenecek doğruluğu kontrol edilerek doğru giriş yapılır ise
        // uyeGirisi variablesi değeri "true" olarak güncellenecek
        // menu2() yönlendirilecek
        //Hatalı giriş için tekrar menu1() yönlendirilecek
        //kullanıcı adı ardından şifre istenecek
        //Scanner scan = new Scanner (System.in);
        System.out.println("___________________________________________________________________________________________");
        System.out.println("____________________________Üye Girişi_____________________________________________________");
        System.out.println("Lutfen kullanici adinizi giriniz");

        String name =scan.nextLine();

        System.out.println("Lutfen kullanici sifrenizi giriniz");
        String pin =scan.nextLine();
        //doğruluğu kontrol edilerek doğru giriş yapılır ise

        if ((name.equals("Team5")&&pin.equals("Team5"))||(name.equals("Ahmet")&&pin.equals("Ahmet"))){
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
            uyeGirisi();//Hatalı giriş için tekrar menu1() yönlendirilecek
        }
    }
    public static void menu2(){   //Ertuğrul TOKGÖZ
        //Alışveriş yapmak istediği market bölümüne yönlendirebilmek için
        //4 seçenekli menü oluşturulacak
        // 1 manavGoster()
        // 2 giyimGoster()
        // 3 sarkuteriGoster()
        // 4 cıkıs()
        System.out.println("___________________________________________________________________________________________");
        System.out.println("________________________________Menü 2_____________________________________________________");
        System.out.println("Menu2");
        System.out.println("Lutfen Alisveris yapmak istediginiz market bolumunu seciniz \n1-Manav \n2-Giyim \n3-Sarkuteri \n4-İçecek \n5-Temizlik \n6-Cikis");
        //Scanner scan=new Scanner(System.in);
        int secim =scan.nextInt();
        if (secim==1) {
            manavGoster();
        }if (secim==2) {
            giyimGoster();
        }if (secim==3) {
            sarkuteriGoster();
        }if (secim==4) {
            icecekGoster();
        }if (secim==5) {
            temizlikGoster();
        }if (secim==6) {
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
        System.out.println("___________________________________________________________________________________________");
        System.out.println("____________________________Manav__________________________________________________________");
        HashMap<Integer,String> manavUrun = new HashMap <> ();
        manavUrun.put(1, "Elma");
        manavUrun.put(2, "Armut");
        manavUrun.put(3, "Domates");
        manavUrun.put(4, "Biber");
        manavUrun.put(5, "Karpuz");
        manavUrun.put(6, "Geri");
        manavUrun.put(7, "Çıkış");
        manavUrun.put(8, "Kasa");

        HashMap<String,Double> manavFiyat = new HashMap <> ();
        manavFiyat.put("Elma",2.00);
        manavFiyat.put("Armut",4.00);
        manavFiyat.put("Domates",2.50);
        manavFiyat.put("Biber",3.50);
        manavFiyat.put("Karpuz",1.00);


        Scanner scan = new Scanner(System.in);
        System.out.println(" 1) Ürünleri listele\n 2)Ürün Fiyatlarını listele");
        int islem = scan.nextInt();
        if (islem ==1){
            System.out.println(manavUrun);
        }else if(islem == 2){
            System.out.println(manavFiyat);
        }else{
            System.out.println("Lütfen geçerli değer giriniz");
            manavGoster();
        }


        System.out.println("Hangi ürün seçmek istiyorsunuz?");
        System.out.println(manavUrun);
        int secim = scan.nextInt();
        int a = 0;
        switch (secim){
            case 1:
                a=10;
                break;
            case 2:
                a = 11;
                break;
            case 3:
                a = 12;
                break;

            case 4:
                a = 13;
                break;
            case 5:
                a = 14;
                break;
            case 6:
                menu2();
                return;
            case 7:
                cikis();
                return;
            case 8 :
                kasa();
                return;

            default:
                System.out.println("Lütfen geçerli menü girişi yapın");
                manavGoster();
        }


        System.out.println("------------------------------------");

        System.out.println("Kaç kilo almak istiyorsunuz?");
        double miktar = scan.nextDouble();

        manavAlis(a,miktar);





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
        System.out.println("___________________________________________________________________________________________");
        System.out.println("____________________________Giyim Reyonu___________________________________________________");
        List<String> urunListesi = new ArrayList<>();
        List<Double> urunFiyatlari = new ArrayList<>();
        urunListesi.add("Urun Kodu:1 - t-shirt - Fiyat:25.00");
        urunListesi.add("Urun Kodu:2 - Pantolon - Fiyat:40.00");
        urunListesi.add("Urun Kodu:3 - Gomlek - Fiyat:30.00");
        urunListesi.add("Urun Kodu:4 - Esofman - Fiyat:50.00");
        urunListesi.add("Urun Kodu:5 - Ayakkabi - Fiyat:80.00");
        urunListesi.add("6 geri dön");
        urunListesi.add("7 cikis");
        urunFiyatlari.add(25.00);
        urunFiyatlari.add(40.00);
        urunFiyatlari.add(30.00);
        urunFiyatlari.add(50.00);
        urunFiyatlari.add(80.00);
        System.out.println(urunListesi.toString());

        System.out.println("Hangi urunu secmek istersiniz");
        int secim = scan.nextInt();

        int secim1 = 0;
        switch (secim) {
            case 1 :
                secim1=20;
                break;
            case 2 :
                secim1=21;
                break;
            case 3 :
                secim1=22;
                break;
            case 4 :
                secim1=23;
                break;
            case 5 :
                secim1=24;
                break;
            case 6 :
                menu2();
                break;
            case 7 :
                cikis();
                break;
            case 8 :
                kasa();
                break;
            default:
                System.out.println("Lutfen gecerli bir giris yapiniz.");
        }


        System.out.println("lutfen adet giriniz");
        int adet = scan.nextInt();
        giyimAlis(secim1 , adet);

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
        System.out.println("___________________________________________________________________________________________");
        System.out.println("____________________________Şarküteri______________________________________________________");
        String arr4[] = {"1 Peynir=20 $ ","2 Zeytin=15 $", "3 Salam=20 $", "4 Sucuk=40$", "5 Pastırma=80$","geri","Kasaya git","cikis"};
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
                System.out.println("Siparisiniz : Peynir " + miktar*20 +  "$ dir" );
                break;
            case 2 :
                System.out.println("Siparisiniz : Zeytin " + miktar*15 +  "$ dir");
                break;
            case 3 :
                System.out.println("Siparisiniz : Salam " + miktar*20 +  "$ dir");
                break;
            case 4 :
                System.out.println("Siparisiniz : Sucuk " + miktar*40 +  "$ dir");
            break;
            case 5 :
                System.out.println("Siparisiniz :Pastırma " + miktar*80 +  "$ dir");
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
        sarkuteriAlis(secim,miktar);

    }
    public static void manavAlis(int secim, double miktar){  //Basri AKBAŞ
        //secim kodu ile alınan ürünün fiyatını miktar ile çarpıp çıakn sonucu "toplamTutar" variablesine eklenecek
        System.out.println("___________________________________________________________________________________________");

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
        miktarlar.add(miktar);
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
        System.out.println("___________________________________________________________________________________________");

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
        miktarlar.add((double) miktar);
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

            switch (secim) {
                case 30:
                    toplamTutar+=20*miktar;
                    break;
                case 31:
                    toplamTutar+=15*miktar;
                    break;
                case 32:
                    toplamTutar+=20*miktar;
                    break;
                case 33:
                    toplamTutar+=40*miktar;
                    break;
                case 34:
                    toplamTutar+=80*miktar;
                    break;
            }
            //seçim kodu sepet list ine eklenecek
            sepet.add(secim);
            miktarlar.add((double) miktar);
            //"ürününüz sepete eklenmiştir" yazıp
            System.out.println("ürününüz sepete eklenmiştir");
            //manavGoster() methoduna geri gönderecek
            sarkuteriGoster();

        }
    public static void sepetGoster() {      //Fatih ÜSTÜNYER
        //Sepet listine kodları eklenen ürünlerin isimleri ve fiyatları ile gösterilmesi
        System.out.println("___________________________________________________________________________________________");
        System.out.println("____________________________Sepet__________________________________________________________");
        int i =0;
        for (Integer w:sepet) {
            switch (w) {
                case 10:
                    System.out.println(i+" Elma 2 tl");
                    break;
                case 11:
                    System.out.println(i+" Armut 4 tl");
                    break;
                case 12:
                    System.out.println(i+" Domates 2,5 tl");
                    break;
                case 13:
                    System.out.println(i+" Biber 3,5 tl");
                    break;
                case 14:
                    System.out.println(i+" Karpuz 1 tl");
                    break;
                case 20:
                    System.out.println(i+" t-shirt 25 tl");
                    break;
                case 21:
                    System.out.println(i+" Pantolon 40 tl");
                    break;
                case 22:
                    System.out.println(i+" Gömlek 30 tl");
                    break;
                case 23:
                    System.out.println(i+" Eşofman 50 tl");
                    break;
                case 24:
                    System.out.println(i+" Ayakkabı 80 tl");
                    break;
                case 30:
                    System.out.println(i+" Peynir 20 tl");
                    break;
                case 31:
                    System.out.println(i+" Zeytin 15 tl");
                    break;
                case 32:
                    System.out.println(i+" Salam 20 tl");
                    break;
                case 33:
                    System.out.println(i+" Sucuk 40 tl");
                    break;
                case 34:
                    System.out.println(i+" Pastırma 80 tl");
                    break;
                case 40:
                    System.out.println(i+" Kola 5");
                    break;
                case 41:
                    System.out.println(i+" Meyve suyu 4 tl");
                    break;
                case 42:
                    System.out.println(i+" Gazoz 2,5 tl");
                    break;
                case 43:
                    System.out.println(i+" Ayran 2 tl");
                    break;
                case 44:
                    System.out.println(i+" Limonata 1 tl");
                    break;
                case 50:
                    System.out.println(i+" Bulaşık deterjanı 20 tl");
                    break;
                case 51:
                    System.out.println(i+" Çamaşır deterjanı 30 tl");
                    break;
                case 52:
                    System.out.println(i+" Çamaşır suyu 15 tl");
                    break;
                case 53:
                    System.out.println(i+" Sıvı sabun 15 tl");

                case 54:
                    System.out.println(i+" Dezenfektan 25 tl");

            }
            i++;

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
        System.out.println("___________________________________________________________________________________________");
        System.out.println("____________________________Kasa___________________________________________________________");
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
            System.out.println("Para ustunuz : " + (toplamOdeme-toplamTutar ));
            sepet.clear();
            cikis();
        }
    }



    public static void sepettenCikar() {  // Hamza KAYALI
        //öncelikle sepetGoster() methodu çağrılarak sepet listelenecek
        //listeden seçilen ürün list den silinecek
        //toplamTutar variablesinden seçilen ürün fiyatı çıkarılacak
        //tekrar kasa() methoduna gönderilecek
        sepetGoster();
        System.out.println("___________________________________________________________________________________________");
        System.out.println("____________________________Sepetten Çıkar_________________________________________________");
        System.out.println("\nYapmış olduğunuz ödeme ürüm fiyatlarını karşılamamaktadır lütfen sepetinizden ürün bırakınız");
        System.out.println("\n Sepetten Hangi ürünü çıkarmak istersiniz");
        int secilen = scan.nextInt();
//
        if (sepet.get(secilen)/10==1){
            toplamTutar-=miktarlar.get(secilen)*fiyat(sepet.get(secilen));
            sepet.remove(secilen);
            miktarlar.remove(secilen);

        }
        else if (miktarlar.get(secilen)!=1){
            System.out.println("Seçilen üründen sepette "+ miktarlar.get(secilen)+" Adet bulunmaktadır" );
            System.out.println("\n Kaç adet çıkarmak istersiniz?");
            int adet = scan.nextInt();
            double yeniAdet = miktarlar.get(secilen) - adet;
            miktarlar.set(secilen,yeniAdet);
            toplamTutar-=adet*fiyat(sepet.get(secilen));
        }
        else{
            toplamTutar-=miktarlar.get(secilen)*fiyat(sepet.get(secilen));
            sepet.remove(secilen);
            miktarlar.remove(secilen);
        }
        kasa();


    }
    public static double fiyat(int urun){
        switch (urun){
            case 10 : return 2 ;
            case 11 : return 4 ;
            case 12 : return 2.5 ;
            case 13 : return 3.5 ;
            case 14 : return 1 ;
            case 20 : return 25 ;
            case 21 : return 40 ;
            case 22 : return 30 ;
            case 23 : return 50 ;
            case 24 : return 80 ;
            case 30 : return 25 ;
            case 31 : return 15 ;
            case 32 : return 20 ;
            case 33 : return 40 ;
            case 34 : return 80 ;
            case 40 : return 5 ;
            case 41 : return 4 ;
            case 42 : return 2.5 ;
            case 43 : return 1.5 ;
            case 44 : return 1 ;
            case 50 : return 20 ;
            case 51 : return 30 ;
            case 52 : return 15 ;
            case 53 : return 15 ;
            case 54 : return 25 ;
            default:
                return 0;
        }

    }
    public static void cikis(){
        System.out.println("___________________________________________________________________________________________");
        System.out.println("____________________________Çıkış__________________________________________________________");
        //sepet kontrolu yapılarak boş ise programdan çıkış yapılır dolu ise kasaya yönlendirilir.
        if (!sepet.isEmpty()){
            System.out.println("Ürünlerin ödemesini yapmadan çıkış yapamazsınız");
            kasa();
        }else {
            System.out.println("Yine bekleriz");
            System.exit(0);
        }

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
        System.out.println("___________________________________________________________________________________________");
        System.out.println("____________________________İçecek Reyonu__________________________________________________");
        String arr4[] = {"1 su=0.50 $ ","2 Meyve Suyu=2 $", "3 Soda=0.50 $", "4 kola=1$", "5 Cay=1$","geri","Kasaya git","cikis"};
        for(int i=0; i<arr4.length; i++) {
            System.out.println(arr4[i]);
        }
        System.out.println("Lütfen Seciminizi yapiniz");
        Scanner scan = new Scanner(System.in);
        int secim=scan.nextInt();
        System.out.println("Miktari giriniz");
        int miktar=scan.nextInt();
        int secim1=0;

        switch(secim) {
            case 1 :
                System.out.println("Siparisiniz : su " + miktar*0.50 +  "$ dir" );
                secim1=40;
                break;
            case 2 :
                System.out.println("Siparisiniz : Meyve suyu " + miktar*2 +  "$ dir");
                secim1=41;
                break;
            case 3 :
                System.out.println("Siparisiniz :Soda " + miktar*0.50 +  "$ dir");
                secim1=42;
                break;
            case 4 :
                System.out.println("Siparisiniz :Kola " + miktar +  "$ dir");
                secim1=43;
                break;
            case 5 :
                System.out.println("Siparisiniz :Cay " + miktar +  "$ dir");
                secim1=44;
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

        icecekAlis(secim1,miktar);
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
        System.out.println("___________________________________________________________________________________________");
        System.out.println("____________________________Temizlik Reyonu________________________________________________");
        System.out.println("Lutfen almak istediginiz Urunun numarasini giriniz.");
        System.out.println("  Urun Kodu    Urun Adi          Urun Fiyati");
        System.out.println("1.   50  -  Bulasik Deterjani -    20.00\n"
                + "2.   51  -  Camasir Deterjani -    30,00\n"
                + "3.   52  -  Camasir Suyu      -    15,00\n"
                + "4.   53  -  Sivi Sabun        -    15,00\n"
                + "5.   54  -  Dezenfektan       -    25,00\n"
                + "6. Geri\n7. Kasaya Git\n8. Cikis");
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
        System.out.println("___________________________________________________________________________________________");

        switch (secim) {
            case 40 :
                toplamTutar += miktar*5 ;
                break;
            case 41 :
                toplamTutar += miktar*4 ;
                break;
            case 42 :
                toplamTutar += miktar*2.5 ;
                break;
            case 43 :
                toplamTutar += miktar*1.5 ;
                break;
            case 44 :
                toplamTutar += miktar ;
                break;
            default:
                System.out.println("Lutfen verileri kontrol ediniz");
                icecekGoster();
                break;
        }
        sepet.add(secim);
        miktarlar.add((double) miktar);
        System.out.println("ürününüz sepete eklenmiştir");
        icecekGoster();

    }
    public static void temizlikAlis(int secim,int miktar) {     //Yusuf Horuz
        //secim kodu ile alınan ürünün fiyatını miktar ile çarpıp çıakn sonucu "toplamTutar" variablesine eklenecek
        //seçim kodu sepet list ine eklenecek
        //"ürününüz sepete eklenmiştir" yazıp
        //giyimGoster() methoduna geri gönderecek
        System.out.println("___________________________________________________________________________________________");

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
        miktarlar.add((double) miktar);
        System.out.println("ürününüz sepete eklenmiştir");
        temizlikGoster();

    }

}
