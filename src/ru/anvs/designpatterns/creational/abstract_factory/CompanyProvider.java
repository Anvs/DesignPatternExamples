package ru.anvs.designpatterns.creational.abstract_factory;

public class CompanyProvider {

	RentCompany getCompany(int companyChoise) {
		RentCompany company = null;
		
		switch(companyChoise) {
		case 2:
			company = new DeliModil();
			break;
		case 1:
			company = new YaDrive();
			break;
		default:
			break;
		}
		return company;
	}
}
