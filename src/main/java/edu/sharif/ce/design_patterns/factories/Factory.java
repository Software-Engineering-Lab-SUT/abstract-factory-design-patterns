package edu.sharif.ce.design_patterns.factories;

import edu.sharif.ce.design_patterns.Laptops.Laptop;
import edu.sharif.ce.design_patterns.Mobiles.Mobile;

public interface Factory {
    Laptop createLaptop();
    Mobile createMobile();
}
