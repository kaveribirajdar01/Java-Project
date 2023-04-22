package com.nursery.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nursery.Repository.NurseryRepository;
import com.nursery.Service.NurseryService;
import com.nursery.entity.Nursery;

@Repository
public class NurseyServiceImpl implements NurseryService{
	
	@Autowired
	NurseryRepository nurseryRepository;

	@Override
	public Nursery addNursery(Nursery nursery) {
		// TODO Auto-generated method stub
		return nurseryRepository.save(nursery);
	}

	
	@Override
	public List<Nursery> findAllNursery() {
		// TODO Auto-generated method stub
		return nurseryRepository.findAll();
	}

	@Override
	public void deleteNursery(int id) {
		// TODO Auto-generated method stub
		nurseryRepository.deleteById(id);
	}

	@Override
	public Nursery updateNursery(Nursery nursery) {
		// TODO Auto-generated method stub
		Nursery _nursery=nurseryRepository.findById(nursery.getPId()).get();
		_nursery.setPId(nursery.getPId());
		_nursery.setPName(nursery.getPName());
		_nursery.setPrice(nursery.getPrice());
		nurseryRepository.save(_nursery);
		return _nursery;
	}


	@Override
	public List<Nursery> findNurseryById(int id) {
		// TODO Auto-generated method stub
		return nurseryRepository.findNurseryByPId(id);
	}

}
