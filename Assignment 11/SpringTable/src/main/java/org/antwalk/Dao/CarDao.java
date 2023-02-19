package org.antwalk.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.antwalk.Model.Car;

public interface CarDao 
{
	public void setDataSource(DataSource ds);
	public void create(String brand,int price);
	public List<Car>listCar();
	public void delete(Integer id);
	public void update(Integer id, int price);
}
