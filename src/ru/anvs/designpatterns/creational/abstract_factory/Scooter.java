package ru.anvs.designpatterns.creational.abstract_factory;
/**
 * Abstract class for Scooter product
 * @author novoselovas
 *
 */
public abstract class Scooter implements VehicleForRent {
	enum DrivePower {
		ELECTRIC,
		FOOT
	}
	
	private DrivePower driveType;

	public DrivePower getDriveType() {
		return driveType;
	}

	public void setDriveType(DrivePower driveType) {
		this.driveType = driveType;
	}
		
}

