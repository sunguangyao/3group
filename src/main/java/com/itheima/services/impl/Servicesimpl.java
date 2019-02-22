package com.itheima.services.impl;

import com.itheima.dao.Servicesdao;
import com.itheima.domain.Maven;
import com.itheima.services.Sevivces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Servicesimpl implements Sevivces {
    @Autowired
    private Servicesdao dao ;
    public Maven findybid(Integer s) {
        Maven findybid = dao.findybid(s);
        return findybid;
    }
}
