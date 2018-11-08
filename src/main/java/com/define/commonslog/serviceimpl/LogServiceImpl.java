package com.define.commonslog.serviceimpl;

import com.define.commons.common.dto.LogDO;
import com.define.commons.common.utils.Query;
import com.define.commonslog.dao.LogDao;
import com.define.commonslog.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    LogDao logDao;

    @Async
    @Override
    public int save(LogDO logDO) {
        return logDao.save(logDO);
    }

    @Override
    public List<LogDO> queryList(Query query) {
        List<LogDO> logs = logDao.list(query);
        return logs;
    }

    @Override
    public int count(Query query) {
        return logDao.count(query);
    }

    @Override
    public int remove(Long id) {
        int count = logDao.remove(id);
        return count;
    }

    @Override
    public int batchRemove(Long[] ids) {
        return logDao.batchRemove(ids);
    }
}
