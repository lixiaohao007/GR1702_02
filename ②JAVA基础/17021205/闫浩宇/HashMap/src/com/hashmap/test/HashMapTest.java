package com.hashmap.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/** 
 * @author  ���� E-mail:chenglong271406@163.com
 * @date    ����ʱ�䣺2017��12��5�� ����8:23:53 
 * @version 1.0 
 * @function
 */
public class HashMapTest {

	public static void main(String[] args) {
		//HashMap ������ �洢���� ����  ��̬���� ����
		//��ͼ��   ĳ������---->�����ϵ�һ���ط�
		//�绰����һ������---->��Ӧһ���ֻ���
		//     ���֤��--->Ψһ��Ӧ���Լ�
		//ӳ��  key �� ----> value ֵ
		//key�����ظ� value�����ظ�
		//key��value������Ϊ
		//����֪��
		// K ---> key
		// V ---> value
		// K �� V ������������������
		HashMap<Country, String> hashMap = new HashMap<Country, String>();
		
		Country china = new Country("china", 15);
		Country india = new Country("india", 14);
		Country japan = new Country("japan", 2);
		
		//ͨ��put������Map����Ŷ���
		hashMap.put(china, "Beijing");
		hashMap.put(india, "Delhi");
		hashMap.put(japan, "Tokyo");
		
		
		//��ôͬ��key�ҵ�value
		//����,������
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			String value = entry.getValue();
			Country key = entry.getKey();
			System.out.println(key.toString()+""+value);
		}
	
		
	}

}
