package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	public static final String CREATE_PROVINCE = "create table Province ("		//Province表建表语句，存放省的数据信息
				+ "id integer primary key autoincrement, "		//id是自增长主键
				+ "province_name text, "		//province_name表示省名
				+ "province_code text)";		//province_code表示省级代号
	
	public static final String CREATE_CITY = "create table City ("		//City表建表语句，存放市的数据信息
				+ "id integer primary key autoincrement, "		//id是自增长主键
				+ "city_name text, "		//city_name表示城市名
				+ "city_code text, "		//city_code表示市级代号
				+ "province_id integer)";		//province_id是City表关联Provice表的外键
	
	public static final String CREATE_COUNTY = "create table County ("		//County表建表语句，存放县的数据信息
				+ "id integer primary key autoincrement, "		//id是自增长主键
				+ "county_name text, "		//county_name表示县名
				+ "county_code text, "		//county_code表示县级代号
				+ "city_id integer)";		//city_id是County表关联City表的外键

	public CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,int version){		//构造方法
		super(context,name,factory,version);		//调用父类的构造方法
	}

	@Override
	public void onCreate(SQLiteDatabase db){		//重写onCreate()方法
		db.execSQL(CREATE_PROVINCE);		//创建Province表
		db.execSQL(CREATE_CITY);		//创建City表
		db.execSQL(CREATE_COUNTY);		//创建County表
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){		//重写onUpgrade()方法
	}

}