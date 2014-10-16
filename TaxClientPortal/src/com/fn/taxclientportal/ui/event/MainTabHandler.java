package com.fn.taxclientportal.ui.event;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.actionbarsherlock.app.ActionBar.Tab;
import com.fn.taxclientportal.R;



public class MainTabHandler implements
		com.actionbarsherlock.app.ActionBar.TabListener {
	private Fragment fragment;

	public MainTabHandler(Fragment fragment) {
		this.fragment = fragment;
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		ft.replace(R.id.frame_content, fragment);
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

}
