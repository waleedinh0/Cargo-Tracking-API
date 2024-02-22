package com.Assignment.API.Services;

import com.Assignment.API.Dao.LoadDao;
import com.Assignment.API.Entity.Load;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadServiceImpl implements LoadService {

    @Autowired
    private LoadDao loadDao;

    @Override
    public List<Load> getLoad() {
        return loadDao.findAll();
    }

    @Override
    public Load getLoadId(int loadId) {
        return this.loadDao.findById(loadId);
    }

    @Override
    public Load addLoad(Load load) {
        loadDao.save(load);
        return load;
    }

    @Override
    public Load updateLoad(Load load) {
        loadDao.save(load);
        return load;
    }

    @Override
    public Load updateLoadId(int loadId) {
        return this.loadDao.findById(loadId);
    }

    public void deleteLoad(Integer parseInteger) {
        Load entity = loadDao.getOne(parseInteger);
        loadDao.delete(entity);
    }
}
