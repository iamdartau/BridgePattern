package com.company.bridgeTest.shapes;

import com.company.bridgeTest.draw.DrawAPI;

public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
