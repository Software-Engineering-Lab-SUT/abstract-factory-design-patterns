package edu.sharif.ce.design_patterns.factories;

import org.junit.Assert;
import org.junit.Test;

public class AppleFactoryTest {
    @Test
    public void createAppleLaptopTest() {
        var appleFactory = new AppleFactory();
        var laptop = appleFactory.createLaptop();
        Assert.assertTrue(laptop instanceof AppleLaptop);
    }

    @Test
    public void createAppleMobileTest() {
        var appleFactory = new AppleFactory();
        var mobile = appleFactory.createMobile();
        Assert.assertTrue(mobile instanceof AppleMobile);
    }
}
