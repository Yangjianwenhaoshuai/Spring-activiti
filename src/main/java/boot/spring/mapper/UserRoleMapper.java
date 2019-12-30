package boot.spring.mapper;

import java.util.List;

import boot.spring.po.UserRole;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer urid);

    int insert(UserRole record);

    UserRole selectByPrimaryKey(Integer urid);

    int updateByPrimaryKeySelective(UserRole record);

    List<UserRole> listUserRoleByUid(int uid);
}