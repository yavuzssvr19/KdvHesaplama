package kdvHesaplama;
import java.util.Scanner;

public class project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ınp=new Scanner(System.in);
		System.out.print("Ücretim: ");
		
		double price=ınp.nextDouble();
		
		
		System.out.print("Kdv: ");
		double kdvPrice=ınp.nextDouble();
        
		double kdvTutarı=price*kdvPrice;
		
		System.out.println("Kdv Tutarı: "+kdvTutarı);
		
		
		double kdvliFiyat=kdvTutarı+price;
		
		System.out.print("Ürünümüzün Fiyatı: "+kdvliFiyat);
		
		
		

	}

}
