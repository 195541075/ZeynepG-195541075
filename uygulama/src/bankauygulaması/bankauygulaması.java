package bankauygulamasý;

import java.util.Scanner;

public class bankauygulamasý {
	
	static Scanner sc = new Scanner(System.in);
	
	static int HesaptakiPara = 0;
	
	public static void main(String[] args) {
		
		String adSoyad;
		
		int secenek;
		
		
		
		adSoyad = adSoyadAl();
		
		do {
			menu(adSoyad);
			
			secenek = secenekAl();
			
			secenekKontrol(secenek);
			
			if(secenek == 4) {
				
				break;
			}
			
			menuYonlendir();
			
		}while(secenek != 4);
		
	
		
	}
	public static void secenekKontrol(int secenek){
	
		 
		if(secenek == 1) {
			
			ParaYatir();
			
	    }
 
		else if(secenek == 2) {
			
			ParaCekme();
			
		}
	
		else if(secenek == 3) {
			
			BakiyeSorma();
			
		}
		else if(secenek == 4) {
			
			Cikis();
			
		}
		else {
			
			System.out.print("Yanlýþ bir Seçenek Seçtiniz.Lütfen Tekrar Giriþ Yapýnýz");
			
		}
	}
	    public static void Cikis() {
	    	
	    	System.out.print("Çýkýþ Yapýlýyor.Kendinize Ýyi Bakýn Görüþmek Dileðiyle.");
	    }
	    
	    
 	    public static void ParaYatir() {
	    	
	    	int YatirilanPara;
	    	
	    	System.out.print("Para Yatýrmayý Seçtiniz. Hesaptaki Paranýz:" + HesaptakiPara);
	    	
	    	do{
	    		System.out.print("Yatýrmak Ýstediðiniz Miktar:");
	    		
	    		YatirilanPara = sc.nextInt();
	    		
	    		if(YatirilanPara < 0) {
	    		
	    		System.out.print("Böyle Bir Para Giriþi Olamaz.Yeniden Giriniz.");
	    		}
	    		
	    		
	    	}while(YatirilanPara < 0);
	    	
	    	
	    	HesaptakiPara = HesaptakiPara + YatirilanPara;
	    	
	    	System.out.print("Hesabýnýza Para Yatýrýldý.Þuanki Bakiyeniz : " + HesaptakiPara);
	    	
	    	
	    	
	    	
	    }
	    
	    public static void ParaCekme() {

	    	
	    	int CekilenPara;
	    	
	    	System.out.print("Para Çekmeyi Seçtiniz.Hesaptaki Paranýz :" +HesaptakiPara);
	    	
	    	do {
	    		System.out.print("Çekmek Ýstediðiniz Tutar : ");
		    	
		    	CekilenPara = sc.nextInt();
		    	
		    	if(CekilenPara > HesaptakiPara) {
		    		
		    		System.out.print("Hesabýnýzda Bu Kadar Nakit Yok.Lütfen Yeniden Deneyiniz.");
		    	}
	    
	    	}while(CekilenPara > HesaptakiPara);
	    	
	    	HesaptakiPara = HesaptakiPara - CekilenPara;
	    	
	    	System.out.print("Hesabýnýzdan Para Çekildi.Þuanki Bakiyeniz : " + HesaptakiPara);
	    	
	    }
	   
	    public static void BakiyeSorma() {
	    	
	    	System.out.print("Hesabýnýzdaki Para : " + HesaptakiPara);
	    }
		
	    public static String adSoyadAl() {
	    	
		String ad;
		
		String soyad;
		
		System.out.print("Hoþgeldiniz, Lütfen ilerlemek için");
		
		System.out.print(" Adýnýzý giriniz: ");
		
		ad = sc.next();
		
		System.out.print(" Soyadýnýzý giriniz:");
		
		soyad = sc.next();
		
		
		return ad + " " + soyad;
		
		
	}
 
	public static void menu(String adSoyad) {
		
		System.out.print("Hoþgeldin" + adSoyad);
		
		System.out.print ("*MENU*"); 
			
		System.out.print ( " 1) Para Yatýrma"); 
		
		System.out.print ( " 2) Para Çekme"); 
		
		System.out.print ( " 3) Bakiye Sorma\n4 ) Çýkýþ"); 
		
		
		
	}
 
	public static int secenekAl(){

		
     System.out.print("Bir Seçenek Giriniz:");
     		
     int secenek = sc.nextInt();
     
     return secenek;

	}

	public static void menuYonlendir() {
		
		System.out.print("\nMenuye Yönlendiriliyorsunuz...\n");
	}

}