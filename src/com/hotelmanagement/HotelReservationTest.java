/**
 * 
 */
package com.hotelmanagement;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Dipal
 *
 */
public class HotelReservationTest {
	
@Test
	public void givenHotelDetails_WhenValueEnterAreCorrect_ShouldReturnTrue()
	{
	HotelReservation hotelReservationService = new HotelReservation();
	boolean isValidHotel1 = hotelReservationService.addHotel("Taaj", 5, 500, 100);
	Assert.assertTrue(isValidHotel1);
	boolean isValidHotel2 = hotelReservationService.addHotel("Ganraaj", 3, 200, 90);
	Assert.assertTrue(isValidHotel2);
	boolean isValidHotel3 = hotelReservationService.addHotel("Family", 2, 100, 80);
	Assert.assertTrue(isValidHotel3);
	}
	
	
	
	}
	


