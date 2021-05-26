package com.company;

public abstract class Shape {
    protected int x,y;

    protected Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract void draw();
    public abstract void erase();
    public void moveTo(int x,int y){
        erase();
        this.x=x;
        this.y=y;
        draw();
    }
}
