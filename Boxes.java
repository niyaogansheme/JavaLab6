public class Boxes {
    private int size;

    public Boxes(int size) {
        if (size > 10) {
            this.size = 10;
        } else if (size < 1) {
            this.size = 1;
        } else {
            this.size = size;
        }
    }

    public void setSize(int size) {
        if (size > 10) {
            this.size = 10;
        } else if (size < 1) {
            this.size = 1;
        } else {
            this.size = size;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return size + " x " + size;
    }

    public void drawBox() {
        String line = "\u2500";

        System.out.print("|");
        for (int i = 0; i < size; i++) {
            System.out.print(line);
        }
        System.out.println("|");

        for (int row = 0; row < size - 2; row++) {
            System.out.print("|");
            for (int i = 0; i < size; i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        System.out.print("|");
        for (int i = 0; i < size; i++) {
            System.out.print(line);
        }
        System.out.println("|");
    }
}