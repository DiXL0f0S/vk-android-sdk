package com.vk.sdk.api.model;

import android.os.Parcel;

import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings({"unused", "WeakerAccess"})
public class VKReposts implements android.os.Parcelable {
    public int count;
    public boolean user_reposted;

    VKReposts(JSONObject from) throws JSONException
    {
        parse(from);
    }

    protected VKReposts(Parcel in) {
        count = in.readInt();
        user_reposted = in.readByte() != 0;
    }

    public static final Creator<VKReposts> CREATOR = new Creator<VKReposts>() {
        @Override
        public VKReposts createFromParcel(Parcel in) {
            return new VKReposts(in);
        }

        @Override
        public VKReposts[] newArray(int size) {
            return new VKReposts[size];
        }
    };

    VKReposts parse(JSONObject source) {
        count = source.optInt("count");
        user_reposted = ParseUtils.parseBoolean(source, "user_reposted");
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(count);
        dest.writeByte((byte) (user_reposted ? 1 : 0));
    }

    @Override
    public String toString() {
        return "VKReposts{" +
                "count=" + count +
                ", user_reposted=" + user_reposted +
                '}';
    }
}
