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

package com.liferay.so.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.AuditedModel;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ProjectsEntry service. Represents a row in the &quot;SO_ProjectsEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.so.model.impl.ProjectsEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.so.model.impl.ProjectsEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProjectsEntry
 * @see com.liferay.so.model.impl.ProjectsEntryImpl
 * @see com.liferay.so.model.impl.ProjectsEntryModelImpl
 * @generated
 */
@ProviderType
public interface ProjectsEntryModel extends AuditedModel,
	BaseModel<ProjectsEntry>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a projects entry model instance should use the {@link ProjectsEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this projects entry.
	 *
	 * @return the primary key of this projects entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this projects entry.
	 *
	 * @param primaryKey the primary key of this projects entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the projects entry ID of this projects entry.
	 *
	 * @return the projects entry ID of this projects entry
	 */
	public long getProjectsEntryId();

	/**
	 * Sets the projects entry ID of this projects entry.
	 *
	 * @param projectsEntryId the projects entry ID of this projects entry
	 */
	public void setProjectsEntryId(long projectsEntryId);

	/**
	 * Returns the company ID of this projects entry.
	 *
	 * @return the company ID of this projects entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this projects entry.
	 *
	 * @param companyId the company ID of this projects entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this projects entry.
	 *
	 * @return the user ID of this projects entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this projects entry.
	 *
	 * @param userId the user ID of this projects entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this projects entry.
	 *
	 * @return the user uuid of this projects entry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this projects entry.
	 *
	 * @param userUuid the user uuid of this projects entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this projects entry.
	 *
	 * @return the user name of this projects entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this projects entry.
	 *
	 * @param userName the user name of this projects entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this projects entry.
	 *
	 * @return the create date of this projects entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this projects entry.
	 *
	 * @param createDate the create date of this projects entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this projects entry.
	 *
	 * @return the modified date of this projects entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this projects entry.
	 *
	 * @param modifiedDate the modified date of this projects entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the title of this projects entry.
	 *
	 * @return the title of this projects entry
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this projects entry.
	 *
	 * @param title the title of this projects entry
	 */
	public void setTitle(String title);

	/**
	 * Returns the description of this projects entry.
	 *
	 * @return the description of this projects entry
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this projects entry.
	 *
	 * @param description the description of this projects entry
	 */
	public void setDescription(String description);

	/**
	 * Returns the start date of this projects entry.
	 *
	 * @return the start date of this projects entry
	 */
	public Date getStartDate();

	/**
	 * Sets the start date of this projects entry.
	 *
	 * @param startDate the start date of this projects entry
	 */
	public void setStartDate(Date startDate);

	/**
	 * Returns the end date of this projects entry.
	 *
	 * @return the end date of this projects entry
	 */
	public Date getEndDate();

	/**
	 * Sets the end date of this projects entry.
	 *
	 * @param endDate the end date of this projects entry
	 */
	public void setEndDate(Date endDate);

	/**
	 * Returns the data of this projects entry.
	 *
	 * @return the data of this projects entry
	 */
	@AutoEscape
	public String getData();

	/**
	 * Sets the data of this projects entry.
	 *
	 * @param data the data of this projects entry
	 */
	public void setData(String data);

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
	public int compareTo(com.liferay.so.model.ProjectsEntry projectsEntry);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.so.model.ProjectsEntry> toCacheModel();

	@Override
	public com.liferay.so.model.ProjectsEntry toEscapedModel();

	@Override
	public com.liferay.so.model.ProjectsEntry toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}