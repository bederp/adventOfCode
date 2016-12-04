package _3;

/**
 * Created by kinder112 on 04.12.2016.
 */
class Triangle {
    private long a;
    private long b;
    private long c;

    Triangle() {
    }

    void setA(long a) {
        this.a = a;
    }

    void setB(long b) {
        this.b = b;
    }

    void setC(long c) {
        this.c = c;
    }

    boolean isValid() {
        return a + b > c && b + c > a && a + c > b;
    }
}
