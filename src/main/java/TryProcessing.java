import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 700;
    public static final int HEIGHT = 700;
    public static final int yPosition1 = HEIGHT / 5;
    public static final int yPosition2 = (HEIGHT * 2) / 5;
    public static final int yPosition3 = (HEIGHT * 3) / 5;
    public static final int yPosition4 = (HEIGHT * 4) / 5;
    public static final int whiteBackground = 255;
    public static final int ballSpeed1 = 1;
    public static final int ballSpeed2 = 2;
    public static final int ballSpeed3 = 3;
    public static final int ballSpeed4 = 4;
    public static final int majorAxis = 17;
    public static final int minorAxis = 15;
    private int xPosition1;
    private int xPosition2;
    private int xPosition3;
    private int xPosition4;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        background(whiteBackground);
    }

    @Override
    public void draw() {
        ellipse1();
        ellipse2();
        ellipse3();
        ellipse4();
    }

    private void ellipse4() {
        ellipse(xPosition4, yPosition4, majorAxis, minorAxis);
        xPosition4 += ballSpeed4;
    }

    private void ellipse3() {
        ellipse(xPosition3, yPosition3, majorAxis, minorAxis);
        xPosition3 += ballSpeed3;
    }

    private void ellipse2() {
        ellipse(xPosition2, yPosition2, majorAxis, minorAxis);
        xPosition2 += ballSpeed2;
    }

    private void ellipse1() {
        ellipse(xPosition1, yPosition1, majorAxis, minorAxis);
        xPosition1 += ballSpeed1;
    }
}
