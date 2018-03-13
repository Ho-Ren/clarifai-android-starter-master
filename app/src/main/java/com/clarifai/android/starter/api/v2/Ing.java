package com.clarifai.android.starter.api.v2;

/**
 * Created by Neroh on 3/12/2018.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ing {

    @SerializedName("desc")
    @Expose
    public String desc;
    @SerializedName("upd")
    @Expose
    public String upd;

}
