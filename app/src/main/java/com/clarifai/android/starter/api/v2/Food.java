package com.clarifai.android.starter.api.v2;

/**
 * Created by Neroh on 3/12/2018.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Food {

    @SerializedName("ndbno")
    @Expose
    public String ndbno;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("ds")
    @Expose
    public String ds;
    @SerializedName("manu")
    @Expose
    public String manu;
    @SerializedName("ru")
    @Expose
    public String ru;
    @SerializedName("ing")
    @Expose
    public Ing ing;
    @SerializedName("nutrients")
    @Expose
    public List<Nutrient> nutrients = null;

}