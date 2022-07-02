package work.demo.day30.work2;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author ��ƽ
 * @email huoping_47@126.com
 * @date 2022/5/29 0029
 * @title   ��֪������һ��QQ���룬QQ�����Ϊ11λ��
 * ���Ϊ5λString[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}��
 * �����������������qq�Ŷ������LinkedList�У���list���ظ�Ԫ��ɾ����
 * ��list������Ԫ�طֱ��õ���������ǿforѭ����ӡ������
 */
public class Work02 {
	public static void main ( String[] args ) {
		String[] strings = {"13579","246810","147963","963741","13579","246810","159753"};
		LinkedList< String > list = new LinkedList<>( ) ;
		//ʹ��forѭ���������
		for ( int i = 0; i < strings.length; i++ ) {
			list.add( strings[i] );
		}
		//����set����ɾ���ظ���Ԫ��
		Set<String> set = new HashSet<>(list);
		LinkedList<String> strings1 = new LinkedList<>(set);
		//ʹ��foreachѭ����������
		for ( String s1:strings1 ){
			System.out.println(s1);
		}
		System.out.println("============");
		Iterator<String>iterator = strings1.iterator();
		while ( iterator.hasNext() ){
			Object o = iterator.next();
			System.out.println(o);
		}
	}
}
