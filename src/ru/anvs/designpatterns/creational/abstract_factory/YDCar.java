package ru.anvs.designpatterns.creational.abstract_factory;

public final class YDCar extends Car {
	
	private double costPerMinute = 4.0;
	
	public YDCar() {
		super.setModel("KIA RIO");
		super.setTranmissionType(Car.Transmission.AUTO);
	}

	@Override
	public String getInfo() {
		return super.getModel() + "; transmission: " + super.getTranmissionType();
	}

	/**
	 * in Yandex Drive just calculate total price.
	 */
	@Override
	public double calcRentalCost(int totalMinutes) {
		double retVal = 0.0;
		retVal = totalMinutes*costPerMinute;
		return retVal;
	}

}
