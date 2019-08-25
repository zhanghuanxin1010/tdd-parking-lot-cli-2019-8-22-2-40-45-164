package com.oocl.cultivation;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private final int capacity;
    private Map<ParkingTicket, Car> cars = new HashMap<>();

    public ParkingLot() {
        this(10);
    }

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

   /* public int getAvailableParkingPosition() {
        return getCars().size() - capacity;
    }*/

	public Map<ParkingTicket, Car> getCars(ParkingTicket ticket ) {
		return cars;
	}

	public void setCars(Map<ParkingTicket, Car> cars) {
		this.cars = cars;
	}

	
}
