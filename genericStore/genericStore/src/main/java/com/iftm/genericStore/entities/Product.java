package com.iftm.genericStore.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "product")
public class Product {

    @Id
    private String id;
    private Double price;
    private String name;
}
