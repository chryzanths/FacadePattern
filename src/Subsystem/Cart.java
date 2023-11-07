package Subsystem;

import Interface.HotelService;

public class Cart implements HotelService {
    @Override
    public String pickUpVehicle() {

        return null;
    }

    @Override
    public String cleanRoom() {

        return null;
    }

    @Override
    public String requestCart() {
        return "A cart for your luggage was requested";
    }
}
