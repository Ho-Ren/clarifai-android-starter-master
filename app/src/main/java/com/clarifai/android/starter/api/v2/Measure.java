package com.clarifai.android.starter.api.v2;

/**
 * Created by Neroh on 3/12/2018.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Measure {

    @SerializedName("label")
    @Expose
    public String label;
    @SerializedName("eqv")
    @Expose
    public Double eqv;
    @SerializedName("eunit")
    @Expose
    public String eunit;
    @SerializedName("qty")
    @Expose
    public Double qty;
    @SerializedName("value")
    @Expose
    public String value;

}
