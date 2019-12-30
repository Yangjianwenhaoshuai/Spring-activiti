package boot.spring.mapper;

import java.util.List;

import boot.spring.po.Permission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PermissionMapper {
	List<Permission> getPermissions();
	Permission getPermissionByname(String permissionname);
	void addpermission(String permissionname);
	void deletepermission(int pid);
	void deleteRole_permission(int permissionid);
}
