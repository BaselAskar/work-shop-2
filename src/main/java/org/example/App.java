package org.example;

import org.example.Model.*;

import java.util.Arrays;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Product chocolate = new Chocolate(20
                ,"Dark chocolate"
                ,20.5
                ,"Sweet"
                ,"Dark"
        );

        Product kanelbullar = new Kanelbullar(30,
                "Kanelbullar",
                10.5,
                "Sweet",
                "Kanel");

        Product plasticCar = new PlasticCar(41,
                "Car game",
                80,
                "White",
                "Police car");


        VendingMachine vendingMachine = new VendingMachineImp(chocolate,kanelbullar,plasticCar);

        String[] ProductsDescription = vendingMachine.getProducts();

        System.out.println(Arrays.toString(ProductsDescription));
    }
}
