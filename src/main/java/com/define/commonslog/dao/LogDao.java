package com.define.commonslog.dao;

import com.define.commons.common.dto.LogDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 系统日志
 * @author songzhonghui
 * @email 2835966468@qq.com
 * @date 2018-10-07 15:45:42
 */
@Mapper
public interface LogDao {

	LogDO get(Long id);
	
	List<LogDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);
	
	int save(LogDO log);
	
	int update(LogDO log);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
