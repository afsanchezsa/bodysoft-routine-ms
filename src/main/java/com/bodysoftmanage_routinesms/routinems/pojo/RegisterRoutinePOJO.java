package com.bodysoftmanage_routinesms.routinems.pojo;

public class RegisterRoutinePOJO {
    private Integer idOwner;
    private Float price;
    private String name;
    private String description;
    private String link_preview;
    private Integer idType;

    public Integer getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(Integer idOwner) {
        this.idOwner = idOwner;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink_preview() {
        return link_preview;
    }

    public void setLink_preview(String link_preview) {
        this.link_preview = link_preview;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }
}
