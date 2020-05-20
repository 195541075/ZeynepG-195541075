package bankauygulamas�;

import java.util.Scanner;

public class bankauygulamas� {
	
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
			
			System.out.print("Yanl�� bir Se�enek Se�tiniz.L�tfen Tekrar Giri� Yap�n�z");
			
		}
	}
	    public static void Cikis() {
	    	
	    	System.out.print("��k�� Yap�l�yor.Kendinize �yi Bak�n G�r��mek Dile�iyle.");
	    }
	    
	    
 	    public static void ParaYatir() {
	    	
	    	int YatirilanPara;
	    	
	    	System.out.print("Para Yat�rmay� Se�tiniz. Hesaptaki Paran�z:" + HesaptakiPara);
	    	
	    	do{
	    		System.out.print("Yat�rmak �stedi�iniz Miktar:");
	    		
	    		YatirilanPara = sc.nextInt();
	    		
	    		if(YatirilanPara < 0) {
	    		
	    		System.out.print("B�yle Bir Para Giri�i Olamaz.Yeniden Giriniz.");
	    		}
	    		
	    		
	    	}while(YatirilanPara < 0);
	    	
	    	
	    	HesaptakiPara = HesaptakiPara + YatirilanPara;
	    	
	    	System.out.print("Hesab�n�za Para Yat�r�ld�.�uanki Bakiyeniz : " + HesaptakiPara);
	    	
	    	
	    	
	    	
	    }
	    
	    public static void ParaCekme() {

	    	
	    	int CekilenPara;
	    	
	    	System.out.print("Para �ekmeyi Se�tiniz.Hesaptaki Paran�z :" +HesaptakiPara);
	    	
	    	do {
	    		System.out.print("�ekmek �stedi�iniz Tutar : ");
		    	
		    	CekilenPara = sc.nextInt();
		    	
		    	if(CekilenPara > HesaptakiPara) {
		    		
		    		System.out.print("Hesab�n�zda Bu Kadar Nakit Yok.L�tfen Yeniden Deneyiniz.");
		    	}
	    
	    	}while(CekilenPara > HesaptakiPara);
	    	
	    	HesaptakiPara = HesaptakiPara - CekilenPara;
	    	
	    	System.out.print("Hesab�n�zdan Para �ekildi.�uanki Bakiyeniz : " + HesaptakiPara);
	    	
	    }
	   
	    public static void BakiyeSorma() {
	    	
	    	System.out.print("Hesab�n�zdaki Para : " + HesaptakiPara);
	    }
		
	    public static String adSoyadAl() {
	    	
		String ad;
		
		String soyad;
		
		System.out.print("Ho�geldiniz, L�tfen ilerlemek i�in");
		
		System.out.print(" Ad�n�z� giriniz: ");
		
		ad = sc.next();
		
		System.out.print(" Soyad�n�z� giriniz:");
		
		soyad = sc.next();
		
		
		return ad + " " + soyad;
		
		
	}
 
	public static void menu(String adSoyad) {
		
		System.out.print("Ho�geldin" + adSoyad);
		
		System.out.print ("*MENU*"); 
			
		System.out.print ( " 1) Para Yat�rma"); 
		
		System.out.print ( " 2) Para �ekme"); 
		
		System.out.print ( " 3) Bakiye Sorma\n4 ) ��k��"); 
		
		
		
	}
 
	public static int secenekAl(){

		
     System.out.print("Bir Se�enek Giriniz:");
     		
     int secenek = sc.nextInt();
     
     return secenek;

	}

	public static void menuYonlendir() {
		
		System.out.print("\nMenuye Y�nlendiriliyorsunuz...\n");
	}

}