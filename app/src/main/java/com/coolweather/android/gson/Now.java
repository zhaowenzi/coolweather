package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 子文 on 2017/5/16.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More {
        @SerializedName("txt")
        public String info;
    }
}
