package work.demo.day30.work3;

import gather.demo.map.Student;

import java.util.Comparator;

/**
 * @author ªÙ∆Ω
 * @email huoping_47@126.com
 * @date 2022/5/29 0029
 * @title
 */
public class Students implements Comparable<Students>  {
	String name;
	int age;
	double score;

	public Students () {
	}

	public Students ( String name, int age, double score ) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public int compareTo ( Students o ) {
		if ( this.score ==o.score ){
			return this.age - o.age;
		}
		return ( int ) (this.score-o.score);
	}

	@Override
	public String toString () {
		return "Students{" +
				"name='" + name + '\'' +
				", age=" + age +
				", score=" + score +
				'}';
	}


//	@Override
//	public int compare ( Students o1, Students o2 ) {
//		if ( o1.score ==o2.score ){
//			return o1.age - o2.age;
//		}
//		return ( int ) (o1.score-o2.score);
//	}
}
