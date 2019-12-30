package boot.spring.mapper;

import boot.spring.po.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
	User getpwdbyname(String name);
}
