package org.example.Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VendingMachineImpTest {

    final Product CHOCOLATE = new Chocolate(20
            ,"Dark chocolate"
            ,20.5
            ,"Sweet"
            ,"Dark"
    );

    final Product KANELBULLAR = new Kanelbullar(30,
            "Kanelbullar",
            10.5,
            "Sweet",
            "Kanel");

    final Product PLASTIC_CAR = new PlasticCar(41,
            "Car game",
            80,
            "White",
            "Police car");



    private VendingMachine testObject;

    @Before
    public void setUp() {
        this.testObject = new VendingMachineImp(CHOCOLATE,KANELBULLAR,PLASTIC_CAR);
    }

    @Test
    public void test_addCurrency() {

        testObject.addCurrency(200);

        int expected = 200;

        assertEquals(testObject.getBalance(),expected);

    }

    @Test
    public void test_getBalance() {


    }

    @Test
    public void test_request() {

        testObject.addCurrency(200);

        Product product = testObject.request(41);

        Product expected = PLASTIC_CAR;

        assertEquals(product,expected);
    }

    @Test
    public void test_endSession() {

        testObject.addCurrency(100);

        int expected = 100;

        assertEquals(testObject.getBalance(),expected);

        testObject.endSession();

    }

    @Test
    public void test_getDescription() {
    }

    @Test
    public void test_getProducts() {
    }
}