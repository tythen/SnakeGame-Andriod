package com.tythen.tysnake;

public class SnakePoint {
    private int PositionX;
    private int PositionY;

    public SnakePoint(int positionX, int positionY) {
        PositionX = positionX;
        PositionY = positionY;
    }


    public int getPositionX() {
        return PositionX;
    }

    public void setPositionX(int positionX) {
        PositionX = positionX;
    }

    public int getPositionY() {
        return PositionY;
    }

    public void setPositionY(int positionY) {
        PositionY = positionY;
    }
}
