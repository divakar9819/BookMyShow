package utilities;

public class Address {

    private String city;
    private String location;
    private String pinCode;

    public Address(String city, String location, String pinCode) {
        this.city = city;
        this.location = location;
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", location='" + location + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
