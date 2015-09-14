package com.stacksync.commons.requests;

import com.ast.cloudABE.kpabe.RevokeMessage;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class RevokeProposalRequest extends Request implements Serializable {

    protected static final long serialVersionUID = -5985754297818659212L;

    protected UUID workspaceId; 
    
    protected List<RevokeMessage> revokeMessages;

    public RevokeProposalRequest(UUID userId, UUID workspaceId, List<RevokeMessage> revokeMessages) {
        super(userId);

        this.workspaceId = workspaceId;
        this.revokeMessages = revokeMessages;
    }
        
    public UUID getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(UUID workspaceId) {
        this.workspaceId = workspaceId;
    }

    public List<RevokeMessage> getRevokeMessages() {
        return revokeMessages;
    }

    public void setRevokeMessages(List<RevokeMessage> revokeMessages) {
        this.revokeMessages = revokeMessages;
    }
}
