package com.coolweather.app.model;

public class County {

	private int id;		//��ʾid
	private String countyName;		//��ʾ����
	private String countyCode;		//��ʾ�ؼ�����
	private int cityId;		//��ʾCounty�����City������

	public int getId(){		//����getId()����
		return id;		//����id
	}

	public void setId(int id){		//����setId()����
		this.id = id;		//����id
	}

	public String getCountyName(){		//����getCountyName()����
		return countyName;		//��������
	}

	public void setCountyName(String countyName){		//����setCountyName()����
		this.countyName = countyName;		//��������
	}

	public String getCountyCode(){		//����getCountyCode()����
		return countyCode;		//�����ؼ�����
	}

	public void setCountyCode(String countyCode){		//����setCountyCode()����
		this.countyCode = countyCode;		//�����ؼ�����
	}

	public int getCityId(){		//����getCityId()����
		return cityId;		//�������
	}

	public void setCityId(int cityId){		//����setCityId()����
		this.cityId = cityId;		//�������
	}
	
}
