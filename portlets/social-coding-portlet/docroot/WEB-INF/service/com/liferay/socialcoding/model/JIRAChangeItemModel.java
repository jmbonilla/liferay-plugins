/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.socialcoding.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This interface is a model that represents the changeitem table in the
 * database.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       JIRAChangeItem
 * @see       com.liferay.socialcoding.model.impl.JIRAChangeItemImpl
 * @see       com.liferay.socialcoding.model.impl.JIRAChangeItemModelImpl
 * @generated
 */
public interface JIRAChangeItemModel extends BaseModel<JIRAChangeItem> {
	public long getPrimaryKey();

	public void setPrimaryKey(long pk);

	public long getJiraChangeItemId();

	public void setJiraChangeItemId(long jiraChangeItemId);

	public long getJiraChangeGroupId();

	public void setJiraChangeGroupId(long jiraChangeGroupId);

	@AutoEscape
	public String getField();

	public void setField(String field);

	@AutoEscape
	public String getOldValue();

	public void setOldValue(String oldValue);

	@AutoEscape
	public String getOldString();

	public void setOldString(String oldString);

	@AutoEscape
	public String getNewValue();

	public void setNewValue(String newValue);

	@AutoEscape
	public String getNewString();

	public void setNewString(String newString);

	public JIRAChangeItem toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(JIRAChangeItem jiraChangeItem);

	public int hashCode();

	public String toString();

	public String toXmlString();
}