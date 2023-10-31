package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//JpaRepository é um conjunto de varios metodos ja prontas como save, get e etc. O primeiro valor que passamos é a classe
//que vai representar a entidade e o segundo é o tipo do identificador no caso UUID

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
