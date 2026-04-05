package com.shopping.ecommerceApp.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //it just a class  not entity
@NoArgsConstructor
@AllArgsConstructor
public class BankDetails {

    private  String accountNumber;
    private String accountHolderName;
    private String BankName;
    private String ifscCode;

}
