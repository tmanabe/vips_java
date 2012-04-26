/*
 * Tomas Popela, xpopel11, 2012
 * VIPS - Visual Internet Page Segmentation
 * Module - VisualStructurejava
 */

package org.fit.vips;

import java.util.ArrayList;
import java.util.List;

public class VisualStructure {

	private List<VipsBlock> _nestedBlocks = null;
	private List<VisualStructure> _childrenVisualStructures = null;
	private List<Separator> _horizontalSeparators = null;
	private List<Separator> _verticalSeparators = null;
	private int _width = 0;
	private int _height = 0;
	private int _x = 0;
	private int _y = 0;
	private String _id = null;

	public VisualStructure()
	{
		_nestedBlocks = new ArrayList<>();
		_childrenVisualStructures = new ArrayList<>();
		_horizontalSeparators = new ArrayList<>();
		_verticalSeparators = new ArrayList<>();
	}

	/**
	 * @return the _nestedBlocks
	 */
	public List<VipsBlock> getNestedBlocks()
	{
		return _nestedBlocks;
	}

	public void addNestedBlock(VipsBlock vipsBlock)
	{
		this._nestedBlocks.add(vipsBlock);
	}

	public void addChild(VisualStructure visualStructure)
	{
		this._childrenVisualStructures.add(visualStructure);
	}

	/**
	 * @return the _childrenVisualStructures
	 */
	public List<VisualStructure> getChildrenVisualStructures()
	{
		return _childrenVisualStructures;
	}

	/**
	 * @param _childrenVisualStructures the _childrenVisualStructures to set
	 */
	public void setChildrenVisualStructures(List<VisualStructure> _childrenVisualStructures)
	{
		this._childrenVisualStructures = _childrenVisualStructures;
	}

	/**
	 * @return the _horizontalSeparators
	 */
	public List<Separator> getHorizontalSeparators()
	{
		return _horizontalSeparators;
	}

	/**
	 * @param _horizontalSeparators the _horizontalSeparators to set
	 */
	public void setHorizontalSeparators(List<Separator> _horizontalSeparators)
	{
		this._horizontalSeparators = _horizontalSeparators;
	}

	/**
	 * @param _horizontalSeparators the _horizontalSeparators to set
	 */
	public void addHorizontalSeparator(Separator horizontalSeparator)
	{
		this._horizontalSeparators.add(horizontalSeparator);

	}

	public int getX()
	{
		return this._x;
	}

	public int getY()
	{
		return this._y;
	}

	public void setX(int x)
	{
		this._x = x;
	}

	public void setY(int y)
	{
		this._y = y;
	}

	public void setWidth(int width)
	{
		this._width = width;
	}

	public void setHeight(int height)
	{
		this._height = height;
	}

	public int getWidth()
	{
		return this._width;
	}

	public int getHeight()
	{
		return this._height;
	}

	/**
	 * @return the _verticalSeparators
	 */
	public List<Separator> getVerticalSeparators()
	{
		return _verticalSeparators;
	}

	/**
	 * @param _verticalSeparators the _verticalSeparators to set
	 */
	public void setVerticalSeparators(List<Separator> _verticalSeparators)
	{
		this._verticalSeparators = _verticalSeparators;
	}

	/**
	 * @param _horizontalSeparators the _horizontalSeparators to set
	 */
	public void addVerticalSeparator(Separator verticalSeparator)
	{
		this._verticalSeparators.add(verticalSeparator);
	}

	public void setId(String id)
	{
		this._id = id;
	}

	public String getId()
	{
		return this._id;
	}
}