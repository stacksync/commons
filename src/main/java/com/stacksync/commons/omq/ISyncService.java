package com.stacksync.commons.omq;

import java.util.List;
import java.util.UUID;

import com.stacksync.commons.models.AccountInfo;
import com.stacksync.commons.models.ItemMetadata;
import com.stacksync.commons.models.Workspace;
import com.stacksync.commons.requests.CommitRequest;
import com.stacksync.commons.requests.GetChangesRequest;
import com.stacksync.commons.requests.GetWorkspacesRequest;
import com.stacksync.commons.requests.GetAccountRequest;
import com.stacksync.commons.requests.ShareProposalRequest;
import com.stacksync.commons.requests.UpdateDeviceRequest;
import com.stacksync.commons.requests.UpdateWorkspaceRequest;
import com.stacksync.commons.exceptions.DeviceNotUpdatedException;
import com.stacksync.commons.exceptions.DeviceNotValidException;
import com.stacksync.commons.exceptions.NoWorkspacesFoundException;
import com.stacksync.commons.exceptions.ShareProposalNotCreatedException;
import com.stacksync.commons.exceptions.UserNotFoundException;
import com.stacksync.commons.exceptions.WorkspaceNotUpdatedException;
import com.stacksync.commons.models.SyncMetadata;
import com.stacksync.commons.models.User;
import com.stacksync.commons.models.UserWorkspace;
import com.stacksync.commons.requests.RevokeProposalRequest;

import omq.Remote;
import omq.client.annotation.AsyncMethod;
import omq.client.annotation.RemoteInterface;
import omq.client.annotation.SyncMethod;

@RemoteInterface
public interface ISyncService extends Remote {

	/***
	 * Returns a list containing all metadata objects in a workspace for a given
	 * user.
	 * 
	 * @param request
	 * @return A list of {@link ItemMetadata}
	 */
	@SyncMethod(retry = 3, timeout = 5000)
	public List<SyncMetadata> getChanges(GetChangesRequest request);

	/***
	 * Returns a list containing all workspaces for a given user.
	 * 
	 * @param GetWorkspacesRequest
	 *            Information about the request
	 * @return A list of {@link Workspace}
	 * @throws NoWorkspacesFoundException 
	 */
	@SyncMethod(retry = 3, timeout = 5000)
	public List<Workspace> getWorkspaces(GetWorkspacesRequest request) throws NoWorkspacesFoundException;

	/***
	 * Function used to commit new versions of objects.
	 * 
	 * @param requestId
	 *            Used for the client to identify the request
	 * @param user
	 *            The user that sent the commit
	 * @param workspace
	 *            The workspace that the items belong to
	 * @param device
	 *            The device from where the commit was originated
	 * @param items
	 *            List of {@link ItemMetadata} with the newly modified items
	 */
	@AsyncMethod
	public void commit(CommitRequest request);

	/***
	 * Function used to update information about a device. If the device ID is
	 * empty, it will register it as a new device and return the unique ID to
	 * the caller. Otherwise, it will update the information related to the
	 * device ID and return the same device ID.
	 * 
	 * @param UpdateDeviceRequest
	 *            The device information to be updated 
	 * @return A unique ID to identify the device
	 * @throws DeviceNotUpdatedException 
	 * @throws DeviceNotValidException 
	 * @throws UserNotFoundException 
	 */
	@SyncMethod(retry = 3, timeout = 5000)
	public UUID updateDevice(UpdateDeviceRequest request) throws UserNotFoundException, DeviceNotValidException, DeviceNotUpdatedException;
	
	/***
	 * Function used to update information about a workspace.
	 * 
	 * @param UpdateDeviceRequest
	 *            The device information to be updated 
	 * @throws WorkspaceNotUpdatedException 
	 * @throws UserNotFoundException 
	 */
	@SyncMethod(retry = 3, timeout = 5000)
	public void updateWorkspace(UpdateWorkspaceRequest request) throws UserNotFoundException, WorkspaceNotUpdatedException;
	
	/***
	 * Function used to create a share proposal through the desktop client.
	 * 
	 * @param ShareProposalRequest
	 * 			  Information needed to create the sharing proposal
	 */
	@AsyncMethod
	public void createShareProposal(ShareProposalRequest request) throws ShareProposalNotCreatedException, UserNotFoundException;
	
	/***
	 * Function used to obtain information about an Account
	 * @param GetAccountRequest
	 * 		Information needed to identify the account
	 * @throws UserNotFoundException 
	 */
	@SyncMethod(retry = 3, timeout = 5000)
	public AccountInfo getAccountInfo(GetAccountRequest request) throws UserNotFoundException;
        
        /***
	 * Function used to obtain information about users in a workspace
	 * @param User 
         * @param Workspace ID
	 * 		Information needed to identify the account
	 * @throws UserNotFoundException 
	 */
	@SyncMethod(retry = 3, timeout = 5000)
	public List<UserWorkspace> getWorkspaceMembers(User user, Workspace workspace) throws UserNotFoundException;
        
        
        /***
	 * Function used to revoke a list of users
         * @param accountId
         * @param workspaceId
         * @param revokeMessages
	 * 		Information needed to identify the account
	 * @throws UserNotFoundException 
	 */
        public void createRevokeProposal(RevokeProposalRequest request) throws UserNotFoundException;
        
}