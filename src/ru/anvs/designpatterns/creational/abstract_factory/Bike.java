package ru.anvs.designpatterns.creational.abstract_factory;
/**
 * Abstract class for Bike product
 * @author novoselovas
 *
 */
public abstract class Bike implements VehicleForRent {
	
	private String type;
	private int weelSizeInch;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWeelSizeInch() {
		return weelSizeInch;
	}
	public void setWeelSizeInch(int weelSizeInch) {
		this.weelSizeInch = weelSizeInch;
	}
	
	
	}
