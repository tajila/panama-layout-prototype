/*******************************************************************************
 *  Copyright (c) 2016 IBM Corporation.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.ibm.layout;

public interface PriviledgedVLArray<T extends Layout> extends VLArray<T> {
	/**
	 * Function that user must override with an implementation that calculates
	 * the size of the variable length array
	 * 
	 * @param ptr pointer to the enclosing layout
	 * @return
	 */
	public long arrayLength(PointerType ptr);

}
