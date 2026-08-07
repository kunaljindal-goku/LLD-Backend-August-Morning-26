package flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

    public static void main(String[] args) {
        BulletType bulletType = new BulletType("Black","High Kill",2,100);

        List<Bullet> bullets = new ArrayList<>();
        for(int i=0;i<100;i++) {
            Bullet b = new Bullet(bulletType, 2,3);
            bullets.add(b);
        }

        System.out.println("DEBUG");
    }
}
