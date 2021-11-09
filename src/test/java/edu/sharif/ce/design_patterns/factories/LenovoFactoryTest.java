package edu.sharif.ce.design_patterns.factories;

import edu.sharif.ce.design_patterns.Laptops.LenovoLaptop;
import edu.sharif.ce.design_patterns.Mobiles.LenovoMobile;
import org.junit.Assert;
import org.junit.Test;

public class LenovoFactoryTest {
    @Test
    public void createLenovoLaptopTest() {
        var lenovoFactory = new LenovoFactory();
        var laptop = lenovoFactory.createLaptop();
        Assert.assertTrue(laptop instanceof LenovoLaptop);
    }

    @Test
    public void createLenovoMobileTest() {
        var lenovoFactory = new LenovoFactory();
        var mobile = lenovoFactory.createMobile();
        Assert.assertTrue(mobile instanceof LenovoMobile);
    }
}
