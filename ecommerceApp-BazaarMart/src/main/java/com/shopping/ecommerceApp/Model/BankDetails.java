package com.shopping.ecommerceApp.Model;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data //it just a class  not entity
@NoArgsConstructor
@AllArgsConstructor
public class BankDetails {

    private  String accountNumber;
    private String accountHolderName;
    private String BankName;
    private String ifscCode;

}
