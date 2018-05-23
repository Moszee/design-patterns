package org.szpax.designpatterns.level_2.facade;

import org.szpax.designpatterns.level_2.facade.biblioteka.BaskeService;
import org.szpax.designpatterns.level_2.facade.external2.ContainerService;

public class ContainerServiceBasketFacade implements ContainerService {

    private final BaskeService basketService;

    public ContainerServiceBasketFacade(BaskeService basketService) {
        this.basketService = basketService;
    }

    @Override
    public String buyContainer() {
        return basketService.buyEverythingFromBasket();
    }
}
