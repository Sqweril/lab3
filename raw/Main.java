package raw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // пример работы с динамическим массивом
        Solder[] solderArray = new Solder[2];
        for (int i = 0; i < 2; i++) {
            solderArray[i] = new Solder();
            solderArray[i].input();
            solderArray[i].print();
        }
        solderArray[0].setStatus(2);
        solderArray[0].print();
        for (int i = 0; i < 2; i++) {
            solderArray[i] = null;
        }

        // пример работы с массивом динамических
        Voen[] voenArray = new Voen[2];
        voenArray[0] = new Voen();
        voenArray[0].Input();
        voenArray[0].Print();
        voenArray[0].Setotsroch(25);
        voenArray[0].Print();
        voenArray[1] = new Voen();
        voenArray[1].Print();
        voenArray[0].Input();
        for (int i = 0; i < 2; i++) {
            voenArray[i] = null;
        }
    }
}
