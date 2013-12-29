/*******************************************************************************
 * Copyright (c) 2013 Bert De Geyter (https://github.com/TheHolyWaffle).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Bert De Geyter (https://github.com/TheHolyWaffle) - initial API and implementation
 ******************************************************************************/
package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.PermissionGroupDatabaseType;
import com.github.theholywaffle.teamspeak3.commands.parameter.KeyValueParam;

public class CChannelGroupAdd extends Command {

	public CChannelGroupAdd(String name) {
		this(name, null);
	}

	public CChannelGroupAdd(String name, PermissionGroupDatabaseType t) {
		super("channelgroupadd");
		add(new KeyValueParam("name", name));
		if (t != null) {
			add(new KeyValueParam("type", t.getIndex()));
		}
	}

}