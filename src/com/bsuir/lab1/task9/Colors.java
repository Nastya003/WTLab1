package com.bsuir.lab1.task9;

import java.util.Random;

public enum Colors {
    RED, BLUE, BLACK, WHITE, GREEN;
    public static Colors getRandomColor(){
        Random random = new Random();

        return values()[random.nextInt(values().length)];
    }
}

