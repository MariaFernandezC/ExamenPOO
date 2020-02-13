package com.example.examenpoo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Paises {
    private String name, alpha2_code,alpha3_code, url;

    public Paises(JSONObject a) throws JSONException {
        this.name = a.getString("name").toString();
        this.alpha2_code = a.getString("alpha2_code").toString();
        this.alpha3_code = a.getString("alpha3_code").toString();
        this.url = "http://www.geognos.com/api/en/countries/flag/"+a.getString("alpha2_code").toString()+".png";
    }
    public static ArrayList<Paises> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Paises> obj = new ArrayList<>();
        for (int i = 0; i < datos.length(); i++) {
            obj.add(new Paises(datos.getJSONObject(i)));
        }
        return obj;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getAlpha2_code() {
        return alpha2_code;
    }

    public String getAlpha3_code() {
        return alpha3_code;
    }
}
