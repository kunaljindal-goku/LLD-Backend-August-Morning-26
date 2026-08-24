package model;

public class Symbol {

    char img;
    String name;

    public Symbol(char img, String name) {
        this.img = img;
        this.name = name;
    }

    public char getImg() {
        return img;
    }

    public void setImg(char img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
