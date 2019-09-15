package io.github.heisid.solarsystemcheatsheet;

public class SolarSystemObject {
    private String name;
    private String shortDetail;
    private int pic;
    private double[] data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDetail() {
        return shortDetail;
    }

    public void setShortDetail(String shortDetail) {
        this.shortDetail = shortDetail;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public double[] getData() { return data; }

    public void setData(double[] data) { this.data = data; }
}
