package hd.spring.boot.web.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import hd.spring.boot.web.model.UserEntity;

public interface UserMapper {

	@Select("select * from users where name=#{name}")
	UserEntity findUser(@Param("name") String name);
}
