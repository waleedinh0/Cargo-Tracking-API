package com.Assignment.API.Services;

import com.Assignment.API.Entity.Load;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LoadService {

    public List<Load> getLoad();

    public Load getLoadId(int loadId);

    public Load addLoad(Load load);

    public Load updateLoad(Load load);

    public Load updateLoadId(int loadId);

    public void deleteLoad(Integer loadId);
}

