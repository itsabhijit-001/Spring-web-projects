package org.antwalk.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.antwalk.Model.Car;
import org.springframework.jdbc.core.JdbcTemplate;

public class CarDaoImpl implements CarDao
{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObj;
	public void setDataSource(DataSource ds)
	{
		this.dataSource=ds;
		this.jdbcTemplateObj=new JdbcTemplate(dataSource);
	}
	public void create(String brand,int price)
	{
		String query="Insert into car(brand,price) values(?,?)";
		
		jdbcTemplateObj.update(query,brand,price);
	}
	public List<Car>listCar()
	{
		String query="select * from car";
		List<Car> w=jdbcTemplateObj.query(query,new CarMapper());
		return w;
	}
	
	public void delete(Integer id) {
		  String SQL = "delete from car where id = ?";
		  jdbcTemplateObj.update(SQL, new Object[]{id});
		  System.out.println("Record with ID = " + id+" is deleted." );
		 }
	
	public void update(Integer id, int price) {
		   String SQL = "UPDATE watch SET price = ? WHERE id = ?";
		   jdbcTemplateObj.update(SQL, new Object[]{price, id});
		   System.out.println("Updated Record with EMPID = " + id );
		 }
	
	
}
