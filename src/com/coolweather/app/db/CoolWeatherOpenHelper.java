package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	public static final String CREATE_PROVINCE = "create table Province ("		//Province������䣬���ʡ��������Ϣ
				+ "id integer primary key autoincrement, "		//id������������
				+ "province_name text, "		//province_name��ʾʡ��
				+ "province_code text)";		//province_code��ʾʡ������
	
	public static final String CREATE_CITY = "create table City ("		//City������䣬����е�������Ϣ
				+ "id integer primary key autoincrement, "		//id������������
				+ "city_name text, "		//city_name��ʾ������
				+ "city_code text, "		//city_code��ʾ�м�����
				+ "province_id integer)";		//province_id��City�����Provice������
	
	public static final String CREATE_COUNTY = "create table County ("		//County������䣬����ص�������Ϣ
				+ "id integer primary key autoincrement, "		//id������������
				+ "county_name text, "		//county_name��ʾ����
				+ "county_code text, "		//county_code��ʾ�ؼ�����
				+ "city_id integer)";		//city_id��County�����City������

	public CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,int version){		//���췽��
		super(context,name,factory,version);		//���ø���Ĺ��췽��
	}

	@Override
	public void onCreate(SQLiteDatabase db){		//��дonCreate()����
		db.execSQL(CREATE_PROVINCE);		//����Province��
		db.execSQL(CREATE_CITY);		//����City��
		db.execSQL(CREATE_COUNTY);		//����County��
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){		//��дonUpgrade()����
	}

}