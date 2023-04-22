package com.nursery.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nursery.entity.Nursery;

public interface NurseryRepository extends JpaRepository<Nursery,Integer>{

	public List<Nursery> findNurseryByPId(int id);
}
