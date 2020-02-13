package com.example.examenpoo;

import org.json.JSONException;

public class DetallePais {
    private String pais, capital,west,east,north, south, tel;
    public DetallePais(String pais, String capital, String west, String east, String north, String south, String tel) throws
            JSONException {
        this.pais = pais;
        this.capital = capital;
        this.west = west;
        this.east = east;
        this.north=north;
        this.south=south;
        this.tel=tel;

    }

    public String getPais() {
        return pais;
    }

    public String getCapital() {
        return capital;
    }

    public String getWest() {
        return west;
    }

    public String getEast() {
        return east;
    }

    public String getNorth() {
        return north;
    }

    public String getSouth() {
        return south;
    }

    public String getTel() {
        return tel;
    }
}
