package ru.anvs.designpatterns.creational.abstract_factory;
/**
 * Abstract class for Car product
 * @author novoselovas
 *
 */
public abstract class Car implements VehicleForRent {
	enum Transmission {
		AUTO,
		MANUAL
	}
	private String model;
	private Transmission  tranmissionType;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Transmission getTranmissionType() {
		return tranmissionType;
	}
	public void setTranmissionType(Transmission tranmissionType) {
		this.tranmissionType = tranmissionType;
	}
		
	}

