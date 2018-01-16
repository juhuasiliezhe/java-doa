package tk.mybatis.springboot.service;

import tk.mybatis.springboot.model.DPatient;

import java.util.List;

/**
 * 说明：
 *
 * @Author: Alan
 * 2018-01-07  16:57:26
 * 星期日
 */
public   interface  DPatientService {
    /**
     *  /**
     * 根据排序，查询所有的患者新消息
     * @param pageNum
     * @param pageSize
     * @param order
     * @return
     */
    public List<DPatient> queryAllPatient(int did,int pageNum, int pageSize, String order);
	/**
	 * 根据Id查询患者信息；
	 *@param id
	 *@return
	 *
	 *@author Alan 创建于: 2018-1-16 下午1:09:06
	 *
	 */
    public DPatient queryOnePatient( int id);
    /**
     * 添加患者
     * @param dPatient
     */
    public void  addPatient(DPatient dPatient);
    
    /**
     * 更改患者的信息
     *@param dPatient
     *@return
     *
     *@author Alan 创建于: 2018-1-12 上午9:43:28
     *
     */
    public Integer updatePatient(DPatient dPatient,int did);
}
