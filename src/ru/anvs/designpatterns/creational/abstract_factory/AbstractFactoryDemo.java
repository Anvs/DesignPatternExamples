package ru.anvs.designpatterns.creational.abstract_factory;

import java.util.Scanner;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		/*
		 * Клиент создает через интерфейс фабрики конкретный екземпляр той или иной фабрики 
		 * и получает продукт с универсальным интерфейсом, но специфическими для конкретной фабрики свойствами
		 * 
		 * Задание.
		 * Создать несколько классов компаний по аренде транспорта
		 * каждая компания сдает в аренду автомобили, велосипеды и скуперы
		 * у каждой компании свои марки тр.ср-в и свои условия аренды
		 * 
		 * */
		
		Scanner input  = new Scanner(System.in);
		
		int userChoiseOfVehicle = 0;
		System.out.println("Please, choose the vehilce you want to rent:");
		System.out.println("1: Car");
		System.out.println("2: Bike");
		System.out.println("3. Scooter");

		userChoiseOfVehicle = input.nextInt();
		
		int userChoiseOfCompany = 0;
		
		System.out.println("What company do you prefer:");
		System.out.println("1. Yandex Drive");
		System.out.println("2. Delimodile");
		
		userChoiseOfCompany = input.nextInt();
		
		RentCompany company = new CompanyProvider().getCompany(userChoiseOfCompany);
		
		int userChoiseOfRentalTime = 0;
		System.out.print("Please, enter rental time in minutes: ");
		userChoiseOfRentalTime = input.nextInt();
		input.close();
		
		VehicleForRent veh = company.getVehicle(userChoiseOfVehicle);
		
		System.out.println("Ваш выбор: " );
		System.out.println("Компания: " + company.getName());
		System.out.println(veh.getInfo());
		System.out.println("на " + userChoiseOfRentalTime + " минут");
		System.out.println("за " + veh.calcRentalCost(userChoiseOfRentalTime));
		
	}

}
