package com.coolweather.app.model;

public class City {

	private int id;		//表示id
	private String cityName;		//表示城市名
	private String cityCode;		//表示市级代号
	private int provinceId;		//表示City表关联Province表的外键

	public int getId(){		//定义getId()方法
		return id;		//返回id
	}

	public void setId(int id){		//定义setId()方法
		this.id = id;		//设置id
	}

	public String getCityName(){		//定义getCityName()方法
		return cityName;		//返回城市名
	}

	public void setCityName(String cityName){		//定义setCityName()方法
		this.cityName = cityName;		//设置城市名
	}

	public String getCityCode(){		//定义getCityCode()方法
		return cityCode;		//返回市级代号
	}

	public void setCityCode(String cityCode){		//定义setCityCode()方法
		this.cityCode = cityCode;		//设置市级代号
	}

	public int getProvinceId(){		//定义getProvinceId()方法
		return provinceId;		//返回外键
	}

	public void setProvinceId(int provinceId){		//定义setProvinceId()方法
		this.provinceId = provinceId;		//设置外键
	}

}