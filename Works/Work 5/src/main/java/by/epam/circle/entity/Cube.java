package by.epam.circle.entity;

import java.util.Objects;

public class Cube {
    private int x;
    private int y;
    private int z;
    private Point a;

    private class Point{
        private int xt;
        private int yt;
        private int zt;

        public Point(int xt, int yt, int zt) {
            this.xt = xt;
            this.yt = yt;
            this.zt = zt;
        }

        public int getXt() {
            return xt;
        }

        public void setXt(int xt) {
            this.xt = xt;
        }

        public int getYt() {
            return yt;
        }

        public void setYt(int yt) {
            this.yt = yt;
        }

        public int getZt() {
            return zt;
        }

        public void setZt(int zt) {
            this.zt = zt;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return xt == point.xt &&
                    yt == point.yt &&
                    zt == point.zt;
        }

        @Override
        public int hashCode() {
            return Objects.hash(xt, yt, zt);
        }
    }

    public Cube(int x, int y, int z, int xt, int yt, int zt) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = new Point(xt, yt, zt);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return x == cube.x &&
                y == cube.y &&
                z == cube.z &&
                a.equals(cube.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, a);
    }
}
