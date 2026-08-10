import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mode = sc.next();

        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Delhi","Mumbai",mode);
    }
}
