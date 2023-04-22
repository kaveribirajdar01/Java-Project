package com.nursery.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nursery.entity.Nursery;

@Service
public interface NurseryService {

	public Nursery addNursery(Nursery nursery);
	public List<Nursery> findNurseryById(int id);
	public List<Nursery> findAllNursery();
	public void deleteNursery(int id);
	public Nursery updateNursery(Nursery nursery);
}
