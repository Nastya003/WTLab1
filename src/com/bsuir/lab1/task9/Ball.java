package com.bsuir.lab1.task9;

public record Ball (double weight, Colors color) {

        public double getWeight() {
            return weight;
        }

        public Colors getColor() {
            return color;
        }

}
