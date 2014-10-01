package electronicEquipment;

import java.math.BigDecimal;
public class ElectronicEquipment {
	private int weight, powerUseage;
	private BigDecimal cost;
	private String nameOfManufacturer, nameOfDevice;
	
	public ElectronicEquipment(String nameOfDevice, BigDecimal cost, int weight, int powerUseage, String nameOfManufacturer)
	{//constructor
		super();
		this.nameOfDevice=nameOfDevice;
		this.cost=cost;
		this.weight=weight;
		this.powerUseage=powerUseage;
		this.nameOfManufacturer=nameOfManufacturer;
	}
	//getters and setters
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPowerUseage() {
		return powerUseage;
	}
	public void setPowerUseage(int powerUseage) {
		this.powerUseage = powerUseage;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public String getNameOfManufacturer() {
		return nameOfManufacturer;
	}
	public void setNameOfManufacturer(String nameOfManufacturer) {
		this.nameOfManufacturer = nameOfManufacturer;
	}
	public String getNameOfDevice() {
		return nameOfDevice;
	}
	public void setNameOfDevice(String nameOfDevice) {
		this.nameOfDevice = nameOfDevice;
	}
	@Override
	public String toString() {
		return "ElectronicEquipment [weight=" + weight + ", powerUseage="
				+ powerUseage + ", cost=" + cost + ", nameOfManufacturer="
				+ nameOfManufacturer + ", nameOfDevice=" + nameOfDevice + "]";
	}
}
