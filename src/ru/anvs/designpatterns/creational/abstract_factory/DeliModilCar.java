package ru.anvs.designpatterns.creational.abstract_factory;

public final class DeliModilCar extends Car {
	
	private double costPerMinute = 7.0;
	
	public DeliModilCar() {
		super.setModel("Hyundai Solaris");
		super.setTranmissionType(Car.Transmission.MANUAL);
	}

	@Override
	public String getInfo() {
		return super.getModel() + "; transmission: " + super.getTranmissionType();
	}
	
	/**
	 * DeliMobil gives 5 free minutes to rent.
	 */
	@Override
	public double calcRentalCost(int totalMinutes) {
		int freeMinutes = 5;
		double retVal = 0.0;
		if (totalMinutes > freeMinutes) {
			retVal = (totalMinutes - freeMinutes)*costPerMinute;
		}
		return retVal;
	}

}
