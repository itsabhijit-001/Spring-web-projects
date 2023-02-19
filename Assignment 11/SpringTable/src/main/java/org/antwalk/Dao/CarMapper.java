package org.antwalk.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.antwalk.Model.Car;
import org.springframework.jdbc.core.RowMapper;

public class CarMapper implements RowMapper<Car>
{

	public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
		Car p=new Car();
		p.setId(rs.getInt("id"));
		p.setBrand(rs.getString("brand"));
		p.setPrice(rs.getInt("price"));
		return p;
	}
	
}
