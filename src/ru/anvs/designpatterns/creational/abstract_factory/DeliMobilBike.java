package ru.anvs.designpatterns.creational.abstract_factory;

public final class DeliMobilBike extends Bike {

	private double costPerMinute = 0.50;
	
	public DeliMobilBike() {
		super.setType("MTB");
		super.setWeelSizeInch(26);
	}

	@Override
	public String getInfo() {
		return super.getType() + ", " + super.getWeelSizeInch() + " inches.";
	}

	/**
	 * DeliMobil has 30 minutes step for rental period.
	 */
	@Override
	public double calcRentalCost(int totalMinutes) {
		int step = 30;
		return ((totalMinutes - totalMinutes % step) + ((totalMinutes % step > 0) ? step : 0)) * costPerMinute;
	}

}
