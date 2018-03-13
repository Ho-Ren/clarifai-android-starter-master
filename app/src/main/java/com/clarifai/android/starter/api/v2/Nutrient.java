package com.clarifai.android.starter.api.v2;

/**
 * Created by Neroh on 3/12/2018.
 */
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Nutrient {

    @SerializedName("nutrient_id")
    @Expose
    public String nutrientId;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("derivation")
    @Expose
    public String derivation;
    @SerializedName("group")
    @Expose
    public String group;
    @SerializedName("unit")
    @Expose
    public String unit;
    @SerializedName("value")
    @Expose
    public String value;
    @SerializedName("measures")
    @Expose
    public List<Measure> measures = null;

}