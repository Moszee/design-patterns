package org.szpax.designpatterns.level_2.facade;

import org.szpax.designpatterns.level_2.facade.biblioteka.BaskeService;
import org.szpax.designpatterns.level_2.facade.external2.ShopService;

public class Example {

    public static void main(String[] args) {
        //Korzystasz z 2 bibliotek: example i example2. NIe mozesz ich modyfikowac, sa nie twoje.
        //Najbardziej interesuje Cie interface ShopService. Zeby go utworzyc potrzebujesz miec jakis obiekt typu ContainerService.


        // Musisz go napisac od 0, tam jest baaardzo skomplikowana logika!

        // Ale... wiesz... ze Twoj kolega Mateusz napisal juz klase ktora w sumie realizuje ta logike. Nazywa sie BasketService. Tyle, ze nie mozesz tam nic zmienic!

        //Jest problem. BasketService nie implementuje ContainerService... i jak tu tego uzyc? :(
        //Mianowicie - robimy fasade! zobacz klase ContainerServiceBasketFacade :)
        //i uzywamy jak ponizej :)

        ContainerServiceBasketFacade facade = new ContainerServiceBasketFacade(new BaskeService());
        ShopService shopService = new ShopService(facade);
        shopService.doTheShopping();
    }

}
