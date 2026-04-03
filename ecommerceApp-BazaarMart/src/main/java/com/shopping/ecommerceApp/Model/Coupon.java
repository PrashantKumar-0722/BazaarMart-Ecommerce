package com.shopping.ecommerceApp.Model;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;

    private double discountPercentage;

    private LocalDate validityStartDAte;

    private LocalDate validityEndDAte;

    private double minimumOrderValue;

    private boolean isActive = true; //controlled by admin

    @ManyToMany(mappedBy = "usedCoupons") // not create extra table
    private Set<User> usedByUsers= new HashSet<>();
}
