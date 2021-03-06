/*******************************************************************************
 *  Copyright (c) 2016 IBM Corporation.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.user.types;

import com.ibm.layout.IntPointer ;
import com.ibm.layout.Layout;
import com.ibm.layout.LayoutDesc;

/* Generated by LD2J */
@LayoutDesc({"x:jint:4","y:jint:4","z:jint:4","o:jint:4","p:jint:4"})
public interface Point5D extends Layout {

	interface EffectiveAddress {

		public IntPointer x();

		public IntPointer y();

		public IntPointer z();

		public IntPointer o();

		public IntPointer p();

	}

	public Point5D.EffectiveAddress EA();

	public long sizeof();

	public int x();

	public int y();

	public int z();

	public int o();

	public int p();

	public void x(int val);

	public void y(int val);

	public void z(int val);

	public void o(int val);

	public void p(int val);

	@Override
	public String toString();

}
