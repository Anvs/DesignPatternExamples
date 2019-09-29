package ru.anvs.designpatterns.creational.abstract_factory;

/**
 * Abstract Factory interface
 * @author novoselovas
 *
 */
public interface RentCompany {
	
	String getName();
	
	VehicleForRent getVehicle(int vehType);

}
