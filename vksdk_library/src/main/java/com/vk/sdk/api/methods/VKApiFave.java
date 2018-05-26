package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

@SuppressWarnings({"unused", "WeakerAccess"})
public class VKApiFave extends VKApiBase {

    public VKRequest addGroup(VKParameters params) {
        return prepareRequest("addGroup", params);
    }

    public VKRequest addLink(VKParameters params) {
        return prepareRequest("addLink", params);
    }

    public VKRequest addUser(VKParameters params) {
        return prepareRequest("addUser", params);
    }

    public VKRequest getLinks() {
        return getLinks(null);
    }

    public VKRequest getLinks(VKParameters params) {
        return prepareRequest("getLinks", params);
    }

    public VKRequest getMarketItems() {
        return getMarketItems(null);
    }

    public VKRequest getMarketItems(VKParameters params) {
        return prepareRequest("getMarketItems", params);
    }

    public VKRequest getPhotos() {
        return getPhotos(null);
    }

    public VKRequest getPhotos(VKParameters params) {
        return prepareRequest("getPhotos", params);
    }

    public VKRequest getPosts() {
        return getPosts(null);
    }

    public VKRequest getPosts(VKParameters params) {
        return prepareRequest("getPosts", params);
    }

    public VKRequest getUsers() {
        return getUsers(null);
    }

    public VKRequest getUsers(VKParameters params) {
        return prepareRequest("getUsers", params);
    }

    public VKRequest getVideos() {
        return getVideos(null);
    }

    public VKRequest getVideos(VKParameters params) {
        return prepareRequest("getVideos", params);
    }

    public VKRequest removeLink(VKParameters params) {
        return prepareRequest("removeLink", params);
    }

    public VKRequest removeUser(VKParameters params) {
        return prepareRequest("removeUser", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "fave";
    }
}