package org.example;

/**
 * объект <code> класса Point5</code> представляет собой точку и
 * хранит значения координат X и Y в приватных полях.
 * @author Alexandr Kurtyakov
 * @version 1.1
 */
public class Point6 {
    private double X;
    private double Y;
    public Point6(){
        this.X = 0.0;
        this.Y = 0.0;
    }
    public Point6(double X, double Y){
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    /**
     * Смещает точку по обоим осям, обращаясь к полям объекта
     * @param X смещение по координате X
     * @param Y смещение по координате Y
     */
    public void translate(double X, double Y){
        this.X += X;
        this.Y += Y;
    }

    /**
     * Изменяет масштаб на координатной плоскости, обращаясь к полям объекта
     * @param mod множитель на который будет умножена каждая координата
     */
    public void scale(double mod){
       this.X *= mod;
       this.Y *= mod;
    }

    @Override
    public String toString() {
        return "Point{" + "X=" + X + ", Y=" + Y + '}';
    }

}
