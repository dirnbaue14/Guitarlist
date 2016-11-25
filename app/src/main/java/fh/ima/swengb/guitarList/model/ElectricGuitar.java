package fh.ima.swengb.guitarList.model;

import java.io.Serializable;

/**
 * Created by DC on 18.11.16.
 */

public class ElectricGuitar implements Serializable {
    private String manufacturer;
    private String modelName;
    private String color;
    private int numberOfStrings;
    private String pickup;
    private boolean doesItDjent;

    public ElectricGuitar(String manufacturer, String modelName, String color, int numberOfStrings,
                          String pickup, boolean doesItDjent) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.color = color;
        this.numberOfStrings = numberOfStrings;
        this.pickup = pickup;
        this.doesItDjent = doesItDjent;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public void setDoesItDjent(boolean doesItDjent) {
        this.doesItDjent = doesItDjent;
    }

    public String getPickup() {return pickup;}

    public void setPickup(String pickup) {
        this.pickup = pickup; }

    public boolean isDoesItDjent() {return doesItDjent;}

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(manufacturer).append(" ")
                .append(modelName)
                .append('\n')
                .append(color).append('\n')
                .append(pickup);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElectricGuitar that = (ElectricGuitar) o;

        return pickup != null ? pickup.equals(that.pickup) : that.pickup == null;

    }

    @Override
    public int hashCode() {
        return pickup != null ? pickup.hashCode() : 0;
    }
}
