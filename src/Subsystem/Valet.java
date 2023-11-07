package Subsystem;

import Interface.HotelService;

public class Valet implements HotelService
{
    @Override
    public String pickUpVehicle() {
        return "A valet is requested to assist you upon your arrival";
    }

    @Override
    public String cleanRoom() {

        return null;
    }

    @Override
    public String requestCart() {

        return null;
    }
}
