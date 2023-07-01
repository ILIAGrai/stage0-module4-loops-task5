package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        for (int x = 1; x <= sideLength; x++) {
            if (x == 1 || x == sideLength) {
                for (int y = 0; y < sideLength; y++) {
                    System.out.print(8);
                }

            } else {
                System.out.print(8);
                for (int y = 0; y < sideLength - 2; y++) {
                    System.out.print(" ");
                }
                System.out.print(8);


            }
            System.out.print("\n");
        }
    }
}
