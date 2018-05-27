package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

/**
 * Builds requests for API.stories part
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class VKApiStories extends VKApiBase {
    /**
     * https://vk.com/dev/stories.banOwner
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest banOwner(VKParameters params) {
        return prepareRequest("banOwner", params);
    }

    /**
     * https://vk.com/dev/stories.delete
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest delete(VKParameters params) {
        return prepareRequest("delete", params);
    }

    /**
     * https://vk.com/dev/stories.get
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
     * https://vk.com/dev/stories.getBanned
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
     * https://vk.com/dev/stories.getById
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest getById(VKParameters params) {
        return prepareRequest("getById", params);
    }

    /**
     * https://vk.com/dev/stories.getPhotoUploadServer
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest getPhotoUploadServer(VKParameters params) {
        return prepareRequest("getPhotoUploadServer", params);
    }

    public VKRequest getPhotoUploadServer() {
        return getPhotoUploadServer(null);
    }

    /**
     * https://vk.com/dev/stories.getReplies
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest getReplies(VKParameters params) {
        return prepareRequest("getReplies", params);
    }

    /**
     * https://vk.com/dev/stories.getStats
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest getStats(VKParameters params) {
        return prepareRequest("getStats", params);
    }

    /**
     * https://vk.com/dev/stories.getVideoUploadServer
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest getVideoUploadServer(VKParameters params) {
        return prepareRequest("getVideoUploadServer", params);
    }

    public VKRequest getVideoUploadServer() {
        return getVideoUploadServer(null);
    }

    /**
     * https://vk.com/dev/stories.getViewers
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest getViewers(VKParameters params) {
        return prepareRequest("getViewers", params);
    }

    /**
     * https://vk.com/dev/stories.hideAllReplies
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest hideAllReplies(VKParameters params) {
        return prepareRequest("hideAllReplies", params);
    }

    /**
     * https://vk.com/dev/stories.hideReply
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest hideReply(VKParameters params) {
        return prepareRequest("hideReply", params);
    }

    /**
     * https://vk.com/dev/stories.unbanOwner
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest unbanOwner(VKParameters params) {
        return prepareRequest("unbanOwner", params);
    }


    @Override
    protected String getMethodsGroup() {
        return "stories";
    }
}