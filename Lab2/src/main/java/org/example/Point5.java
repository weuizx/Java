package org.example;

/**
 * объект <code> класса Point5</code> представляет собой точку и
 * хранит значения координат X и Y в приватных полях.
 * @author Alexandr Kurtyakov
 * @version 1.1
 */
public class Point5 {
    private final double X;
    private final double Y;
    public Point5(){
        this.X = 0.0;
        this.Y = 0.0;
    }
    public Point5(double X, double Y){
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
     * Смещает точку по обоим осям
     * @param X смещение по координате X
     * @param Y смещение по координате Y
     * @return новая точка с реализованным смещением
     */
    public Point5 translate(double X, double Y){
        return new Point5(getX() + X, getY() + Y);
    }

    /**
     * Изменяет масштам на координатной плоскости
     * @param mod множитель на который будет умножена каждая координата
     * @return новая точка после масштабирования
     */
    public Point5 scale(double mod){
        return new Point5(getX() * mod, getY() * mod);
    }

    @Override
    public String toString() {
        return "Point{" + "X=" + X + ", Y=" + Y + '}';
    }

}
