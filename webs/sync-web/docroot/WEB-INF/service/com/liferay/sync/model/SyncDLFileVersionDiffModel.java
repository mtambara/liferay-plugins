/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.sync.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the SyncDLFileVersionDiff service. Represents a row in the &quot;SyncDLFileVersionDiff&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.sync.model.impl.SyncDLFileVersionDiffModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.sync.model.impl.SyncDLFileVersionDiffImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SyncDLFileVersionDiff
 * @see com.liferay.sync.model.impl.SyncDLFileVersionDiffImpl
 * @see com.liferay.sync.model.impl.SyncDLFileVersionDiffModelImpl
 * @generated
 */
@ProviderType
public interface SyncDLFileVersionDiffModel extends BaseModel<SyncDLFileVersionDiff> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sync d l file version diff model instance should use the {@link SyncDLFileVersionDiff} interface instead.
	 */

	/**
	 * Returns the primary key of this sync d l file version diff.
	 *
	 * @return the primary key of this sync d l file version diff
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sync d l file version diff.
	 *
	 * @param primaryKey the primary key of this sync d l file version diff
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sync d l file version diff ID of this sync d l file version diff.
	 *
	 * @return the sync d l file version diff ID of this sync d l file version diff
	 */
	public long getSyncDLFileVersionDiffId();

	/**
	 * Sets the sync d l file version diff ID of this sync d l file version diff.
	 *
	 * @param syncDLFileVersionDiffId the sync d l file version diff ID of this sync d l file version diff
	 */
	public void setSyncDLFileVersionDiffId(long syncDLFileVersionDiffId);

	/**
	 * Returns the file entry ID of this sync d l file version diff.
	 *
	 * @return the file entry ID of this sync d l file version diff
	 */
	public long getFileEntryId();

	/**
	 * Sets the file entry ID of this sync d l file version diff.
	 *
	 * @param fileEntryId the file entry ID of this sync d l file version diff
	 */
	public void setFileEntryId(long fileEntryId);

	/**
	 * Returns the source file version ID of this sync d l file version diff.
	 *
	 * @return the source file version ID of this sync d l file version diff
	 */
	public long getSourceFileVersionId();

	/**
	 * Sets the source file version ID of this sync d l file version diff.
	 *
	 * @param sourceFileVersionId the source file version ID of this sync d l file version diff
	 */
	public void setSourceFileVersionId(long sourceFileVersionId);

	/**
	 * Returns the target file version ID of this sync d l file version diff.
	 *
	 * @return the target file version ID of this sync d l file version diff
	 */
	public long getTargetFileVersionId();

	/**
	 * Sets the target file version ID of this sync d l file version diff.
	 *
	 * @param targetFileVersionId the target file version ID of this sync d l file version diff
	 */
	public void setTargetFileVersionId(long targetFileVersionId);

	/**
	 * Returns the data file entry ID of this sync d l file version diff.
	 *
	 * @return the data file entry ID of this sync d l file version diff
	 */
	public long getDataFileEntryId();

	/**
	 * Sets the data file entry ID of this sync d l file version diff.
	 *
	 * @param dataFileEntryId the data file entry ID of this sync d l file version diff
	 */
	public void setDataFileEntryId(long dataFileEntryId);

	/**
	 * Returns the size of this sync d l file version diff.
	 *
	 * @return the size of this sync d l file version diff
	 */
	public long getSize();

	/**
	 * Sets the size of this sync d l file version diff.
	 *
	 * @param size the size of this sync d l file version diff
	 */
	public void setSize(long size);

	/**
	 * Returns the expiration date of this sync d l file version diff.
	 *
	 * @return the expiration date of this sync d l file version diff
	 */
	public Date getExpirationDate();

	/**
	 * Sets the expiration date of this sync d l file version diff.
	 *
	 * @param expirationDate the expiration date of this sync d l file version diff
	 */
	public void setExpirationDate(Date expirationDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.liferay.sync.model.SyncDLFileVersionDiff syncDLFileVersionDiff);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.sync.model.SyncDLFileVersionDiff> toCacheModel();

	@Override
	public com.liferay.sync.model.SyncDLFileVersionDiff toEscapedModel();

	@Override
	public com.liferay.sync.model.SyncDLFileVersionDiff toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}