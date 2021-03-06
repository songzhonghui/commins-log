package com.define.commonslog.service;

import com.define.commons.common.dto.LogDO;
import com.define.commons.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统日志
 * @author songzhonghui
 * @email 2835966468@qq.com
 * @date 2018-10-07 15:45:42
 */
@Service
public interface LogService {
    int save(LogDO logDO);

    List<LogDO> queryList(Query query);

    int count(Query query);

    int remove(Long id);

    int batchRemove(Long[] ids);
}
