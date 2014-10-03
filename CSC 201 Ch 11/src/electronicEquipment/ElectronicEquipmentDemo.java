package electronicEquipment;
import java.math.BigDecimal;
//Richard Cunningham
//Problem Statement
//Design and implement a set of classes that define various types of electronics equipment 
//(computers, cell phones, pagers, digital cameras, etc.). Include data values that describe various 
//attributes of th electronics, such as the weight, cost, power usage, and the names of the manufacturers.
//Include methods that are named appropriately for each class and that print an appropriate message.
//Create a main driver class to instantiate and exercise several of the classes.
//
//
//Directions
//
//Consider the problem, design an algorithm (or algorithms) that would solve the problem, and then implement the algorithm in Java.
//Please insert the algorithm written in pseudocode as a comment in the beginning of your program.
//Submit the source code, along with snapshots of your running program - you can take snapshots using PrintScreen, making sure that the console window in which you run the program appears on the screen.
//Copy the snapshot in a word processing program of your choosing. If your program has different outcomes, take snapshots of each variation.
//Upload your screenshots in Blackboard using the Assignment Upload area below.
public class ElectronicEquipmentDemo {
	public static void main(String[]args)
	{
		BigDecimal amount = new BigDecimal(200);
		ElectronicEquipment samsungS5 = new CellPhones("Galaxy S5", amount, 10, 20, "Samsung", 5.5, 16);
		amount = new BigDecimal(5000);
		ElectronicEquipment randomRig = new Computer("Alienware X51", amount, 90, 100, "Alienware", "GTX 980", "i7-maxwell", 32, "Windows 8.1");
		amount = new BigDecimal(190);
		ElectronicEquipment camera = new DigitalCameras("Coolpix L830", amount, 5, 10, "Nikon", 16, "SD");
		amount = new BigDecimal(100);
		ElectronicEquipment machine = new ElectronicEquipment("Random Machine", amount, 2000, 230, "Some Company");
		
		System.out.println(samsungS5);
		System.out.println("\n"+randomRig);
		System.out.println("\n"+camera);
		System.out.println("\n"+machine);
	}
}
