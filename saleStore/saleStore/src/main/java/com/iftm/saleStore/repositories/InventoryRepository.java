package com.iftm.saleStore.repositories;

import com.iftm.saleStore.entities.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository  extends MongoRepository<Inventory, String> {
}
