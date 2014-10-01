package electronicEquipment;

import java.math.BigDecimal;

public class DigitalCameras extends ElectronicEquipment{
	private int numberOfMegaPixels;
	private String typeOfMemoryCard;
	public DigitalCameras(String nameOfDevice, BigDecimal cost, int weight,
			int powerUseage, String nameOfManufacturer, int numberOfMegaPixels, String typeOfMemoryCard) 
	{//Constructors
		super(nameOfDevice, cost, weight, powerUseage, nameOfManufacturer);
		this.numberOfMegaPixels=numberOfMegaPixels;
		this.typeOfMemoryCard=typeOfMemoryCard;
	}
	//getters and setters
	public int getNumberOfMegaPixels() {
		return numberOfMegaPixels;
	}
	public void setNumberOfMegaPixels(int numberOfMegaPixels) {
		this.numberOfMegaPixels = numberOfMegaPixels;
	}
	public String getTypeOfMemoryCard() {
		return typeOfMemoryCard;
	}
	public void setTypeOfMemoryCard(String typeOfMemoryCard) {
		this.typeOfMemoryCard = typeOfMemoryCard;
	}
	@Override
	public String toString() {
		return "DigitalCameras [numberOfMegaPixels=" + numberOfMegaPixels
				+ ", typeOfMemoryCard=" + typeOfMemoryCard + ", getWeight()="
				+ getWeight() + ", getPowerUseage()=" + getPowerUseage()
				+ ", getCost()=" + getCost() + "\n , getNameOfManufacturer()="
				+ getNameOfManufacturer() + ", getNameOfDevice()="
				+ getNameOfDevice() + "]";
	}
}