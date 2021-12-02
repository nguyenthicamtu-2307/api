package com.springboot.api.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.springboot.api.interfaces.SanphamInterface;
import com.springboot.api.model.sanpham;
@Service
public class sanphamservice implements SanphamInterface{

	@Override
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(sanpham p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int edit(sanpham p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
