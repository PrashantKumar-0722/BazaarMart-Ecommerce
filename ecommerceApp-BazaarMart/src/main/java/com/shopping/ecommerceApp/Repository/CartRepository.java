package com.shopping.ecommerceApp.Repository;

import com.shopping.ecommerceApp.Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

// assign one cart to the newly created user
public interface CartRepository extends JpaRepository<Cart, Long> {
}
