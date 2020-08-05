package bees.joro.bees.web.view.models;

public class BeeFarmModel {

    private String address;
    private String beeSpecies;
    private String beekeeperClassification;
    private String country;
    private String farmIdentificationNumber;
    private String farmName;
    private String numberOfBeeHives;
    private String yearOfCreation;


    public BeeFarmModel() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBeeSpecies() {
        return beeSpecies;
    }

    public void setBeeSpecies(String beeSpecies) {
        this.beeSpecies = beeSpecies;
    }

    public String getBeekeeperClassification() {
        return beekeeperClassification;
    }

    public void setBeekeeperClassification(String beekeeperClassification) {
        this.beekeeperClassification = beekeeperClassification;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFarmIdentificationNumber() {
        return farmIdentificationNumber;
    }

    public void setFarmIdentificationNumber(String farmIdentificationNumber) {
        this.farmIdentificationNumber = farmIdentificationNumber;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getNumberOfBeeHives() {
        return numberOfBeeHives;
    }

    public void setNumberOfBeeHives(String numberOfBeeHives) {
        this.numberOfBeeHives = numberOfBeeHives;
    }

    public String getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(String yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }
}
