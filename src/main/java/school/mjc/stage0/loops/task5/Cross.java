package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int prob = 0;
        prob = (sideLength - 1) / 2;

        for (int y = 0; y < sideLength; y++) {
            if (y - (prob-1)  == 1) {
                for (int x = 0; x < sideLength; x++) {
                    System.out.print(8);
                }


            } else {
                for (int x = 0; x < prob; x++) {
                    System.out.print(" ");
                }
                System.out.print(8);
                for (int x = 0; x < prob; x++) {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
    }
}


