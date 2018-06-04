//
//  Copyright (c) 2014 VK.com
//
//  Permission is hereby granted, free of charge, to any person obtaining a copy of
//  this software and associated documentation files (the "Software"), to deal in
//  the Software without restriction, including without limitation the rights to
//  use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
//  the Software, and to permit persons to whom the Software is furnished to do so,
//  subject to the following conditions:
//
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
//  FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
//  COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
//  IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
//  CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
//

package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static com.vk.sdk.api.model.ParseUtils.parseBoolean;
import static com.vk.sdk.api.model.ParseUtils.parseInt;
import static com.vk.sdk.api.model.VKAttachments.*;

/**
 * Describes a photo object from VK.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class VKApiPhoto extends VKAttachments.VKApiAttachment implements Parcelable, Identifiable {

    /**
     * Photo ID, positive number
     */
    public int id;

    /**
     * Photo album ID.
     */
    public int album_id;

    /**
     * ID of the user or community that owns the photo.
     */
    public int owner_id;

    /**
     * ID of the user who uploaded the photo (if the photo is uploaded in community). 100 for photos uploaded by the community
     */
    public int user_id;

    /**
     * Text describing the photo.
     */
    public String text;

    /**
     * Date (in Unix time) the photo was added.
     */
    public long date;

    /**
     * Width (in pixels) of the original photo.
     */
    public int width;

    /**
     * Height (in pixels) of the original photo.
     */
    public int height;

    /**
     * All photo thumbs in photo sizes.
     */
    public VKPhotoSizes sizes = new VKPhotoSizes();

    /**
     * Information whether the current user liked the photo.
     */
    public boolean user_likes;

    /**
     * Whether the current user can comment on the photo
     */
    public boolean can_comment;

    /**
     * Number of likes on the photo.
     */
    public int likes;

    /**
     * Number of comments on the photo.
     */
    public int comments;

    /**
     * Number of tags on the photo.
     */
    public int tags;

    /**
     * An access key using for get information about hidden objects.
     */
    public String access_key;

	public VKApiPhoto(JSONObject from) throws JSONException
	{
		parse(from);
	}
    /**
     * Fills a Photo instance from JSONObject.
     */
    public VKApiPhoto parse(JSONObject from) {
        id = from.optInt("id");
        album_id = from.optInt("album_id");
        owner_id = from.optInt("owner_id");
        user_id = from.optInt("user_id");
        text = from.optString("text");
        date = from.optLong("date");
        access_key = from.optString("access_key");

        height = from.optInt("height");
        width = from.optInt("width");

        JSONObject likes = from.optJSONObject("likes");
        this.likes = ParseUtils.parseInt(likes, "count");
        this.user_likes = ParseUtils.parseBoolean(likes, "user_likes");
        comments = parseInt(from.optJSONObject("comments"), "count");
        tags = parseInt(from.optJSONObject("tags"), "count");
        can_comment = parseBoolean(from, "can_comment");

        sizes.setOriginalDimension(width, height);
        JSONArray photo_sizes = from.optJSONArray("sizes");
        if(photo_sizes != null) {
            sizes.fill(photo_sizes);
        }
        return this;
    }

    /**
     * Creates a Photo instance from Parcel.
     */
    public VKApiPhoto(Parcel in) {
        this.id = in.readInt();
        this.album_id = in.readInt();
        this.owner_id = in.readInt();
        this.user_id = in.readInt();
        this.text = in.readString();
        this.date = in.readLong();
        this.sizes = in.readParcelable(VKPhotoSizes.class.getClassLoader());
        this.width = in.readInt();
        this.height = in.readInt();
        this.user_likes = in.readByte() != 0;
        this.can_comment = in.readByte() != 0;
        this.likes = in.readInt();
        this.comments = in.readInt();
        this.tags = in.readInt();
        this.access_key = in.readString();
    }

    /**
     * Init photo object with attachment string like photo45898586_334180483
     * @param photoAttachmentString string of format photo[OWNER_ID]_[PHOTO_ID]
     */
    public VKApiPhoto(String photoAttachmentString) {
        if (photoAttachmentString.startsWith(TYPE_PHOTO)) {
            photoAttachmentString = photoAttachmentString.substring(TYPE_PHOTO.length());
            String[] ids  = photoAttachmentString.split("_");
            this.owner_id = Integer.parseInt(ids[0]);
            this.id       = Integer.parseInt(ids[1]);
        }
    }

    /**
     * Creates empty Photo instance.
     */
    public VKApiPhoto() {

    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public CharSequence toAttachmentString() {
        StringBuilder result = new StringBuilder(TYPE_PHOTO).append(owner_id).append('_').append(id);
        if(!TextUtils.isEmpty(access_key)) {
            result.append('_');
            result.append(access_key);
        }
        return result;
    }

    @Override
    public String getType() {
        return TYPE_PHOTO;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeInt(this.album_id);
        dest.writeInt(this.owner_id);
        dest.writeInt(this.user_id);
        dest.writeString(this.text);
        dest.writeLong(this.date);
        dest.writeParcelable(this.sizes, flags);
        dest.writeInt(this.width);
        dest.writeInt(this.height);
        dest.writeByte(user_likes ? (byte) 1 : (byte) 0);
        dest.writeByte(can_comment ? (byte) 1 : (byte) 0);
        dest.writeInt(this.likes);
        dest.writeInt(this.comments);
        dest.writeInt(this.tags);
        dest.writeString(this.access_key);
    }

    public static Creator<VKApiPhoto> CREATOR = new Creator<VKApiPhoto>() {
        public VKApiPhoto createFromParcel(Parcel source) {
            return new VKApiPhoto(source);
        }

        public VKApiPhoto[] newArray(int size) {
            return new VKApiPhoto[size];
        }
    };

    @Override
    public String toString() {
        return "VKApiPhoto{" +
                "id=" + id +
                ", album_id=" + album_id +
                ", owner_id=" + owner_id +
                ", user_id=" + user_id +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", width=" + width +
                ", height=" + height +
                ", sizes=" + sizes +
                ", user_likes=" + user_likes +
                ", can_comment=" + can_comment +
                ", likes=" + likes +
                ", comments=" + comments +
                ", tags=" + tags +
                ", access_key='" + access_key + '\'' +
                '}';
    }
}
