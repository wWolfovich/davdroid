/*******************************************************************************
 * Copyright (c) 2014 Richard Hirner (bitfire web engineering).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Richard Hirner (bitfire web engineering) - initial API and implementation
 ******************************************************************************/
package at.bitfire.davdroid.webdav;

import org.apache.http.HttpException;

public class PreconditionFailedException extends HttpException {
	private static final long serialVersionUID = 102282229174086113L;
	
	public PreconditionFailedException(String reason) {
		super(reason);
	}
}
