package com.vk.sdk.api.model;

import android.os.Parcel;

import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings({"unused", "WeakerAccess"})
public class VKViews implements android.os.Parcelable {
    public int count;

    VKViews(JSONObject from) throws JSONException
    {
        parse(from);
    }

    protected VKViews(Parcel in) {
        count = in.readInt();
    }

    public static final Creator<VKViews> CREATOR = new Creator<VKViews>() {
        @Override
        public VKViews createFromParcel(Parcel in) {
            return new VKViews(in);
        }

        @Override
        public VKViews[] newArray(int size) {
            return new VKViews[size];
        }
    };

    VKViews parse(JSONObject source) {
        count = source.optInt("count");
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(count);
    }

    @Override
    public String toString() {
        return "VKViews{" +
                "count=" + count +
                '}';
    }
}
