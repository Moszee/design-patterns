package org.szpax.designpatterns.level_2.facade.external2;

public class ShopService {
    //zeby utworzyc ShopService potrzebujesz jakiejs klasy implementujacej ContainerService
    private final ContainerService containerService;

    public ShopService(ContainerService containerService) {
        this.containerService = containerService;
    }

    public void doTheShopping(){
        System.out.println(containerService.buyContainer());
    }
}
