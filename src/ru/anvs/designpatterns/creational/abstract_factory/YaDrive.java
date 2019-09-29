package ru.anvs.designpatterns.creational.abstract_factory;

/**
 * Concrete factory 2
 * @author novoselovas
 *
 */
public class YaDrive implements RentCompany {
	
	private String name;
	
	public YaDrive() {
		this.name = "ЯндексДрайв";
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
			veh = new YDCar();
			break;
		case 2:
			veh = new YDBike();
		default:
			break;
		}
		
		return veh;
	}

}
