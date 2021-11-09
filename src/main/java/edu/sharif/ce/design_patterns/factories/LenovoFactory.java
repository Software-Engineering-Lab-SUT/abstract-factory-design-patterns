package edu.sharif.ce.design_patterns.factories;

import edu.sharif.ce.design_patterns.Laptops.Laptop;
import edu.sharif.ce.design_patterns.Laptops.LenovoLaptop;
import edu.sharif.ce.design_patterns.Mobiles.LenovoMobile;
import edu.sharif.ce.design_patterns.Mobiles.Mobile;

public class LenovoFactory implements Factory {
    @Override
    public Laptop createLaptop() {
        return new LenovoLaptop();
    }

    @Override
    public Mobile createMobile() {
        return new LenovoMobile();
    }
}
