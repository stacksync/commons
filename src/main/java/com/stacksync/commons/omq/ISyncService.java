package com.stacksync.commons.omq;

import java.util.List;

import com.stacksync.commons.models.Device;
import com.stacksync.commons.models.ItemMetadata;
import com.stacksync.commons.models.User;
import com.stacksync.commons.models.Workspace;
import com.stacksync.commons.requests.UpdateDeviceRequest;
import com.stacksync.commons.exceptions.DeviceNotUpdatedException;
import com.stacksync.commons.exceptions.DeviceNotValidException;
import com.stacksync.commons.exceptions.UserNotFoundException;

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
	 * @param user
	 *            The ID of the user
	 * @param requestId
	 *            Used for the client to identify the request
	 * @param workspace
	 *            The ID of the workspace
	 * @return A list of {@link ItemMetadata}
	 */
	@SyncMethod(retry = 3, timeout = 5000)
	public List<ItemMetadata> getChanges(String requestId, User user, Workspace workspace);

	/***
	 * Returns a list containing all workspaces for a given user.
	 * 
	 * @param user
	 *            The ID of the user
	 * @param requestId
	 *            Used for the client to identify the request
	 * @return A list of {@link Workspace}
	 */
	@SyncMethod(retry = 3, timeout = 5000)
	public List<Workspace> getWorkspaces(String user, String requestId);

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
	public void commit(String requestId, User user, Workspace workspace,
			Device device, List<ItemMetadata> items);

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
	public Long updateDevice(UpdateDeviceRequest request) throws UserNotFoundException, DeviceNotValidException, DeviceNotUpdatedException;
	
	/***
	 * Function used to create a share proposal through the desktop client.
	 * 
	 * @param user
	 *            The ID of the user
	 * @param requestId
	 *            Used for the client to identify the request
	 * @param emails
	 *            A list of emails to with the folder has been shared with
	 * @param folderName
	 * 			  The name of the new folder
	 * @return The workspace ID corresponding to the shared folder.
	 */
	@SyncMethod(retry = 3, timeout = 5000)
	public Long createShareProposal(String user, String requestId, List<String> emails, String folderName);
}