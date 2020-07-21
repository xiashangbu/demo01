package com.itheima.ssm.dao;

import com.itheima.ssm.domin.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {

    @Select("select * from product")
    public List<Product> findAll();
}
