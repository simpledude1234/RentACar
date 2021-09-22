/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsandconstructs;

import java.util.List;

import algorithmsandconstructs.enums.Make;
import algorithmsandconstructs.enums.Month;

/**
 *
 * @author johnj
 */    
    
public class RentACar implements RentACarInterface {

	@Override
	public List<CarInterface> getCars() {
        return null;
        // Method to get the total available number of cars and models 
	}

	@Override
	public void setCars(List<CarInterface> cars) {
        // Method to set the total available number of cars and models
		
	}

	@Override
	public String getName() {
	return null;
        // Method to get the name of model of car
	}

	@Override
	public void setName(String name) {
        // Method to set the name of model of car
		
	}

	@Override
	public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
         return false;
         // Method to check the availability of cars and model and date
	}

	@Override
	public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
	// Method to get the availability of cars and model and date
		return 0;
	}

	@Override
	public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
	// Method to book the of cars and model and date and duration of rent
		return false;
	}

	@Override
	public int getNumberOfCars() {
	// Method to get the total availability of cars 
        return 0;
	}

}

    

