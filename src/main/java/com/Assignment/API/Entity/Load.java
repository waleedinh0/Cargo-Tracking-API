package com.Assignment.API.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


@Entity
public class Load {
    @Id
    private Integer shipperId;
    @NotBlank
    private String loadingPoint;
    @NotBlank
    private String unloadingPoint;
    @NotBlank
    private String productType;
    private String truckType;
    @Min(value = 1, message = "The number of trucks should be at least 1")
    private int noOfTrucks;
    @Min(value = 100, message = "Minimum weight is at least 100")
    private int weight;
    private String optionalComment;
    private String date;

    public Load() {
    }

    public Load(int shipperId, String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks, int weight, String optionalComment, String date) {
        this.shipperId = shipperId;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.optionalComment = optionalComment;
        this.date = date;
    }

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public int getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(int noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOptionalComment() {
        return optionalComment;
    }

    public void setOptionalComment(String optionalComment) {
        this.optionalComment = optionalComment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
