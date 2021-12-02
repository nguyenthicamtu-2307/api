package com.springboot.api.DAO;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springboot.api.interfaces.SanphamInterface;
import com.springboot.api.model.sanpham;
@Service
@Repository
public class SanphamDao implements SanphamInterface{
	@Autowired
	JdbcTemplate template;
	//lấy tất cả sản phẩm có trong list sản phẩm của data
	@Override
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = template.queryForList("select * from sanpham");
		return list;
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		
		return null;
	}
//them san phẩm vào data
	@Override
	public int add(sanpham p) {
		// TODO Auto-generated method stub
		String sql="insert into sanpham(idsp,tensp,soluong,giasp,chitiet,hinhanh,iddm,idkm) values(?,?,?,?,?,?,?,?)";
		
		return template.update(sql,p.getIdsp(),p.getTensp(),p.getSoluong(),p.getGiasp(),p.getChitiet(),p.getHinhanh(),p.getIddm(),p.getIdkm() );
	}

	@Override
	public int edit(sanpham p) {
		// TODO Auto-generated method stub
		String sql="update sanpham set tensp=?,soluong=?,giasp=?,chitiet=?,hinhanh=?,iddm=?,idkm=? where idsp=?";
		
		return template.update(sql, p.getTensp(),p.getSoluong(),p.getGiasp(),p.getChitiet(),p.getHinhanh(),p.getIddm(),p.getIdkm(),p.getIdsp());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql="delete * from sanpham where idsp=?";
		return template.update(sql, id);
	}

}
