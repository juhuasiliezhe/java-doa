package tk.mybatis.springboot.service;

import tk.mybatis.springboot.model.DPatient;
import tk.mybatis.springboot.model.DUser;

import java.util.List;

/**
 * 说明：
 *
 * @Author: Alan
 * 2018-01-07  16:57:26
 * 星期日
 */
public   interface DUserService {
    public DUser uplogin(DUser dUser);

    public Integer uplogin(String username);



}
