package YH.basic.day08.hr;

public class Regions {
        private String region_id;
        private String region_name;

    public Regions(String region_id, String region_name) {
        this.region_id = region_id;
        this.region_name = region_name;
    }

    public String getRegion_id() {
        return region_id;
    }

    public void setRegion_id(String region_id) {
        this.region_id = region_id;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }
}
