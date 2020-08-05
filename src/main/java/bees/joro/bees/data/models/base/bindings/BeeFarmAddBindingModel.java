package bees.joro.bees.data.models.base.bindings;

public class BeeFarmAddBindingModel {

    // - 07/06/2020 You should email field in the html form

    private String address;
    private String beeSpecies;
    private String beekeeperClassification;
    private String country;
    private String farmIdentificationNumber;
    private String farmName;
    private String numberOfBeeHives;
    private String yearOfCreation;

    public BeeFarmAddBindingModel() {
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

    //    //@Length(max = 5, message = "Името е повече от 10 символа.")
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    //@Length(max = 10, message = "ID номера е по повече от 10 символа.")
//    public String getIdNum() {
//        return idNum;
//    }
//
//    public void setIdNum(String idNum) {
//        this.idNum = idNum;
//    }
//
//    //@Length(min = 0, message = "0 не е валидно стойност. Трябва да е поне 1.")
//    public String getBeesNum() {
//        return beesNum;
//    }
//
//    public void setBeesNum(String beesNum) {
//        this.beesNum = beesNum;
//    }
//
//    //@Length(min = 4, max = 4, message = "Стойността не е валидна.")
//    public String getYear() {
//        return year;
//    }
//
//    public void setYear(String year) {
//        this.year = year;
//    }
//
//    public String getBeeSpec() {
//        return beeSpec;
//    }
//
//    public void setBeeSpec(String beeSpec) {
//        this.beeSpec = beeSpec;
//    }
//
//    public String getBeekeeperKind() {
//        return beekeeperKind;
//    }
//
//    public void setBeekeeperKind(String beekeeperKind) {
//        this.beekeeperKind = beekeeperKind;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    //@Pattern(regexp = "^(-?\\d+(\\.\\d+)?),\\s*(-?\\d+(\\.\\d+)?)$",
//    //message = "GPS кординатите не са валидни. Пример: XX.XXXXXX, XX.XXXXX")
//    // ^[-+]?([1-8]?\d(\.\d+)?|90(\.0+)?),\s*[-+]?(180(\.0+)?|((1[0-7]\d)|([1-9]?\d))(\.\d+)?)$
//    public String getLoc() {
//        return loc;
//    }
//
//    public void setLoc(String loc) {
//        this.loc = loc;
//    }
}
