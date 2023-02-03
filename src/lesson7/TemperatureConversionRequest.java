import java.math.BigDecimal;

public class TemperatureConversionRequest {
    private BigDecimal temperature;
    private String unitFrom;
    private String unitTo;

    public TemperatureConversionRequest(BigDecimal temperature, String unitFrom, String unitTo) {
        this.temperature = temperature;
        this.unitFrom = unitFrom;
        this.unitTo = unitTo;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public String getUnitFrom() {
        return unitFrom;
    }

    public void setUnitFrom(String unitFrom) {
        this.unitFrom = unitFrom;
    }

    public String getUnitTo() {
        return unitTo;
    }

    public void setUnitTo(String unitTo) {
        this.unitTo = unitTo;
    }

    
    @Override
    public String toString() {
        return "TemperatureConversionRequest [temperature=" + temperature + ", unitFrom=" + unitFrom + ", unitTo="
                + unitTo + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((temperature == null) ? 0 : temperature.hashCode());
        result = prime * result + ((unitFrom == null) ? 0 : unitFrom.hashCode());
        result = prime * result + ((unitTo == null) ? 0 : unitTo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TemperatureConversionRequest other = (TemperatureConversionRequest) obj;
        if (temperature == null) {
            if (other.temperature != null)
                return false;
        } else if (!temperature.equals(other.temperature))
            return false;
        if (unitFrom == null) {
            if (other.unitFrom != null)
                return false;
        } else if (!unitFrom.equals(other.unitFrom))
            return false;
        if (unitTo == null) {
            if (other.unitTo != null)
                return false;
        } else if (!unitTo.equals(other.unitTo))
            return false;
        return true;
    }
    
}
