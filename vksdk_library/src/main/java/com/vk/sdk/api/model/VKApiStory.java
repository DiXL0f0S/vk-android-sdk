package com.vk.sdk.api.model;

import android.os.Parcel;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * A story object describes a story.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class VKApiStory implements Identifiable, android.os.Parcelable {

    /**
     * Story ID, positive number
     */
    public int id;

    /**
     * Story owner ID
     */
    public int owner_id;

    /**
     * Date (in Unix time) the story was created
     */
    public long date;

    /**
     * If user can see the story
     */
    public boolean can_see;

    /**
     * Date (in Unix time) when the story was created.
     */
    public String type;

    /**
     * Story photo, if type is "photo"
     */
    public VKApiPhoto photo;

    /**
     * Story video, if type is "video"
     */
    public VKApiVideo video;

    public VKApiStory(JSONObject from) throws JSONException
    {
        parse(from);
    }
    /**
     * Fills a Story instance from JSONObject.
     */
    public VKApiStory parse(JSONObject source) throws JSONException {
        id = source.optInt("id");
        owner_id = source.optInt("owner_id");
        date = source.optLong("date");
        can_see = ParseUtils.parseBoolean(source, "can_see");
        type = source.optString("type");
        if (type.equals("photo"))
            photo = new VKApiPhoto(source.optJSONObject("photo"));
        else if (type.equals("video"))
            video = new VKApiVideo(source.optJSONObject("video"));
        return this;
    }

    /**
     * Creates a Story instance from Parcel.
     */
    public VKApiStory(Parcel in) {
        this.id = in.readInt();
        this.owner_id = in.readInt();
        this.date = in.readLong();
        this.can_see  = in.readByte() != 0;
        this.type = in.readString();
        this.photo = in.readParcelable(VKApiPhoto.class.getClassLoader());
        this.video = in.readParcelable(VKApiVideo.class.getClassLoader());
    }

    /**
     * Creates empty Story instance.
     */
    public VKApiStory() {

    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeInt(this.owner_id);
        dest.writeLong(this.date);
        dest.writeByte(can_see ? (byte) 1 : (byte) 0);
        dest.writeString(this.type);
        dest.writeParcelable(this.photo, flags);
        dest.writeParcelable(this.video, flags);
    }

    public static Creator<VKApiStory> CREATOR = new Creator<VKApiStory>() {
        public VKApiStory createFromParcel(Parcel source) {
            return new VKApiStory(source);
        }

        public VKApiStory[] newArray(int size) {
            return new VKApiStory[size];
        }
    };

    @Override
    public String toString() {
        return "VKApiStory{" +
                "id=" + id +
                ", owner_id=" + owner_id +
                ", date=" + date +
                ", can_see=" + can_see +
                ", type='" + type + '\'' +
                '}';
    }
}
