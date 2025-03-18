import java.util.Scanner;

class TriangleAreaCalculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float base = in.nextFloat();
        float height = in.nextFloat();
        float areain = 0.5f * base * height;
        float areacm = areain * 2.54f * 2.54f;

        System.out.printf("Area of Triangle in sq inches is %.2f and in sq cm is %.2f%n", areain, areacm);
    }
}
