package com.example;

import java.util.List;

public class Alex extends Lion {



    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }


    public int getKittens() {
        return super.feline.getKittens();

    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }


    public String getPlaceOfLiving() {
        return "Нью-Йоркский Зоопарк";
    }
}