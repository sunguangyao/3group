package com.itheima.dao;

import com.itheima.domain.Maven;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface Servicesdao {
    @Select("select * from items where id = #{id}")
    public Maven findybid(Integer s);
}
