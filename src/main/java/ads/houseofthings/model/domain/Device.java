package ads.houseofthings.model.domain;

import java.io.Serializable;

public class Device implements Serializable {

    public String name;
    public String type;
    public String status;
    public String mode;
    public Number targetTemperature;

    public Device() {
    }

    public Device(String name, String status, String type, String mode, Number targetTemperature) {
        this.name = name;
        this.status = status;
        this.type = type;
        this.mode = mode;
        this.targetTemperature = targetTemperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Number getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(Number targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}