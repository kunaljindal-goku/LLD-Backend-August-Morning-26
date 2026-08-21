package model;

public class Symbol {

    char X;
    String name;

    public Symbol(char x, String name) {
        X = x;
        this.name = name;
    }

    public char getX() {
        return X;
    }

    public void setX(char x) {
        X = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
