package com.example;

import java.util.List;

public class Cat {

    FelineInterface felineInterface;

    public Cat(FelineInterface felineInterface) {
        this.felineInterface = felineInterface;
    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return felineInterface.eatMeat();
    }
}
