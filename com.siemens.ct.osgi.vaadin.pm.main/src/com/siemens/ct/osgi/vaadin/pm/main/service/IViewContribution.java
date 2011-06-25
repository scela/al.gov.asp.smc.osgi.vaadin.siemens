/*******************************************************************************
 * Copyright (c) 2010 Kai Toedter and Siemens AG
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Kai Toedter - initial API and implementation
 *******************************************************************************/

package com.siemens.ct.osgi.vaadin.pm.main.service;

import com.vaadin.Application;
import com.vaadin.ui.Component;

/**
 * A simple view UI contribution
 */
public interface IViewContribution {
	public Component getView(Application application);

	public String getIcon();

	public String getName();
}
