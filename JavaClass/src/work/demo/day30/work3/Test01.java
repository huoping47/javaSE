package work.demo.day30.work3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author ��ƽ
 * @email huoping_47@126.com
 * @date 2022/5/29 0029
 * @title   �ֱ���Comparable��Comparator�����ӿڶ�������λͬѧ�ĳɼ�����������
 * ����ɼ�һ����
 * ���ڳɼ�����Ļ����ϰ���������С��������
 * ������String�����䣨int��������float��
 * liusan			20				90.0F
 * lisi				22				90.0F
 * wangwu			20				99.0F
 * sunliu			22				100.0F
 * ��дһ��Student������ʵ��Comparable<Student>�ӿ�,����������дCompareTo(Student o)������
 * ����������ʹ��Comparable �� Comparetor�ֱ��ArrayList��������.
 */
public class Test01 {
	public static void main ( String[] args ) {
		Students students = new Students("zhangsan ",18,90.8);
		Students students1 = new Students("lisi ",24,68.8);
		Students students2 = new Students("wangwu ",21,78);
		Students students3 = new Students("laoliu ",19,68.8);
//		ArrayList<Students> arrayList = new ArrayList<>();
		ArrayList<Students> arrayList = new ArrayList<>();
		arrayList.add( students );
		arrayList.add( students1 );
		arrayList.add( students2 );
		arrayList.add( students3 );
		
		//ʹ��Comparable��������
		Collections.sort( arrayList );
		
		for ( Students s:arrayList ){
			System.out.println(s);
		}
	}
}
