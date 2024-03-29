package com.funshopper.FunshopperDomain.respository;

import com.funshopper.FunshopperDomain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
