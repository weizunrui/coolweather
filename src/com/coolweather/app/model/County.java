package com.coolweather.app.model;

public class County {

	private int id;		//表示id
	private String countyName;		//表示县名
	private String countyCode;		//表示县级代号
	private int cityId;		//表示County表关联City表的外键

	public int getId(){		//定义getId()方法
		return id;		//返回id
	}

	public void setId(int id){		//定义setId()方法
		this.id = id;		//设置id
	}

	public String getCountyName(){		//定义getCountyName()方法
		return countyName;		//返回县名
	}

	public void setCountyName(String countyName){		//定义setCountyName()方法
		this.countyName = countyName;		//设置县名
	}

	public String getCountyCode(){		//定义getCountyCode()方法
		return countyCode;		//返回县级代号
	}

	public void setCountyCode(String countyCode){		//定义setCountyCode()方法
		this.countyCode = countyCode;		//设置县级代号
	}

	public int getCityId(){		//定义getCityId()方法
		return cityId;		//返回外键
	}

	public void setCityId(int cityId){		//定义setCityId()方法
		this.cityId = cityId;		//设置外键
	}
	
}
