package boot.spring.mapper;

import boot.spring.po.LeaveApply;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LeaveApplyMapper {
	void save(LeaveApply apply);

	LeaveApply getLeaveApply(int id);

	int updateByPrimaryKey(LeaveApply record);
}
