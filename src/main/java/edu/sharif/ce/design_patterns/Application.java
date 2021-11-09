package edu.sharif.ce.design_patterns;

import edu.sharif.ce.design_patterns.Laptops.Laptop;
import edu.sharif.ce.design_patterns.Mobiles.Mobile;
import edu.sharif.ce.design_patterns.factories.Factory;

public class Application {
    private final Laptop laptop;
    private final Mobile mobile;

    public Application(Factory factory) {
        laptop = factory.createLaptop();
        mobile = factory.createMobile();
    }

    public String getLaptopOs() {
        return laptop.getOs();
    }

    public String getMobileOs() {
        return mobile.getOs();
    }
}
