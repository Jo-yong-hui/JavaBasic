package YH.basic.day08.hr;

public class Locations {
    private String location_id;
    private String street_address;
    private int postal_code;
    private String city;
    private String state_provice;
    private String country_id;


    public Locations(String location_id, String street_address,
                     int postal_code, String city, String state_provice, String country_id) {
        this.location_id = location_id;
        this.street_address = street_address;
        this.postal_code = postal_code;
        this.city = city;
        this.state_provice = state_provice;
        this.country_id = country_id;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState_provice() {
        return state_provice;
    }

    public void setState_provice(String state_provice) {
        this.state_provice = state_provice;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }
}
