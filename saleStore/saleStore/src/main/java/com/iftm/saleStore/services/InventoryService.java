package com.iftm.saleStore.services;

import com.iftm.saleStore.entities.Inventory;
import com.iftm.saleStore.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory create(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }
}
