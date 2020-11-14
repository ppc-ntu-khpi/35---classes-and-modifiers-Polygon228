/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import test.domain.Customer;

/**
 *
 * @author xunder
 */
public class Test
{
    public static void main(String[] args)
    {
        Customer cus =new Customer();
        cus.displayCustomerInfo();
        cus.getId();
        cus.getTotal();
        cus.setId(123);
        cus.setIsNew(false);
        cus.setTotal(1200.6f);
        cus.displayCustomerInfo();
    }
    
}
