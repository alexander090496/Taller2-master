package com.codigoestudiante.taller2.Parser;


import com.codigoestudiante.taller2.Models.CountryDetail;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 28/09/2017.
 */

public class JsonCountryDetail {


    public static List<CountryDetail> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<CountryDetail> countryDetailList = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);
            JSONArray item2= item.getJSONArray("languages");
            JSONObject item3 =item2.getJSONObject(0);

            CountryDetail countryDetail = new CountryDetail();
            countryDetail.setSubregion(item.getString("subregion"));
            countryDetail.setLanguages(item3.getString("nativeName"));
            countryDetail.setArea(item.getInt("area"));
            countryDetailList.add(countryDetail);
        }
        return countryDetailList;
    }

}
