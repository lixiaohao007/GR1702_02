package com.hashmap.test;
/** 
 * @author  作者 E-mail:chenglong271406@163.com
 * @date    创建时间：2017年12月5日 上午8:59:19 
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
