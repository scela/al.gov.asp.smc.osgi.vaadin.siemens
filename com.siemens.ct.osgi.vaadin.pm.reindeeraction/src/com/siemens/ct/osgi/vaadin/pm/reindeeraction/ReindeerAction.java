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

package com.siemens.ct.osgi.vaadin.pm.reindeeraction;

import com.siemens.ct.osgi.vaadin.pm.main.service.IActionContribution;
import com.vaadin.Application;
import com.vaadin.ui.themes.Reindeer;

public class ReindeerAction implements IActionContribution {

	@Override
	public String getIcon() {
		return "icons/color_swatch.png";
	}

	@Override
	public String getText() {
		return "Reindeer Theme";
	}

	@Override
	public void execute(Application application) {
		application.setTheme(Reindeer.THEME_NAME);
	}

}
