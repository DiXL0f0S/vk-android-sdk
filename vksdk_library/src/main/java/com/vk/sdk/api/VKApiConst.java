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

package com.vk.sdk.api;

/**
 * Constants for api. List is not full
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class VKApiConst {
    //Commons
    public static final String USER_ID = "user_id";
    public static final String USER_IDS = "user_ids";
    public static final String FIELDS = "fields";
    public static final String SORT = "sort";
    public static final String OFFSET = "offset";
    public static final String COUNT = "count";
    public static final String OWNER_ID = "owner_id";
    public static final String LIMIT = "limit";

    //auth
    public static final String VERSION = "v";
    public static final String LANG = "lang";
    public static final String ACCESS_TOKEN = "access_token";
    public static final String SIG = "sig";

    //friends
    public static final String ORDER = "order";
    public static final String HINTS = "hints";
    public static final String RANDOM = "random";
    public static final String MOBILE = "mobile";
    public static final String NAME = "name";
    public static final String NEED_VIEWED = "need_viewed";
    public static final String NEED_MUTUAL = "need_mutual";

    //get users
    public static final String NAME_CASE = "name_case";

    //Messages
    public static final String OUT = "out";
    public static final String TIME_OFFSET = "time_offset";
    public static final String FILTERS = "filters";
    public static final String LAST_MESSAGE_ID = "last_message_id";
    public static final String START_MESSAGE_ID = "start_message_id";
    public static final String PREVIEW_LENGTH = "preview_length";
    public static final String UNREAD = "unread";
    public static final String CHAT_ID = "chat_id";
    public static final String ACTION_KICK = "chat_kick_user";
    public static final String ACTION_INVITE = "chat_invite_user";
    public static final String ACTION_TITLE_UPDATE = "chat_title_update";
    public static final String ACTION_CREATE = "chat_create";
    public static final String ACTION_PHOTO_REMOVE = "chat_photo_remove";
    public static final String ACTION_PHOTO_UPDATE = "chat_photo_update";
    public static final String ACTION_PIN_MESSAGE = "chat_pin_message";
    public static final String ACTION_UNPIN_MESSAGE = "chat_unpin_message";
    public static final String ACTION_INVITE_USER_BY_LINK = "chat_invite_user_by_link";
    public static final String PEER_ID = "peer_id";
    public static final String MESSAGE_IDS = "message_ids";
    public static final int DIALOG_USER = 0;
    public static final int DIALOG_CHAT = 1;
    public static final int DIALOG_COMMUNITY = 2;

    //Get subscriptions
    public static final String EXTENDED = "extended";

    //Search
    public static final String Q = "q";
    public static final String CITY = "city";
    public static final String COUNTRY = "country";
    public static final String HOMETOWN = "hometown";
    public static final String UNIVERSITY_COUNTRY = "university_country";
    public static final String UNIVERSITY = "university";
    public static final String UNIVERSITY_YEAR = "university_year";
    public static final String SEX = "sex";
    public static final String STATUS = "status";
    public static final String AGE_FROM = "age_from";
    public static final String AGE_TO = "age_to";
    public static final String BIRTH_DAY = "birth_day";
    public static final String BIRTH_MONTH = "birth_month";
    public static final String BIRTH_YEAR = "birth_year";
    public static final String ONLINE = "online";
    public static final String HAS_PHOTO = "has_photo";
    public static final String SCHOOL_COUNTRY = "school_country";
    public static final String SCHOOL_CITY = "school_city";
    public static final String SCHOOL = "school";
    public static final String SCHOOL_YEAR = "school_year";
    public static final String RELIGION = "religion";
    public static final String INTERESTS = "interests";
    public static final String COMPANY = "company";
    public static final String POSITION = "position";
    public static final String GROUP_ID = "group_id";
    public static final String GROUP_IDS = "group_ids";

    public static final String FRIENDS_ONLY = "friends_only";
    public static final String FROM_GROUP = "from_group";
    public static final String MESSAGE = "message";
    public static final String ATTACHMENTS = "attachments";
    public static final String SERVICES = "services";
    public static final String SIGNED = "signed";
    public static final String PUBLISH_DATE = "publish_date";
    public static final String LAT = "lat";
    public static final String LONG = "long";
    public static final String PLACE_ID = "place_id";
    public static final String POST_ID = "post_id";
    public static final String POSTS = "posts";

    //Errors
    public static final String ERROR_CODE = "error_code";
    public static final String ERROR_MSG = "error_msg";
    public static final String REQUEST_PARAMS = "request_params";

    //Captcha
    public static final String CAPTCHA_IMG = "captcha_img";
    public static final String CAPTCHA_SID = "captcha_sid";
    public static final String CAPTCHA_KEY = "captcha_key";
    public static final String REDIRECT_URI = "redirect_uri";

    //Photos
    public static final String PHOTO = "photo";
    public static final String PHOTOS = "photos";
    public static final String ALBUM_ID = "album_id";
    public static final String PHOTO_IDS = "photo_ids";
    public static final String PHOTO_SIZES = "photo_sizes";
    public static final String REV = "rev";
    public static final String FEED_TYPE = "feed_type";
    public static final String FEED = "feed";

    //Videos
    public static final String ADULT = "adult";
    
    //Audios
    public static final String AUTO_COMPLETE = "auto_complete";

    //Enums
    enum VKProgressType {
        VKProgressTypeUpload,
        VKProgressTypeDownload
    }

    //Account
    public static final String RESTORE_SID = "restore_sid";
    public static final String CHANGE_PASSWORD_HASH = "change_password_hash";
    public static final String OLD_PASSWORD = "old_password";
    public static final String NEW_PASSWORD = "new_password";

    //Events
    public static final String VKCaptchaAnsweredEvent = "VKCaptchaAnsweredEvent";

    //Long Poll
    public static final String NEED_PTS = "need_pts";
    public static final String PTS = "pts";

    public static final int MESSAGE_FLAGS_SET = 1;
    public static final int MESSAGE_FLAGS_ADD = 2;
    public static final int MESSAGE_FLAGS_CLEAR = 3;
    public static final int MESSAGE_NEW = 4;
    public static final int MESSAGE_READ_IN = 6;
    public static final int MESSAGE_READ_OUT = 7;
    public static final int FRIEND_ONLINE = 8;
    public static final int FRIEND_OFFLINE = 9;
    public static final int DIALOG_FLAGS_CLEAR = 10;
    public static final int DIALOG_FLAGS_SET = 11;
    public static final int DIALOG_FLAGS_ADD = 12;
    public static final int MESSAGES_DELETE = 13;
    public static final int CHAT_CHANGED = 51;
    public static final int USER_TYPING = 61;
    public static final int CHAT_USER_TYPING = 62;
    public static final int CALL_NEW = 70;
    public static final int DIALOGS_UNREAD_COUNT = 80;
    public static final int NOTIFICATIONS_CHANGED = 114;

    public static final int FLAG_MESSAGE_UNREAD = 1;
    public static final int FLAG_MESSAGE_OUTBOX = 2;
    public static final int FLAG_MESSAGE_REPLIED = 4;
    public static final int FLAG_MESSAGE_IMPORTANT = 8;
    public static final int FLAG_MESSAGE_CHAT = 16;
    public static final int FLAG_MESSAGE_FRIENDS = 32;
    public static final int FLAG_MESSAGE_SPAM = 64;
    public static final int FLAG_MESSAGE_DELETED = 128;
    public static final int FLAG_MESSAGE_FIXED = 256;
    public static final int FLAG_MESSAGE_MEDIA = 512;
    public static final int FLAG_MESSAGE_HIDDEN = 65536;
    public static final int FLAG_DIALOG_IMPORTANT = 1;
    public static final int FLAG_DIALOG_UNANSWERED = 2;

    public static final int ONLINE_MOBILE = 1;
    public static final int ONLINE_IPHONE = 2;
    public static final int ONLINE_IPAD = 3;
    public static final int ONLINE_ANDROID = 4;
    public static final int ONLINE_WPHONE = 5;
    public static final int ONLINE_WINDOWS = 6;
    public static final int ONLINE_WEB = 7;
}
