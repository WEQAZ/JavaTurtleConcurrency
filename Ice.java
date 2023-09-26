public class Ice implements Runnable {
    private int positionX, positionY;
    private String penColor;

    public Ice(int positionX, int positionY, String penColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;

    }

    @Override
    public void run() {
        Turtle Ice = new Turtle(this.positionX, this.positionY);
        Ice.penColor(this.penColor);
        Ice.width(5);
        Ice.speed(2);
        Ice.up();
        Ice.setPosition(positionX+-230,positionY -80);
        Ice.down();

        for (int index = 0; index < 6; index++) {
            // make line 50 degree
            Ice.setDirection(50);
            Ice.forward(50);

            // make line 310 degree
            Ice.setDirection(310);
            Ice.forward(50);
        }

        // make apex line
        Ice.setDirection(130);
        Ice.forward(285);
        Ice.setDirection(227);
        Ice.forward(285);

        // set position of the turtle in the middle of umbrella
        Ice.up();
        Ice.setPosition(positionX+-40,positionY+ -80);
        Ice.down();

        // make umbrella hand hold
        Ice.setDirection(270);
        Ice.forward(150);

        Ice.setDirection(315);
        Ice.forward(25);

        Ice.setDirection(45);
        Ice.forward(45);
    }
}
