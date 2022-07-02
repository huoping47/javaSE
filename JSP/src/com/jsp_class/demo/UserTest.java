package com.jsp_class.demo;

import java.util.Objects;

/**
 * @author 霍平
 * @date 2022/6/26 9:07
 * @mouse 六月
 */

public class UserTest {
	private String name;
	private String sex;
	private int age;

	@Override
	public String toString() {
		return "UserTest{" +
					   "name='" + name + '\'' +
					   ", sex='" + sex + '\'' +
					   ", age=" + age +
					   '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserTest userTest = (UserTest) o;
		return age == userTest.age && Objects.equals(name, userTest.name) && Objects.equals(sex, userTest.sex);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sex, age);
	}

	public UserTest() {
	}

	public UserTest(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
