public class SnowFlake {
    public static void main(String[] args) {
        Turtle bob = new Turtle();
        bob.penColor("blue");
        bob.width(5);
        bob.speed(2);

        drawFlake(200, 4, bob); // Call the drawFlake method with the desired parameters
    }
    public static void drawFlake(double length, int depth, Turtle bob) {
        if (depth > 0) {
            for (int i = 0; i < 6; i++) {
                bob.forward(length);
                drawFlake((int) (length / 3), depth - 1, bob);
                bob.backward(length);
                bob.left(60);
            }
        }
    }
}