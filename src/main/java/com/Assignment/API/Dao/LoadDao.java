package com.Assignment.API.Dao;

import com.Assignment.API.Entity.Load;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.Integer;

public interface LoadDao extends JpaRepository<Load, Integer> {
    public Load findById(int id);

}
