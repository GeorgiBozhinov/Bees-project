package bees.joro.bees.data.models.base;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "bees_farms")
public class BeeFarm extends BaseEntity {

    private String address;
    // Make in with drop down menu
    private String beeSpecies; // > DONE
    // Classification  beekeeper
    private String beekeeperClassification;
    //    @Column(name = "type", nullable = false, columnDefinition = "varchar(32) default 'ForHere'")
    // @Enumerated(EnumType.STRING)
    private String country; // > DONE
    private String farmIdentificationNumber; // > DONE
    private String farmName; // > DONE
    private String numberOfBeeHives; // > DONE
    private String yearOfCreation; // > DONE

    // The interface allow user to add details about it bee farm to the web site.
    // Some of the fields are about him ( first, middle and last name )
    // This data will be kept in different table for more readability
    private List<Beekeepers> beekeepersList;


    public BeeFarm() {
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "bee_species")
    public String getBeeSpecies() {
        return beeSpecies;
    }

    public void setBeeSpecies(String beeSpecies) {
        this.beeSpecies = beeSpecies;
    }

    @Column(name = "classification_type")
    public String getBeekeeperClassification() {
        return beekeeperClassification;
    }

    public void setBeekeeperClassification(String beekeeperClassification) {
        this.beekeeperClassification = beekeeperClassification;
    }

    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "ident_num")
    public String getFarmIdentificationNumber() {
        return farmIdentificationNumber;
    }

    public void setFarmIdentificationNumber(String farmIdentificationNumber) {
        this.farmIdentificationNumber = farmIdentificationNumber;
    }

    @Column(name = "farm_name")
    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    @Column(name = "num_of_hives")
    public String getNumberOfBeeHives() {
        return numberOfBeeHives;
    }

    public void setNumberOfBeeHives(String numberOfBeeHives) {
        this.numberOfBeeHives = numberOfBeeHives;
    }

    @Column(name = "year_of_creat")
    public String getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(String yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "bee_farm_owners",
            joinColumns = {@JoinColumn(name = "bee_farm_id")},
            inverseJoinColumns = {@JoinColumn(name = "beekeeper_id")}
    )
    public List<Beekeepers> getBeekeepersList() {
        return beekeepersList;
    }

    public void setBeekeepersList(List<Beekeepers> beekeepersList) {
        this.beekeepersList = beekeepersList;
    }

    //    @Column(name = "farm_name", nullable = false)
//    public String getFarmName() {
//        return farmName;
//    }
//
//    public void setFarmName(String farmName) {
//        this.farmName = farmName;
//    }
//
//    @Column(name = "ident_num", nullable = false)
//    public String getFarmIdentificationNumber() {
//        return farmIdentificationNumber;
//    }
//
//    public void setFarmIdentificationNumber(String farmIdentificationNumber) {
//        this.farmIdentificationNumber = farmIdentificationNumber;
//    }
//
//    @Column(name = "num_of_hives", nullable = false)
//    public String getNumberOfBeeHives() {
//        return numberOfBeeHives;
//    }
//
//    public void setNumberOfBeeHives(String numberOfBeeHives) {
//        this.numberOfBeeHives = numberOfBeeHives;
//    }
//
//    @Column(name = "year_of_creat", nullable = false)
//    public String getYearOfCreation() {
//        return yearOfCreation;
//    }
//
//    public void setYearOfCreation(String yearOfCreation) {
//        this.yearOfCreation = yearOfCreation;
//    }
//
//    @Column(name = "bee_species")
//    public BeeFamilies getBeeSpecies() {
//        return beeSpecies;
//    }
//
//    public void setBeeSpecies(BeeFamilies beeSpecies) {
//        this.beeSpecies = beeSpecies;
//    }
//
//    @Column(name = "classification_type")
//    public String getBeekeeperClassification() {
//        return beekeeperClassification;
//    }
//
//    public void setBeekeeperClassification(String beekeeperClassification) {
//        this.beekeeperClassification = beekeeperClassification;
//    }
//
//    @Column(name = "country")
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    @Column(name = "address")
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    @ManyToMany(cascade = {CascadeType.ALL})
//    @JoinTable(
//            name = "bee_farm_owners",
//            joinColumns = {@JoinColumn(name = "bee_farm_id")},
//            inverseJoinColumns = {@JoinColumn(name = "beekeeper_id")}
//    )
//    public List<Beekeepers> getBeekeepersList() {
//        return beekeepersList;
//    }
//
//    public void setBeekeepersList(List<Beekeepers> beekeepersList) {
//        this.beekeepersList = beekeepersList;
//    }
}
