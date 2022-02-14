package curso.softcaribbean.model;

import javax.persistence.*;

@Entity
@Table(name = "regions")
public class Regions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long region_id;
    private String region_name;

    public Long getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Long region_id) {
        this.region_id = region_id;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }
}
