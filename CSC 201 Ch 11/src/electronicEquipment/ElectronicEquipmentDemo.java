package electronicEquipment;
import java.math.BigDecimal;
public class ElectronicEquipmentDemo {
	public static void main(String[]args)
	{
		BigDecimal amount = new BigDecimal(200);
		CellPhones samsungS5 = new CellPhones("Galaxy S5", amount, 10, 20, "Samsung", 5.5, 16);
		amount = new BigDecimal(5000);
		Computer randomRig = new Computer("Alienware X51", amount, 90, 100, "Alienware", "GTX 980", "i7-maxwell", 32, "Windows 8.1");
		amount = new BigDecimal(190);
		DigitalCameras camera = new DigitalCameras("Coolpix L830", amount, 5, 10, "Nikon", 16, "SD");
		amount = new BigDecimal(100);
		ElectronicEquipment machine = new ElectronicEquipment("Random Machine", amount, 2000, 230, "Some Company");
		
		System.out.println(samsungS5);
		System.out.println("\n"+randomRig);
		System.out.println("\n"+camera);
		System.out.println("\n"+machine);
	}
}
