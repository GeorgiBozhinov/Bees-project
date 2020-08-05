package bees.joro.bees.data.models.base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "project_applications")
public class Project extends BaseEntity {

    private String firstName;
    private String middleName;
    private String lastName;
    private String beeFarmName;
    private String beesNumber;
    private String country;
    private String address;
    private String projType;
    private String addInf;

    public Project() {
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "middle_name")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "farm_name")
    public String getBeeFarmName() {
        return beeFarmName;
    }

    public void setBeeFarmName(String beeFarmName) {
        this.beeFarmName = beeFarmName;
    }

    @Column(name = "bees_number")
    public String getBeesNumber() {
        return beesNumber;
    }

    public void setBeesNumber(String beesNumber) {
        this.beesNumber = beesNumber;
    }

    @Column (name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "proj_type")
    public String getProjType() {
        return projType;
    }

    public void setProjType(String projType) {
        this.projType = projType;
    }

    @Column(name = "addit_inf")
    public String getAddInf() {
        return addInf;
    }

    public void setAddInf(String addInf) {
        this.addInf = addInf;
    }


    //    @Column(name = "first_name", nullable = false)
//    @Size(min = 3, max = 15, message="Невалидно име")
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    // Maybe you should add > OPTIONAL
//    @Column(name = "middle_name", nullable = false)
//    @Size(min = 3, max = 15, message="Невалидно име")
//    public String getMiddleName() {
//        return middleName;
//    }
//
//    public void setMiddleName(String middleName) {
//        this.middleName = middleName;
//    }
//
//    @Column(name = "last_name", nullable = false)
//    @Size(min = 3, max = 15, message="Невалидно име")
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    @Column(name = "farm_name", nullable = false)
//    public String getFarmName() {
//        return farmName;
//    }
//
//    public void setFarmName(String farmName) {
//        this.farmName = farmName;
//    }
//
//    // EDGE CASE: If the identification number of the bee farm is combination of digits has possibility to be bigger
//    // than the integer range.
//    // Probably this field should be changed to STRING or LONG !!!!!!!!!!!!!!
//    @Column(name = "farm_id_number", nullable = false)
//    public int getFarmIdNumber() {
//        return farmIdNumber;
//    }
//
//    public void setFarmIdNumber(int farmIdNumber) {
//        this.farmIdNumber = farmIdNumber;
//    }
//
//    @Column(name = "country", nullable = false)
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    @Column(name = "address", nullable = false)
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    @Column(name = "number_of_hives", nullable = false)
//    public int getNumberOfHives() {
//        return numberOfHives;
//    }
//
//    public void setNumberOfHives(int numberOfHives) {
//        this.numberOfHives = numberOfHives;
//    }
//
//
//    @Column(name = "type_of_project", nullable = false, columnDefinition = "varchar(32) default 'ForHere'")
//    @Enumerated(EnumType.STRING)
//    public ProjectType getTypeOfProject() {
//        return typeOfProject;
//    }
//
//    public void setTypeOfProject(ProjectType typeOfProject) {
//        this.typeOfProject = typeOfProject;
//    }
//
//    // Maybe add max length
//    @Column(name = "additional_info", nullable = false)
//    public String getAdditionalInformation() {
//        return additionalInformation;
//    }
//
//    public void setAdditionalInformation(String additionalInformation) {
//        this.additionalInformation = additionalInformation;
//    }
//
//    // String type must be changed
//    @Column(name = "images", nullable = false)
//    public String getImageMaterials() {
//        return imageMaterials;
//    }
//
//    public void setImageMaterials(String imageMaterials) {
//        this.imageMaterials = imageMaterials;
//    }


}
