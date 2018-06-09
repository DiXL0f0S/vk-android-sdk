package com.vk.sdk.api.model;

import android.os.Parcel;

import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings({"unused", "WeakerAccess"})
public class VKLikes implements android.os.Parcelable {
    public int count;
    public boolean user_likes;
    public boolean can_like;
    public boolean can_publish;

    VKLikes(JSONObject from) throws JSONException
    {
        parse(from);
    }

    protected VKLikes(Parcel in) {
        count = in.readInt();
        user_likes = in.readByte() != 0;
        can_like = in.readByte() != 0;
        can_publish = in.readByte() != 0;
    }

    public static final Creator<VKLikes> CREATOR = new Creator<VKLikes>() {
        @Override
        public VKLikes createFromParcel(Parcel in) {
            return new VKLikes(in);
        }

        @Override
        public VKLikes[] newArray(int size) {
            return new VKLikes[size];
        }
    };

    VKLikes parse(JSONObject source) {
        count = source.optInt("count");
        user_likes = ParseUtils.parseBoolean(source, "user_likes");
        can_like = ParseUtils.parseBoolean(source, "can_like");
        can_publish = ParseUtils.parseBoolean(source, "can_publish");
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(count);
        dest.writeByte((byte) (user_likes ? 1 : 0));
        dest.writeByte((byte) (can_like ? 1 : 0));
        dest.writeByte((byte) (can_publish ? 1 : 0));
    }

    @Override
    public String toString() {
        return "VKLikes{" +
                "count=" + count +
                ", user_likes=" + user_likes +
                ", can_like=" + can_like +
                ", can_publish=" + can_publish +
                '}';
    }
}
