package bees.joro.bees.data.models.base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name = "stolen_families")
public class StolenFamily extends BaseEntity {

    private String firstName;
    private String middleName;
    private String lastName;

    // Think about company name
    private String farmName;
    private String identificationNumber;
    private Integer stolenHives;

    private String timeStampOfSteal;
    private String hivesType;
    private String additionalInfo;

    public StolenFamily() {
    }

    @Column(name = "first_name", nullable = false)
    @Size(min = 3, max = 15)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "middle_name", nullable = false)
    @Size(min = 3, max = 15)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Column(name = "last_name", nullable = false)
    @Size(min = 3, max = 15)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "farm_name")
    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    @Column(name = "identification_number")
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    @Column(name = "stolen_hives", nullable = false)
    public Integer getStolenHives() {
        return stolenHives;
    }

    public void setStolenHives(Integer stolenHives) {
        this.stolenHives = stolenHives;
    }

    @Column(name = "time_stamp")
    public String getTimeStampOfSteal() {
        return timeStampOfSteal;
    }

    public void setTimeStampOfSteal(String timeStampOfSteal) {
        this.timeStampOfSteal = timeStampOfSteal;
    }

    @Column(name = "hives_type", nullable = false)
    public String getHivesType() {
        return hivesType;
    }

    public void setHivesType(String hivesType) {
        this.hivesType = hivesType;
    }

    @Column(name = "additional_info")
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
