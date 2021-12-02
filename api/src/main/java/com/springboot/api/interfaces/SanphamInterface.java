package com.springboot.api.interfaces;

import java.util.List;
import java.util.Map;

import com.springboot.api.model.sanpham;



public interface SanphamInterface {
	public  List<Map<String, Object>>listar();
	public List<Map<String, Object>>listarId(int id);
	public int add(sanpham p);
	public int edit(sanpham p);
	public int delete(int id);
}
