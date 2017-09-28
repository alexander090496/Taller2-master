package com.codigoestudiante.taller2.Models;

/**
 * Created by alex on 28/09/2017.
 */

public class CountryDetail
{
    private  String subregion;
    private String languages;
    private  Integer area;

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
