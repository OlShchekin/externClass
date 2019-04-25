package lab1.dataSource;

import lab1.entities.Element;
import lab1.entities.FlavorsBouquet;
import lab1.entities.AttributesBouquet;

public class FlavourStore {
    public static Element[]getElements(){
        return new Element[] {new FlavorsBouquet("Rose", 2, 70, 45),
                new FlavorsBouquet("Orchid", 50, 40, 100),
                new FlavorsBouquet("Tulip", 1, 15, 30),
                new AttributesBouquet("ribbon", 100, 70, 5)
        };
    }
}
