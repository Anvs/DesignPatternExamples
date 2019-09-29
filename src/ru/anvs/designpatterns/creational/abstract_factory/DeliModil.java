package ru.anvs.designpatterns.creational.abstract_factory;

/**
 * Concrete factory 1
 * @author novoselovas
 *
 */
public class DeliModil implements RentCompany {
	private String name;
	
	public DeliModil() {
		this.name = "ДелиМобиль";
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public VehicleForRent getVehicle(int vehType) {
		VehicleForRent veh = null;
		
		switch (vehType) {
		case 1: //Car
			veh = new DeliModilCar();
			break;
		case 2:
			veh = new DeliMobilBike();
		case 3:
			veh = new DeliMobilScooter();
		default:
			break;
		}
		
		return veh;
	}
}
