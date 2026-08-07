package flyweight;

public class Bullet {

    // intrinsic
    BulletType bulletType;

    // extrinsinc
    int x;
    int y;

    public Bullet(BulletType bulletType, int x, int y) {
        this.bulletType = bulletType;
        this.x = x;
        this.y = y;
    }
}
