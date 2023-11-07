package Client;

import Facade.FrontDesk;
import Interface.HotelService;
import Subsystem.Cart;
import Subsystem.HouseKeeping;
import Subsystem.Valet;

import java.util.Scanner;

public class HotelApp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        HotelService cart = new Cart();
        HotelService houseKeeping = new HouseKeeping();
        HotelService valet = new Valet();

        FrontDesk service = new FrontDesk(cart, houseKeeping, valet);

        System.out.println("[1] Luggage Cart Service\n[2] Room Cleaning Service\n[3] Valet Service");
        System.out.println("Which one do you want to request?");
        String input = in.nextLine();

        if(input.equals("1"))
        {
            System.out.println(service.cartService());
        }
        else if(input.equals("2"))
        {
            System.out.println(service.houseService());
        }
        else if(input.equals("3"))
        {
            System.out.println(service.valetService());
        }

    }
}
