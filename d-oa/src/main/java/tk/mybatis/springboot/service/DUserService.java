package tk.mybatis.springboot.service;

import tk.mybatis.springboot.model.DUser;

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
    
    /**
     * 根据用户ID修改用户信息
     *@param name
     *@param percent
     *@param uid
     *@return
     *
     *@author Alan 创建于: 2018-1-17 下午3:46:29
     *
     */
    public DUser updateDuser(String name,String percent,int uid);
    /**
     * 修改密码
     *@param data2
     *@param uid
     *@return
     *
     *@author Alan 创建于: 2018-1-17 下午4:05:34
     *
     */
    public DUser updateDuser(String data2,int uid);



}
