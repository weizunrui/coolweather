package com.coolweather.app.model;

public class City {

	private int id;		//��ʾid
	private String cityName;		//��ʾ������
	private String cityCode;		//��ʾ�м�����
	private int provinceId;		//��ʾCity�����Province������

	public int getId(){		//����getId()����
		return id;		//����id
	}

	public void setId(int id){		//����setId()����
		this.id = id;		//����id
	}

	public String getCityName(){		//����getCityName()����
		return cityName;		//���س�����
	}

	public void setCityName(String cityName){		//����setCityName()����
		this.cityName = cityName;		//���ó�����
	}

	public String getCityCode(){		//����getCityCode()����
		return cityCode;		//�����м�����
	}

	public void setCityCode(String cityCode){		//����setCityCode()����
		this.cityCode = cityCode;		//�����м�����
	}

	public int getProvinceId(){		//����getProvinceId()����
		return provinceId;		//�������
	}

	public void setProvinceId(int provinceId){		//����setProvinceId()����
		this.provinceId = provinceId;		//�������
	}

}