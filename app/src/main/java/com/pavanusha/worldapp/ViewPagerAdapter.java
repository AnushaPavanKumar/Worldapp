package com.pavanusha.worldapp;


import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
 
public class ViewPagerAdapter extends PagerAdapter 
{
	// Declare Variables
	Context context;
	String[] category;
		int[] flag;
	LayoutInflater inflater;
 
	public ViewPagerAdapter(Context context, String[] category,  int[] flag)
	{
		this.context = context;
		this.category = category;
		this.flag = flag;
		
	}
 
	@Override
	public int getCount() {
		return category.length;
	}
 
	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view == ((RelativeLayout) object);
	}
 
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
 
		// Declare Variables
		TextView txt;
		ImageView imgflag;
 
		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View itemView = inflater.inflate(R.layout.m_content, container,
				false);
 
		// Locate the TextViews in viewpager_item.xml
		txt = (TextView) itemView.findViewById(R.id.txt);
				// Capture position and set to the TextViews
		txt.setText(category[position]);
		
		// Locate the ImageView in viewpager_item.xml
		imgflag = (ImageView) itemView.findViewById(R.id.img);
		// Capture position and set to the ImageView
		imgflag.setImageResource(flag[position]);
 
		// Add viewpager_item.xml to ViewPager
		((ViewPager) container).addView(itemView);
 
		return itemView;
	}
 
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		// Remove viewpager_item.xml from ViewPager
		((ViewPager) container).removeView((RelativeLayout) object);
 
	}
}