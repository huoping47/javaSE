package gather.demo.map;

import java.util.Objects;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/28 002817:09
 */
public class Student {
	private String name;
	
	public Student ( String name ) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	public void setName ( String name ) {
		this.name = name;
	}
	
	@Override
	public boolean equals ( Object o ) {
		if ( this == o ) return true;
		if ( !( o instanceof Student ) ) return false;
		Student student = ( Student ) o;
		return Objects.equals( getName(), student.getName() );
	}
	
	@Override
	public int hashCode () {
		return Objects.hash( getName() );
	}
	
	@Override
	public String toString () {
		return this.name;
	}
}
