package point;

public class PointDouble implements Point<Double>{
    private Double x = 0.0;
    private Double y = 0.0;
    private Double z = 0.0;


    @Override
    public Double getX() {
        return x;
    }

    @Override
    public Double getY() {
        return y;
    }

    @Override
    public Double getZ() {
        return z;
    }

    @Override
    public void setX(Double x) {
        this.x = x;
    }

    @Override
    public void setY(Double y) {
        this.y = y;
    }

    @Override
    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public String getCoordinates() {
        return "X:" + x + " Y:" + y + "Z:" + z;
    }
}
