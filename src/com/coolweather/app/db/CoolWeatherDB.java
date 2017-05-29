package com.coolweather.app.db;

import java.util.ArrayList;
import java.util.List;
import com.coolweather.app.model.City;
import com.coolweather.app.model.County;
import com.coolweather.app.model.Province;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class CoolWeatherDB {

	public static final String DB_NAME = "cool_weather";		//��ʾ���ݿ���
	public static final int VERSION = 1;		//��ʾ���ݿ�汾
	private static CoolWeatherDB coolWeatherDB;		//����CoolWeatherDB����
	private SQLiteDatabase db;		//����SQLiteDatabase����

	private CoolWeatherDB(Context context){		//�����췽��˽�л�
		CoolWeatherOpenHelper dbHelper = new CoolWeatherOpenHelper(context,DB_NAME,null,VERSION);		//��ȡCoolWeatherOpenHelper����
		db = dbHelper.getWritableDatabase();		//��ȡ����SQLiteDatabase����
	}

	public synchronized static CoolWeatherDB getInstance(Context context){		//��ȡCoolWeatherDB��ʵ��
		if(coolWeatherDB == null){
			coolWeatherDB = new CoolWeatherDB(context);
		}
		return coolWeatherDB;
	}

	public void saveProvince(Province province){
		if(province != null){
			ContentValues values = new ContentValues();
			values.put("province_name",province.getProvinceName());
			values.put("province_code",province.getProvinceCode());
			db.insert("Province",null,values);
		}
	}

	public List<Province> loadProvinces(){		//�����ݿ��ȡȫ�����е�ʡ����Ϣ
		List<Province> list = new ArrayList<Province>();
		Cursor cursor = db.query("Province",null,null,null,null,null,null);
		if(cursor.moveToFirst()){
			do{
				Province province = new Province();
				province.setId(cursor.getInt(cursor.getColumnIndex("id")));
				province.setProvinceName(cursor.getString(cursor.getColumnIndex("province_name")));
				province.setProvinceCode(cursor.getString(cursor.getColumnIndex("province_code")));
				list.add(province);
			}while(cursor.moveToNext());
		}
		return list;
	}

	public void saveCity(City city){		//��Cityʵ���洢�����ݿ�
		if (city != null){
			ContentValues values = new ContentValues();
			values.put("city_name",city.getCityName());
			values.put("city_code",city.getCityCode());
			values.put("province_id",city.getProvinceId());
			db.insert("City",null,values);
		}
	}

	public List<City> loadCities(int provinceId){		//�����ݿ��ȡĳʡ�����еĳ�����Ϣ
		List<City> list = new ArrayList<City>();
		Cursor cursor = db.query("City",null,"province_id = ?",new String[]{String.valueOf(provinceId)},null,null,null);
		if(cursor.moveToFirst()){
			do{
				City city = new City();
				city.setId(cursor.getInt(cursor.getColumnIndex("id")));
				city.setCityName(cursor.getString(cursor.getColumnIndex("city_name")));
				city.setCityCode(cursor.getString(cursor.getColumnIndex("city_code")));
				city.setProvinceId(provinceId);
				list.add(city);
			}while(cursor.moveToNext());
		}
		return list;
	}

	public void saveCounty(County county){		//��Countyʵ���洢�����ݿ�
		if (county != null){
			ContentValues values = new ContentValues();
			values.put("county_name",county.getCountyName());
			values.put("county_code",county.getCountyCode());
			values.put("city_id",county.getCityId());
			db.insert("County",null,values);
		}
	}

	public List<County> loadCounties(int cityId){		//�����ݿ��ȡĳ���������е�����Ϣ
		List<County> list = new ArrayList<County>();
		Cursor cursor = db.query("County",null,"city_id = ?",new String[]{String.valueOf(cityId)},null,null,null);
		if(cursor.moveToFirst()){
			do{
				County county = new County();
				county.setId(cursor.getInt(cursor.getColumnIndex("id")));
				county.setCountyName(cursor.getString(cursor.getColumnIndex("county_name")));
				county.setCountyCode(cursor.getString(cursor.getColumnIndex("county_code")));
				county.setCityId(cityId);
				list.add(county);
			}while(cursor.moveToNext());
		}
		return list;
	}

}