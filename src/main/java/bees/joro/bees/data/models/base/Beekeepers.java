package bees.joro.bees.data.models.base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "beekeepers")
public class Beekeepers extends BaseEntity {

    // Short description > GBozhinov > 18/02/2020
    // This Entity is used to store names of the people who register their bee farms.

    private String firstName;
    private String middleName;
    private String lastName;

    private List<BeeFarm> beeFarmList;

    public Beekeepers() {
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "middle_name", nullable = false)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @ManyToMany(mappedBy = "beekeepersList")
    public List<BeeFarm> getBeeFarmList() {
        return beeFarmList;
    }

    public void setBeeFarmList(List<BeeFarm> beeFarmList) {
        this.beeFarmList = beeFarmList;
    }
}
