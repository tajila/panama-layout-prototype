/*******************************************************************************
 *  Copyright (c) 2016 IBM Corporation.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.user.examples.myline;

import com.ibm.layout.Pointer;
import com.ibm.layout.Layout;
import com.ibm.layout.LayoutDesc;

/* Generated by LD2J */
@LayoutDesc({"start:Point:8","end:Point:8"})
public interface Line extends Layout {

	interface EffectiveAddress {

		public Pointer<Point> start();

		public Pointer<Point> end();

	}

	public Line.EffectiveAddress EA();

	public long sizeof();

	public Point start();

	public Point end();

	@Override
	public String toString();

}
