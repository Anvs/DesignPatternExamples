package ru.anvs.designpatterns.creational.abstract_factory;

public final class DeliMobilScooter extends Scooter {
	
	private double costPerMinute = 2;

	public DeliMobilScooter() {
		super.setDriveType(Scooter.DrivePower.ELECTRIC);
	}

	@Override
	public String getInfo() {
		return "Scooter with " + super.getDriveType() + " drive";
		
	}

	@Override
	public double calcRentalCost(int totalMinutes) {
		return totalMinutes*costPerMinute;
	}

}
