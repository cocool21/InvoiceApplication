import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;
public class InvoiceApplication {

	public static void main(String[] args) {
		NumberFormat nf= NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);
		nf.setRoundingMode(RoundingMode.HALF_UP);
		Scanner sc=new Scanner(System.in);
		double[] data=new double[100];
		int counter=0;
		double total=0,tax=0;
		//variable settings!
		
		System.out.println("Enter tax rate followed by prices");
		data[counter]=sc.nextDouble();
        do{
        	counter++;
        	data[counter]=sc.nextDouble();
        	
        }while(data[counter]!=0.0);
        System.out.println("Tax Rate ? : "+nf.format(data[0]));
        for(int i=1;i<=counter;i++){
        	System.out.println("Price # "+i+"  : "+nf.format(data[i]));
        	total+=data[i];
        }
        tax=total*data[0];
 
        System.out.println("");
        System.out.println("--------------------------------------------");
        System.out.println("");
        
        System.out.println("Reciept");
        for(int i=1;i<counter;i++){
        	System.out.println(nf.format(data[i]));
        }
        System.out.println(nf.format(total)+" subtotal");
        System.out.println(tax+" tax");
        System.out.println(nf.format(total+tax)+" grand total");
        sc.close();
	}

}
