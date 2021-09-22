/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsandconstructs;
import algorithmsandconstructs.enums.Make;
import algorithmsandconstructs.enums.Month;
import java.util.Map;

/**
 *
 * @author damianjanta
 */
public class Car implements CarInterface {
   
	@Override
	public Map<Month, boolean[]> createAvailability() {
		// creates a map to check avalability of car in the month
		return null;
	}

	@Override
	public Make getMake() {
		// getting the model of the car available for rent 
		return null;
	}

	@Override
	public void setMake(Make make) {
		// setting the model of the car available for rent 
		
	}

	@Override
	public double getRate() {
		// it gets the rate for the cost of renting a cars 
		return 0;
	}

	@Override
	public void setRate(double rate) {
		// it sets the rate for the cost of renting a car  
		
	}

	@Override
	public Map<Month, boolean[]> getAvailability() {
		// gets  the tottal avalability of car in the month
		return null;
	}

	@Override
	public void setAvailability(Map<Month, boolean[]> availability) {
		// sets the total availability 
		
	}

	@Override
	public int getId() {
		// get the name of the model of the car 
		return 0;
	}

	@Override
	public boolean isAvailable(Month month, int day) {
		// check if a car model is available at the selected date in the month 
		return false;
	}

	@Override
	public boolean book(Month month, int day) {
		// books the car if its available 
		return false;
	}
	
	
	
}

