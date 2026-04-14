package com.shopping.ecommerceApp.Repository;

import com.shopping.ecommerceApp.Model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    Seller findByEmail(String email);

}
