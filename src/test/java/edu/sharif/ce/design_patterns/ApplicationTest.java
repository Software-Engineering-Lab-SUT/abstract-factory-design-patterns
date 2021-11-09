package edu.sharif.ce.design_patterns;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {
    @Test
    public void getAppleLaptopOsTest() {
        var appleFactory = new AppleFactory();
        var laptop = appleFactory.createLaptop();
        Assert.assertEquals("macOS", laptop.getOs());
    }

    @Test
    public void getAppleMobileOsTest() {
        var appleFactory = new AppleFactory();
        var mobile = appleFactory.createMobile();
        Assert.assertEquals("iOS", mobile.getOs());
    }

    @Test
    public void getLenovoLaptopOsTest() {
        var appleFactory = new LenovoFactory();
        var laptop = appleFactory.createLaptop();
        Assert.assertEquals("Windows", laptop.getOs());
    }

    @Test
    public void getLenovoMobileOsTest() {
        var appleFactory = new LenovoFactory();
        var mobile = appleFactory.createMobile();
        Assert.assertEquals("Android", mobile.getOs());
    }
}
