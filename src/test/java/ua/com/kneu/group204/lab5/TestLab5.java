package ua.com.kneu.group204.lab5;

import org.junit.Test;
import ua.com.kneu.group204.lab5.config.Factory;

import static org.junit.Assert.assertEquals;

public class TestLab5 {

    private Factory factory = Factory.getINSTANCE();

    @Test
    public void Test(){
        int a = 3;
        int b = 4;

        int sum = a + b;

        assertEquals(sum,7);
    }
}
