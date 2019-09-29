package ru.anvs.designpatterns.creational.abstract_factory;
/**
 * Product interface
 * @author novoselovas
 *
 */
interface VehicleForRent {
	/**
	 * Returns information about vehicle: model, transmission etc.
	 * @return String
	 */
	String getInfo();
	
	/**
	 * @param totalMinutes
	 * @return double
	 */
	double calcRentalCost(int totalMinutes);
	
}