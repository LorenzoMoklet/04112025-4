import java.util.Scanner;
public class VolumeTabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari alas tabung: ");
        double radius = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double height = input.nextDouble();

        double volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.printf("Volume tabung dengan jari-jari %.2f dan tinggi %.2f adalah %.2f%n", radius, height, volume);

        input.close();
    }
    
}
