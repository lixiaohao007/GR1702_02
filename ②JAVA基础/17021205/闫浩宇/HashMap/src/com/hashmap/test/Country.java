package com.hashmap.test;
/** 
 * @author  ���� E-mail:chenglong271406@163.com
 * @date    ����ʱ�䣺2017��12��5�� ����8:59:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Country {

	String name;
	long population;
	
	
	/**
	 * @param name
	 * @param population
	 */
	public Country(String name, long population) {
		this.name = name;
		this.population = population;
	}


	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}
	
	
}
