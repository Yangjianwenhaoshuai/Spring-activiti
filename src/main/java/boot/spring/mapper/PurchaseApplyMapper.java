package boot.spring.mapper;

import boot.spring.po.PurchaseApply;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurchaseApplyMapper {
	void save(PurchaseApply apply);
	
	PurchaseApply getPurchaseApply(int id);
	
	void updateByPrimaryKeySelective(PurchaseApply apply);
}
