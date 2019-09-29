package ru.anvs.designpatterns.creational.abstract_factory;

public final class YDBike extends Bike {
	
	private double costPerMinute = 1.0;

	public YDBike() {
		super.setType("Town Bike");
		super.setWeelSizeInch(28);
	}

	@Override
	public String getInfo() {
		return super.getType() + "; " + super.getWeelSizeInch() + " inches.";
	}

	/**
	 * 5 minutes interval 
	 */
	@Override
	public double calcRentalCost(int totalMinutes) {
		int step = 5;
		return ((totalMinutes - totalMinutes % step) + ((totalMinutes % step > 0) ? step : 0)) * costPerMinute;
	}

}
