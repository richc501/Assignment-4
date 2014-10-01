package electronicEquipment;

import java.math.BigDecimal;
public class Computer extends ElectronicEquipment {
	private String GPU, CPU, operatingSystem;
	private int gigsOfRam;
	public Computer(String nameOfDevice, BigDecimal cost, int weight,
			int powerUseage, String nameOfManufacturer, String GPU, String CPU, int gigsOfRam, String operatingSystem) 
	{ //constructor
		super(nameOfDevice, cost, weight, powerUseage, nameOfManufacturer);
		this.GPU=GPU;
		this.CPU=CPU;
		this.gigsOfRam=gigsOfRam;
		this.operatingSystem=operatingSystem;
	}
	//getters and setters 
	public String getGPU() {
		return GPU;
	}
	public void setGPU(String gPU) {
		GPU = gPU;
	}
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		CPU = cPU;
	}
	public int getGigsOfRam() {
		return gigsOfRam;
	}
	public void setGigsOfRam(int gigsOfRam) {
		this.gigsOfRam = gigsOfRam;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	@Override
	public String toString() {
		return "Computer [GPU=" + GPU + ", CPU=" + CPU + ", gigsOfRam="
				+ gigsOfRam + ", operatingSystem="+operatingSystem+"\n , getWeight()=" + getWeight()
				+ ", getPowerUseage()=" + getPowerUseage() + ", getCost()="
				+ getCost() + ", getNameOfManufacturer()="
				+ getNameOfManufacturer() + ", getNameOfDevice()="
				+ getNameOfDevice() + "]";
	}
	
}
