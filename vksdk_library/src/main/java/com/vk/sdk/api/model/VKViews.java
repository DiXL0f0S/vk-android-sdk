package com.vk.sdk.api.model;

import org.json.JSONException;
import org.json.JSONObject;

class VKViews {
    public int count;

    VKViews(JSONObject from) throws JSONException
    {
        parse(from);
    }

    public VKViews parse(JSONObject source) {
        count = source.optInt("count");
        return this;
    }
}
