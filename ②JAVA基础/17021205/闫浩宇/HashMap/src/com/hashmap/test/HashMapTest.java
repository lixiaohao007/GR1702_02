package com.hashmap.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/** 
 * @author  作者 E-mail:chenglong271406@163.com
 * @date    创建时间：2017年12月5日 上午8:23:53 
 * @version 1.0 
 * @function
 */
public class HashMapTest {

	public static void main(String[] args) {
		//HashMap 集合类 存储对象 容器  动态长度 扩容
		//地图，   某个坐标---->地球上的一个地方
		//电话本，一个名字---->对应一个手机号
		//     身份证号--->唯一对应你自己
		//映射  key 键 ----> value 值
		//key不能重复 value可以重复
		//key和value都可以为
		//见名知意
		// K ---> key
		// V ---> value
		// K 和 V 必须是引用数据类型
		HashMap<Country, String> hashMap = new HashMap<Country, String>();
		
		Country china = new Country("china", 15);
		Country india = new Country("india", 14);
		Country japan = new Country("japan", 2);
		
		//通过put方法往Map里面放对象
		hashMap.put(china, "Beijing");
		hashMap.put(india, "Delhi");
		hashMap.put(japan, "Tokyo");
		
		
		//怎么同键key找到value
		//遍历,迭代器
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			String value = entry.getValue();
			Country key = entry.getKey();
			System.out.println(key.toString()+""+value);
		}
	
		
	}

}
