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

/**
 * Post.java
 * vk-android-sdk
 *
 * Created by Babichev Vitaly on 19.01.14.
 * Copyright (c) 2014 VK. All rights reserved.
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * A post object describes a wall post.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class VKApiPost extends VKAttachments.VKApiAttachment implements Identifiable, android.os.Parcelable {

    /**
     * Post ID on the wall, positive number
     */
    public int id;

    /**
     * Wall owner ID.
     */
    public int owner_id;

    /**
     * ID of the author.
     */
    public int from_id;

    /**
     * ID of the administrator who posted the post (for communities only, returns for the requests with administrator's access token).
     */
    public int created_by;

    /**
     * Date (in Unix time) the post was added.
     */
    public long date;

    /**
     * Text of the post.
     */
    public String text;

    /**
     * ID of the wall owner the post to which the reply is addressed (if the post is a reply to another wall post).
     */
    public int reply_owner_id;

    /**
     * ID of the wall post to which the reply is addressed (if the post is a reply to another wall post).
     */
    public int reply_post_id;

    /**
     * True, if the post was created with "Friends only" option.
     */
    public boolean friends_only;

    /**
     * Post comments info. Object with fields:
     * count (integer) — comments count;
     * can_post* (integer, [0,1]) — shows if current user can comment the post. ("1 — yes, 0'' — no);
     * groups_can_post (integer, [0,1]) — information whether communities can comment this post.
     */
    public VKComments comments;

    /**
     * Post views info. Object with fields:
     * count (integer) — views count;
     */
    public VKViews views;

    /**
     * Post likes info. Object with fields:
     * count (integer) — likes count;
     * user_likes* (integer, [0,1]) — Whether the user liked the post (0 — not liked, 1 — liked).
     * can_like* (integer, [0,1]) — Whether the user can like the post (0 — cannot, 1 — can).
     * can_publish* (integer, [0,1]) — Whether the user can repost (0 — cannot, 1 — can).
     */
    public VKLikes likes;

    /**
     * Information about reposts (Share with friends); an object containing:
     * count (integer) — Number of users who copied the post.
     * user_reposted* (integer, [0,1]) — Whether the user reposted the post (0 — not reposted, 1 — reposted).
     */
    public VKReposts reposts;

    /**
     * Type of the post, can be: post, copy, reply, postpone, suggest.
     */
    public String post_type;

    /**
     * Information about attachments to the post (photos, links, etc.), if any;
     */
    public VKAttachments attachments = new VKAttachments();

    /**
     * Information about location.
     */
    public VKApiPlace geo;

    /**
     * ID of the author (if the post was published by a community and signed by a user).
     */
    public int signer_id;

    /**
     * List of history of the reposts.
     */
    public VKList<VKApiPost> copy_history;

    /**
     * Access key for private object.
     */
    public String access_key;

	public VKApiPost(JSONObject from) throws JSONException
	{
		parse(from);
	}
    /**
     * Fills a Post instance from JSONObject.
     */
    public VKApiPost parse(JSONObject source) throws JSONException {
        if (source.has("id"))
            id = source.optInt("id");
        else
            id = source.optInt("post_id");
        if (source.has("owner_id"))
            owner_id = source.optInt("owner_id");
        else if (source.has("from_id"))
            owner_id = source.optInt("from_id");
        else if (source.has("source_id"))
            owner_id = source.optInt("source_id");
        from_id = source.optInt("from_id");
        created_by = source.optInt("created_by");
        date = source.optLong("date");
        text = source.optString("text");
        reply_owner_id = source.optInt("reply_owner_id");
        reply_post_id = source.optInt("reply_post_id");
        friends_only = ParseUtils.parseBoolean(source, "friends_only");

        comments = new VKComments(source.optJSONObject("comments"));
        likes = new VKLikes(source.optJSONObject("likes"));
        reposts = new VKReposts(source.optJSONObject("reposts"));
        views = new VKViews(source.optJSONObject("views"));

        post_type = source.optString("post_type");
        attachments.fill(source.optJSONArray("attachments"));
        JSONObject geo = source.optJSONObject("geo");
        if(geo != null) {
            this.geo = new VKApiPlace().parse(geo);
        }
        signer_id = source.optInt("signer_id");
        copy_history = new VKList<>(source.optJSONArray("copy_history"), VKApiPost.class);
        access_key = source.optString("access_key");
        return this;
    }

    /**
     * Creates a Post instance from Parcel.
     */
    public VKApiPost(Parcel in) {
        this.id = in.readInt();
        this.owner_id = in.readInt();
        this.from_id = in.readInt();
        this.date = in.readLong();
        this.text = in.readString();
        this.reply_owner_id = in.readInt();
        this.reply_post_id = in.readInt();
        this.friends_only = in.readByte() != 0;

        this.comments = in.readParcelable(VKComments.class.getClassLoader());
        this.likes = in.readParcelable(VKLikes.class.getClassLoader());
        this.reposts = in.readParcelable(VKReposts.class.getClassLoader());
        this.views = in.readParcelable(VKViews.class.getClassLoader());

        this.post_type = in.readString();
        this.attachments = in.readParcelable(VKAttachments.class.getClassLoader());
        this.geo = in.readParcelable(VKApiPlace.class.getClassLoader());
        this.signer_id = in.readInt();
        this.access_key = in.readString();
    }

    /**
     * Creates empty Post instance.
     */
    public VKApiPost() {

    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public CharSequence toAttachmentString() {
        return new StringBuilder(VKAttachments.TYPE_POST).append(owner_id).append('_').append(id);
    }

    @Override
    public String getType() {
        return VKAttachments.TYPE_POST;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeInt(this.owner_id);
        dest.writeInt(this.from_id);
        dest.writeLong(this.date);
        dest.writeString(this.text);
        dest.writeInt(this.reply_owner_id);
        dest.writeInt(this.reply_post_id);
        dest.writeByte(friends_only ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.comments, flags);
        dest.writeParcelable(this.likes, flags);
        dest.writeParcelable(this.reposts, flags);
        dest.writeParcelable(this.views, flags);
        dest.writeString(this.post_type);
        dest.writeParcelable(attachments, flags);
        dest.writeParcelable(this.geo, flags);
        dest.writeInt(this.signer_id);
        dest.writeString(this.access_key);
    }

    public static Creator<VKApiPost> CREATOR = new Creator<VKApiPost>() {
        public VKApiPost createFromParcel(Parcel source) {
            return new VKApiPost(source);
        }

        public VKApiPost[] newArray(int size) {
            return new VKApiPost[size];
        }
    };

    @Override
    public String toString() {
        return "VKApiPost{" +
                "id=" + id +
                ", owner_id=" + owner_id +
                ", from_id=" + from_id +
                ", date=" + date +
                ", text='" + text + '\'' +
                ", reply_owner_id=" + reply_owner_id +
                ", reply_post_id=" + reply_post_id +
                ", friends_only=" + friends_only +
                ", comments=" + comments +
                ", likes=" + likes +
                ", reposts=" + reposts +
                ", views=" + views +
                ", post_type='" + post_type + '\'' +
                ", attachments=" + attachments +
                ", geo=" + geo +
                ", signer_id=" + signer_id +
                ", copy_history=" + copy_history +
                ", access_key=" + access_key +
                '}';
    }
}
