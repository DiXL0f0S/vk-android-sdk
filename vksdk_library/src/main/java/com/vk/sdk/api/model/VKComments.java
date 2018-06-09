package com.vk.sdk.api.model;

import android.os.Parcel;

import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings({"unused", "WeakerAccess"})
public class VKComments implements android.os.Parcelable {
    public int count;
    public boolean can_post;
    public boolean groups_can_post;

    VKComments(JSONObject from) throws JSONException
    {
        parse(from);
    }

    protected VKComments(Parcel in) {
        count = in.readInt();
        can_post = in.readByte() != 0;
        groups_can_post = in.readByte() != 0;
    }

    public static final Creator<VKComments> CREATOR = new Creator<VKComments>() {
        @Override
        public VKComments createFromParcel(Parcel in) {
            return new VKComments(in);
        }

        @Override
        public VKComments[] newArray(int size) {
            return new VKComments[size];
        }
    };

    VKComments parse(JSONObject source) {
        count = source.optInt("count");
        can_post = ParseUtils.parseBoolean(source, "can_post");
        groups_can_post = ParseUtils.parseBoolean(source, "groups_can_post");
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(count);
        dest.writeByte((byte) (can_post ? 1 : 0));
        dest.writeByte((byte) (groups_can_post ? 1 : 0));
    }

    @Override
    public String toString() {
        return "VKComments{" +
                "count=" + count +
                ", can_post=" + can_post +
                ", groups_can_post=" + groups_can_post +
                '}';
    }
}
