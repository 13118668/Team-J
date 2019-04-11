public class Rectangle extends Shape {
    public Rectangle(int SIZEX, int SIZEY) {
        super(SIZEX, SIZEY);
        fill();
    }

    @Override
    public void fill() {


        for (int xPixel = 0; xPixel < SIZEX; xPixel++) {

            for (int yPixel = 0; yPixel < SIZEY; yPixel++) {

                    fillPixel(xPixel, yPixel);
            }
        }
    }
}

