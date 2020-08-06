package bir_ic_aci;
import java.util.Scanner;
public class icaci {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Cokgen kac kenarli ? : ");
	double n=scanner.nextDouble();
	
	double ia=(n-2)*180/n;
	
	System.out.println(n + " kenarli cokgenin bir ic acisi : " + ia + " derecedir.");

	}

}
