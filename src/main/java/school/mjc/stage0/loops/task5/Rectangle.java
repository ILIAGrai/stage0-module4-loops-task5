package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int x = 1; x <= height; x++) {
            if (x == 1 || x == height) {
                for (int y = 0; y < length; y++) {
                    System.out.print(8);
                }

            } else {
                System.out.print(8);
                for (int y = 0; y < length - 2; y++) {
                    System.out.print(" ");
                }
                System.out.print(8);


            }
            System.out.print("\n");
        }

    }
}
