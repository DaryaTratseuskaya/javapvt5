package by.itacademy.task.Task1;

/**
 * Created by daryatratseuskaya on 12/26/17
 */
public class Currency {

    private int code;
    private int id;
    private String name;
    private double rate;
    private boolean visible;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        if (code != currency.code) return false;
        if (id != currency.id) return false;
        if (Double.compare(currency.rate, rate) != 0) return false;
        if (visible != currency.visible) return false;
        return name != null ? name.equals(currency.name) : currency.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = code;
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (visible ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "code=" + code +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", visible=" + visible +
                '}';
    }
}
