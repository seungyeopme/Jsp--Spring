package co.soft.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import co.soft.beans.Data1;

public interface Mapping {

	@Insert("insert into spring(s1, s2, s3) values (#{s1}, #{s2}, #{s3})")
	void in_data(Data1 d1);
	
	@Select("select s1, s2, s3 from spring")
	List<Data1> sel_data();
	
	
}
