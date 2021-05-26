package web.model;

public class Car {
    private String carModel;
    private Integer series;
    private String bodyType;

    public Car(String carModel, Integer series, String bodyType) {
        this.carModel = carModel;
        this.series = series;
        this.bodyType = bodyType;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
}
