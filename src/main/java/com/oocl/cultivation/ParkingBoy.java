package com.oocl.cultivation;

import java.util.HashMap;
import java.util.Map;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        ParkingTicket Ticket=new ParkingTicket();
        Map<ParkingTicket, Car>car_Ticket  = new HashMap<>();
        car_Ticket.put(Ticket,car);
        parkingLot.setCars(car_Ticket);
        return Ticket;
      //  throw new RuntimeException("Not implemented");
    }

    public Car fetch(ParkingTicket ticket) {
    	
    	
    	return (Car) parkingLot.getCars(ticket);
    	
    	
        // TODO: Please implement the method
        //throw new RuntimeException("Not implemented");
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
