package Odev5_Sorular;

import java.util.Scanner;

public class Soru7 {

	public static void main(String[] args) {
		//Kullanicidan toplamak uzere pozitif sayilar isteyin, 
				///islemi bitirmek icin 0’a basmasinisoyleyin. 
				//Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve
				//girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.(do while dongusu ile)
				
				
				Scanner scan=new Scanner(System.in);
				System.out.println("Pozitif sayi girin");
				
				
				int a=0;
				int sayac=0;
				int sayi=0;
				
				do {
					sayi=scan.nextInt();
					
					
					if(sayi>0) {
						a=a+sayi;
						sayac++;
					}
					
				} 
				while (sayi!=0);
				System.out.println(a);
				System.out.println(sayac);

	}

}
