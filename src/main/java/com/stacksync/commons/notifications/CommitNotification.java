package com.stacksync.commons.notifications;

import java.io.Serializable;
import java.util.List;

import com.stacksync.commons.models.CommitInfo;

public class CommitNotification extends Notification implements Serializable {

    protected static final long serialVersionUID = -6718869783377947343L;
    protected List<CommitInfo> items;
    protected Long limitQuota, usedQuota;

    public CommitNotification(String requestId, List<CommitInfo> items, Long limitQuota, Long usedQuota) {
        super(requestId);
        this.items = items;
        this.limitQuota = limitQuota;
        this.usedQuota = usedQuota;
    }

    public List<CommitInfo> getItems() {
        return items;
    }

    public void setItems(List<CommitInfo> items) {
        this.items = items;
    }

    public Long getLimitQuota() {
        return limitQuota;
    }

    public void setLimitQuota(Long limitQuota) {
        this.limitQuota = limitQuota;
    }
    
    public Long getUsedQuota() {
        return usedQuota;
    }

    public void setUsedQuota(Long usedQuota) {
        this.usedQuota = usedQuota;
    }
}
