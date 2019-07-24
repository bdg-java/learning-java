package json;

public enum Country {


    AM("Armenia", "051"),
    RU("Russian Federation", "643");


    private String countryName;
    private String numericCode;

    Country(String countryName, String numericCode) {
        this.countryName = countryName;
        this.numericCode = numericCode;
    }

    public String toString() {
        return this.countryName + ", " + this.numericCode;
    }

}
