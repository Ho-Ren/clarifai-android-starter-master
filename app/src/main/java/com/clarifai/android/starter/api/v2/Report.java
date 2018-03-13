package com.clarifai.android.starter.api.v2;

/**
 * Created by Neroh on 3/12/2018.
 */
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Report {

    @SerializedName("sr")
    @Expose
    public String sr;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("food")
    @Expose
    public Food food;
    @SerializedName("footnotes")
    @Expose
    public List<Object> footnotes = null;

}
