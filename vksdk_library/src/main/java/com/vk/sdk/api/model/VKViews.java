package com.vk.sdk.api.model;

import org.json.JSONException;
import org.json.JSONObject;

class VKViews {
    int count;

    public VKViews(JSONObject from) throws JSONException
    {
        parse(from);
    }

    public VKViews parse(JSONObject source) {
        count = source.optInt("count");
        return this;
    }
}
