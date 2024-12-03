package allclasses.urzhumova;

import allclasses.irinabig.Animal;
import allclasses.irinabig.Predator;

import java.util.List;

public class Whale extends Animal implements Predator {
    public List<String> eatMeat() throws Exception {
        return List.of("Планктон","Креветки");
    }
    public String getSound() {
        return "*жесткие звуки ультразвука*";
    }
}
