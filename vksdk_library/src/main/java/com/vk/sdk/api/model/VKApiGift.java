package com.vk.sdk.api.model;

import android.os.Parcel;

import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings({"unused", "WeakerAccess"})
public class VKApiGift extends VKAttachments.VKApiAttachment implements Identifiable, android.os.Parcelable {

    public int id;

    public String thumb_48;
    public String thumb_96;
    public String thumb_256;

    public VKApiGift(JSONObject from) throws JSONException
    {
        parse(from);
    }
    /**
     * Fills a Gift instance from JSONObject.
     */
    public VKApiGift parse(JSONObject source) throws JSONException {
        id = source.optInt("id");

        thumb_48 = source.optString("thumb_48");
        thumb_96 = source.optString("thumb_96");
        thumb_256 = source.optString("thumb_256");
        return this;
    }

    /**
     * Creates a Gift instance from Parcel.
     */
    public VKApiGift(Parcel in) {
        this.id = in.readInt();

        this.thumb_48 = in.readString();
        this.thumb_96 = in.readString();
        this.thumb_256 = in.readString();
    }

    /**
     * Creates empty Gift instance.
     */
    public VKApiGift() {

    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public CharSequence toAttachmentString() {
        return new StringBuilder(VKAttachments.TYPE_GIFT).append('_').append(id);
    }

    @Override
    public String getType() {
        return VKAttachments.TYPE_GIFT;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);

        dest.writeString(this.thumb_48);
        dest.writeString(this.thumb_96);
        dest.writeString(this.thumb_256);
    }

    public static Creator<VKApiGift> CREATOR = new Creator<VKApiGift>() {
        public VKApiGift createFromParcel(Parcel source) {
            return new VKApiGift(source);
        }

        public VKApiGift[] newArray(int size) {
            return new VKApiGift[size];
        }
    };

    @Override
    public String toString() {
        return "VKApiGift{" +
                "id=" + id +
                ", thumb_48='" + thumb_48 + '\'' +
                ", thumb_96='" + thumb_96 + '\'' +
                ", thumb_256='" + thumb_256 + '\'' +
                '}';
    }
}