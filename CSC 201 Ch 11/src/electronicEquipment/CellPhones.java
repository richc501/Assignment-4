package electronicEquipment;

import java.math.BigDecimal;
public class CellPhones extends ElectronicEquipment
{
	private double screenSize;
	private int amountOfMemory;
	public CellPhones(String nameOfDevice, BigDecimal cost, int weight,
			int powerUseage, String nameOfManufacturer, double screenSize, int amountOfMemory) 
	{ //constructor
		super(nameOfDevice, cost, weight, powerUseage, nameOfManufacturer);
		this.screenSize=screenSize;
		this.amountOfMemory=amountOfMemory;
	}
	//getters and setters
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public int getAmountOfMemory() {
		return amountOfMemory;
	}
	public void setAmountOfMemory(int amountOfMemory) {
		this.amountOfMemory = amountOfMemory;
	}
	@Override
	public String toString() {
		return "CellPhones [screenSize=" + screenSize + ", amountOfMemory="
				+ amountOfMemory + ", getWeight()=" + getWeight()
				+ ", getPowerUseage()=" + getPowerUseage() + "\n , getCost()="
				+ getCost() + ", getNameOfManufacturer()="
				+ getNameOfManufacturer() + ", getNameOfDevice()="
				+ getNameOfDevice() + "]";
	}
}