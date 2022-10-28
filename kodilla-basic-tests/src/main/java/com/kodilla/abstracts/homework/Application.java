package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        kwadrat kwadrat = new kwadrat();
        kwadrat.umiemLiczyc();
        kwadrat.circuit(2,2);

        prostokat prostokat = new prostokat();
        prostokat.umiemLiczyc();
        prostokat.circuit(2,4);

        Prostokat2 prostokat2 = new Prostokat2();
        prostokat2.umiemLiczyc();
        prostokat2.circuit(2,10);

    }
}
