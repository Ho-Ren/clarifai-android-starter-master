package com.clarifai.android.starter.api.v2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FoodSearch {

    @SerializedName("list")
    @Expose
    private List list;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

}