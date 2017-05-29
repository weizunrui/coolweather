package com.coolweather.app.model;

public class Province {

	private int id;		//表示id
	private String provinceName;		//表示省名
	private String provinceCode;		//表示省级代号

	public int getId(){		//定义getId()方法
		return id;		//返回id
	}

	public void setId(int id){		//定义setId()方法
		this.id = id;		//设置id
	}

	public String getProvinceName(){		//定义getProvinceName()方法
		return provinceName;		//返回省名
	}

	public void setProvinceName(String provinceName){		//定义setProvinceName()方法
		this.provinceName = provinceName;		//设置省名
	}

	public String getProvinceCode(){		//定义getProvinceName()方法
		return provinceCode;		//返回省级代号
	}

	public void setProvinceCode(String provinceCode){		//定义setProvinceCode()方法
		this.provinceCode = provinceCode;		//设置省级代号
	}

}
