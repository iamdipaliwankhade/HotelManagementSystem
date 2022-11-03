package com.hotelmanagement;

import java.util.HashMap;

public class HotelReservation {
	
	HashMap<String,Hotel>hotellist = new HashMap<String,Hotel>();
	Hotel hotels;
	
	public boolean addHotel(String hotelName,int rating,double weekdayRateReguler,double weekendRateReguler)
	{
		hotels  = new Hotel();
		hotels.setHotelName(hotelName);
		hotels.setRating(rating);
		hotels.setWeekdayRegularCustomerCost(weekendRateReguler);
		hotels.setWeekendRegularCustomerCost(weekendRateReguler);
		
		hotellist.put(hotelName, hotels);
		return true;
		
		
	}

}
