package point;

public interface Point <T>{

    T getX();
    T getY();
    T getZ();
    void setX(T x);
    void setY(T y);
    void setZ(T z);

    String getCoordinates();
}
