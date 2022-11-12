package org.example;

import lombok.Getter;
import lombok.Setter;


@Setter
public class Flower {
    private FlowerColor color;
    @Getter
    private int sepalLength;

    @Getter
    private int price;

    public Flower(String color, int sepalLength, int price) {
        this.color = FlowerColor.valueOf(color);
        this.sepalLength = sepalLength;
        this.price = price;
    }

    public String getColor() {
        return color.toString();
    }
}