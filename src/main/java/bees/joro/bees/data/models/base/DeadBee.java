package bees.joro.bees.data.models.base;

import bees.joro.bees.data.models.base.enum_entities.BeeFamilies;

import javax.persistence.*;

@Entity
@Table(name = "bee_deads")
public class DeadBee extends BaseEntity {

    private String farmName; // > DONE
    private BeeFamilies beeSpecies; // > DONE

    // Year od dead
    private String year; // > DONE

    // GPS coordinates preferable
    private String location; // > DONE
    private String beekeeperType; // > DONE

    // Reason for the dead
    private String reasonForDead;
    private Integer numberOfDeadFamilies; // > DONE
    private String laboratoryName;
    private String additionalInfo;


    public DeadBee() {
    }

    @Column(name = "farm_name")
    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    @Column(name = "bee_species")
    public BeeFamilies getBeeSpecies() {
        return beeSpecies;
    }

    public void setBeeSpecies(BeeFamilies beeSpecies) {
        this.beeSpecies = beeSpecies;
    }

    @Column(name = "datetime_of_dead")
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Column(name = "farm_location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Provided by laboratory
    @Column(name = "reason_for_dead")
    public String getReasonForDead() {
        return reasonForDead;
    }

    public void setReasonForDead(String reasonForDead) {
        this.reasonForDead = reasonForDead;
    }

    @Column(name = "number_of_dead_families")
    public Integer getNumberOfDeadFamilies() {
        return numberOfDeadFamilies;
    }

    public void setNumberOfDeadFamilies(Integer numberOfDeadFamilies) {
        this.numberOfDeadFamilies = numberOfDeadFamilies;
    }

    @Column(name = "laboratory")
    public String getLaboratoryName() {
        return laboratoryName;
    }

    public void setLaboratoryName(String laboratoryName) {
        this.laboratoryName = laboratoryName;
    }

    @Column(name = "additional_info")
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @Column(name = "beekeper_type")
    public String getBeekeeperType() {
        return beekeeperType;
    }

    public void setBeekeeperType(String beekeeperType) {
        this.beekeeperType = beekeeperType;
    }


}
