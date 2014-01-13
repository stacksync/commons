package com.stacksync.syncservice.omq;

import java.util.List;

import com.stacksync.syncservice.models.DeviceInfo;
import com.stacksync.syncservice.models.ObjectMetadata;
import com.stacksync.syncservice.models.WorkspaceInfo;

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
	 * @return A list of {@link ObjectMetadata}
	 */
	@SyncMethod(retry = 3, timeout = 5000)
	public List<ObjectMetadata> getChanges(String user, String requestId,
			WorkspaceInfo workspace);

	/***
	 * Returns a list containing all workspaces for a given user.
	 * 
	 * @param user
	 *            The ID of the user
	 * @param requestId
	 *            Used for the client to identify the request
	 * @return A list of {@link WorkspaceInfo}
	 */
	@SyncMethod(retry = 3, timeout = 5000)
	public List<WorkspaceInfo> getWorkspaces(String user, String requestId);

	/***
	 * Function used to commit new versions of objects.
	 * 
	 * @param user
	 *            The ID of the user
	 * @param requestId
	 *            Used for the client to identify the request
	 * @param workspace
	 *            The ID of the workspace
	 * @param device
	 *            The ID of the device
	 * @param commitObjects
	 *            List of {@link ObjectMetadata} with the newly modified objects
	 */
	@AsyncMethod
	public void commit(String user, String requestId, WorkspaceInfo workspace,
			String device, List<ObjectMetadata> commitObjects);

	/***
	 * Function used to update information about a device. If the device ID is
	 * empty, it will register it as a new device and return the unique ID to
	 * the caller. Otherwise, it will update the information related to the
	 * device ID and return the same device ID. If an error occurs and the
	 * device information cannot be updated, it will return -1.
	 * 
	 * @param user
	 *            The ID of the user
	 * @param requestId
	 *            Used for the client to identify the request
	 * @param device
	 *            Information about the device
	 * @return A unique ID to identify the device
	 */
	@SyncMethod(retry = 3, timeout = 5000)
	public Long updateDevice(String user, String requestId, DeviceInfo device);
}