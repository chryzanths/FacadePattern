package Subsystem;

import Interface.HotelService;

public class HouseKeeping implements HotelService {
    @Override
    public String pickUpVehicle() {

        return null;
    }

    @Override
    public String cleanRoom() {
        return "A room cleaning service was requested";
    }

    @Override
    public String requestCart() {

        return null;
    }
}
