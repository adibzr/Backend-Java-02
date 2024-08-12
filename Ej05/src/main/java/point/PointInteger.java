package point;

public class PointInteger implements Point<Integer>{

    private Integer x = 0;
    private Integer y = 0;
    private Integer z = 0;

    @Override
    public Integer getX() {
        return x;
    }

    @Override
    public Integer getY() {
        return y;
    }

    @Override
    public Integer getZ() {
        return z;
    }

    @Override
    public void setX(Integer x) {
        this.x = x;

    }

    @Override
    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public void setZ(Integer z) {
        this.z = z;
    }

    @Override
    public String getCoordinates() {
        return "X:" + x + " Y:" + y + "Z:" + z;
    }
}
