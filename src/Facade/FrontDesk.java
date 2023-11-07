package Facade;

import Interface.HotelService;


public class FrontDesk
{
    private HotelService cart;
    private HotelService houseKeeping;
    private HotelService valet;

    public FrontDesk(HotelService cart, HotelService houseKeeping, HotelService valet)
    {
        this.cart = cart;
        this.houseKeeping = houseKeeping;
        this.valet = valet;
    }

    public String cartService()
    {
        return cart.requestCart();
    }

    public String houseService()
    {
        return houseKeeping.cleanRoom();
    }
    public String valetService()
    {
        return valet.pickUpVehicle();
    }

}
