/*******************************************************************************
 *  Copyright (c) 2016 IBM Corporation.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.user.types;

import com.ibm.layout.IntPointer ;
import com.ibm.layout.IntArray1D;
import com.ibm.layout.Layout;
import com.ibm.layout.LayoutDesc;

/* Generated by LD2J */
@LayoutDesc({"v4:jint[4]:16"})
public interface V4 extends Layout {

	interface EffectiveAddress {

		public IntPointer v4();

	}

	public V4.EffectiveAddress EA();

	public long sizeof();

	public IntArray1D v4();

	@Override
	public String toString();

}
