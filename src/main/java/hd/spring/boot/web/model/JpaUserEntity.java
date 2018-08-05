package hd.spring.boot.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "users")
public class JpaUserEntity {

	@Id
	@GeneratedValue
	private Integer	id;

	@Column
	private String	name;

	@Column
	private Integer	age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "id = " + id + ", name = " + name + ", age = " + age;
	}
}
