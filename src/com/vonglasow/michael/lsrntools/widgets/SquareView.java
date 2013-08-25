package com.vonglasow.michael.lsrntools.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class SquareView extends View {
	private float mRelativeSize = 1;
	
	public SquareView(Context context) {
		super(context);
	}

	public SquareView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public SquareView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	
	@Override
	protected void onMeasure (int widthMeasureSpec, int heightMeasureSpec) {
		int mSize = (int) (Math.min(MeasureSpec.getSize(widthMeasureSpec), MeasureSpec.getSize(heightMeasureSpec)) * mRelativeSize);
		Log.d("SquareView", String.format("Measuring SquareView, requested w=0x%x, h=0x%x, size w=%d, h=%d, sizing to %d", widthMeasureSpec, heightMeasureSpec, getMeasuredWidth(), getMeasuredHeight(), mSize));
		setMeasuredDimension(mSize, mSize);
	}
	
	public void setRelativeSize(float size) {
		mRelativeSize = size;
		invalidate();
	}
}
