package com.coolweather.app.model;

public class Province {

	private int id;		//��ʾid
	private String provinceName;		//��ʾʡ��
	private String provinceCode;		//��ʾʡ������

	public int getId(){		//����getId()����
		return id;		//����id
	}

	public void setId(int id){		//����setId()����
		this.id = id;		//����id
	}

	public String getProvinceName(){		//����getProvinceName()����
		return provinceName;		//����ʡ��
	}

	public void setProvinceName(String provinceName){		//����setProvinceName()����
		this.provinceName = provinceName;		//����ʡ��
	}

	public String getProvinceCode(){		//����getProvinceName()����
		return provinceCode;		//����ʡ������
	}

	public void setProvinceCode(String provinceCode){		//����setProvinceCode()����
		this.provinceCode = provinceCode;		//����ʡ������
	}

}
