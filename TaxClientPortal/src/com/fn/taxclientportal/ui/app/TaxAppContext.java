/**
 * 
 */
package com.fn.taxclientportal.ui.app;

import android.app.Application;

/**
 * 全局变量
 * 
 * @author luxiang
 *
 */
public class TaxAppContext extends Application {

	public static String version;

	public static String[] mainImageFilePaths = { TaxConstants.Foler.IMAGES_FOLDER
			+ "20140906_173330.jpg",
			TaxConstants.Foler.IMAGES_FOLDER
			+ "20140906_173339.jpg",
			TaxConstants.Foler.IMAGES_FOLDER
			+ "20140906_173351.jpg",
			TaxConstants.Foler.IMAGES_FOLDER
			+ "20140906_173414.jpg"};
	
	public static int screenWidth;
	public static int screenHeight;

}
