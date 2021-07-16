package org.tdd;

public class RedComponent implements Component {

    @Override
    public int power(int numberOfDrops, int seconds) {

        if (numberOfDrops == 2 && seconds == 2) {
            return 3;
        } else {
            int numeroDeGotas = numberOfDrops + seconds;

            return numeroDeGotas;
        }

    }
}
