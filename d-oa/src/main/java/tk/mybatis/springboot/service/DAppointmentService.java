package tk.mybatis.springboot.service;

import java.util.List;

import tk.mybatis.springboot.model.DAppointment;
import tk.mybatis.springboot.model.LaytableDate;
import tk.mybatis.springboot.model.countBytime;

/**
 * 说明：
 *
 * @Author: Alan
 * 2018-01-07  16:57:26
 * 星期日
 */
public   interface DAppointmentService {
	/**
	 *  /**
	 * 根据排序，查询所有的患者新消息
	 * @param pageNum
	 * @param pageSize
	 * @param order
	 * @return
	 */
	public List<DAppointment> queryAlldAppointment(int pageNum, int pageSize, String order);

	public List<DAppointment> queryByRolr(LaytableDate date,int did);

	/**
	 * 添加预约
	 * @param dAppointment
	 */
	public Integer  addAppointment(DAppointment  dAppointment);

	/**
	 * 根据ID添加患者的结算金额
	 * @param dPatient
	 * @return
	 */
	public Integer  addMoneyAppointment(DAppointment dPatient);

	/**
	 * 查询回访列表
	 * @param pageNum
	 * @param pageSize
	 * @param order
	 * @return
	 */
	public List<DAppointment> queryAlldBackAppointment(int pageNum, int pageSize, String order,int did);

	public List<DAppointment> queryAlldBackAppointmenttest(LaytableDate date,int did);
	/**
	 * 根据Id和医生Did查询预约
	 * @param dPatient
	 * @return
	 */
	public DAppointment  findApp(DAppointment dPatient);

	public Integer[] getDataByCount(int did);
	public Integer[] getDataByCount2(int did);
	public countBytime countsAllApp(String times ,int did);



}
