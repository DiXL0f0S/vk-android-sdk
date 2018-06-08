package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

/**
 * Builds requests for API.newsfeed part
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class VKApiNewsfeed extends VKApiBase {

    /**
     * https://vk.com/dev/newsfeed.addBan
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest addBan(VKParameters params) {
        return prepareRequest("addBan", params);
    }

    /**
     * https://vk.com/dev/newsfeed.deleteBan
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest deleteBan(VKParameters params) {
        return prepareRequest("deleteBan", params);
    }

    /**
     * https://vk.com/dev/newsfeed.deleteList
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest deleteList(VKParameters params) {
        return prepareRequest("deleteList", params);
    }

    /**
     * https://vk.com/dev/newsfeed.get
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }

    public VKRequest get() {
        return get(null);
    }

    /**
     * https://vk.com/dev/newsfeed.getBanned
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest getBanned(VKParameters params) {
        return prepareRequest("getBanned", params);
    }

    public VKRequest getBanned() {
        return getBanned(null);
    }

    /**
     * https://vk.com/dev/newsfeed.getComments
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest getComments(VKParameters params) {
        return prepareRequest("getComments", params);
    }

    /**
     * https://vk.com/dev/newsfeed.getLists
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest getLists(VKParameters params) {
        return prepareRequest("getLists", params);
    }

    public VKRequest getLists() {
        return getLists(null);
    }

    /**
     * https://vk.com/dev/newsfeed.getMentions
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest getMentions(VKParameters params) {
        return prepareRequest("getMentions", params);
    }

    public VKRequest getMentions() {
        return getMentions(null);
    }

    /**
     * https://vk.com/dev/newsfeed.getRecommended
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest getRecommended(VKParameters params) {
        return prepareRequest("getRecommended", params);
    }

    public VKRequest getRecommended() {
        return getRecommended(null);
    }

    /**
     * https://vk.com/dev/newsfeed.getSuggestedSources
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest getSuggestedSources(VKParameters params) {
        return prepareRequest("getSuggestedSources", params);
    }

    public VKRequest getSuggestedSources() {
        return getSuggestedSources(null);
    }

    /**
     * https://vk.com/dev/newsfeed.ignoreItem
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest ignoreItem(VKParameters params) {
        return prepareRequest("ignoreItem", params);
    }

    /**
     * https://vk.com/dev/newsfeed.saveList
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest saveList(VKParameters params) {
        return prepareRequest("saveList", params);
    }

    /**
     * https://vk.com/dev/newsfeed.search
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest search(VKParameters params) {
        return prepareRequest("search", params);
    }

    /**
     * https://vk.com/dev/newsfeed.unignoreItem
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest unignoreItem(VKParameters params) {
        return prepareRequest("unignoreItem", params);
    }

    /**
     * https://vk.com/dev/newsfeed.unsubscribe
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest unsubscribe(VKParameters params) {
        return prepareRequest("unsubscribe", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "newsfeed";
    }
}