package tk.mybatis.springboot.service.imp;

import com.github.pagehelper.PageHelper;
import com.mysql.fabric.xmlrpc.base.Array;
import com.mysql.fabric.xmlrpc.base.Data;

import org.springframework.stereotype.Service;
import tk.mybatis.springboot.mapper.DAppointmentMapper;
import tk.mybatis.springboot.mapper.DPatientMapper;
import tk.mybatis.springboot.model.DAppointment;
import tk.mybatis.springboot.model.DAppointmentExample;
import tk.mybatis.springboot.model.DPatient;
import tk.mybatis.springboot.model.DPatientExample;
import tk.mybatis.springboot.model.LaytableDate;
import tk.mybatis.springboot.service.DAppointmentService;
import tk.mybatis.springboot.service.DPatientService;
import tk.mybatis.springboot.util.DateUtils;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 说明：
 *
 * @Author: Alan
 * 2018-01-07  16:57:26
 * 星期日
 */
@Service
public class DAppointmentServiceImp implements DAppointmentService {
    @Resource
    private DAppointmentMapper dAppointmentMapper;
    
    @Resource
    private DPatientMapper dPatientMapper;


    public List<DAppointment> queryAlldAppointment(int pageNum, int pageSize, String order){
        PageHelper page=new PageHelper();
        page.startPage(pageNum, pageSize);
        List<DAppointment> allByOrder = dAppointmentMapper.findAllByOrder(order,1);
        return  allByOrder;
    }
    public List<DAppointment> queryByRolr(LaytableDate date,int did){

        DAppointmentExample example =new DAppointmentExample();
        DAppointmentExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(date.getOrder());
        if (date.getName().length()>0){
            criteria.andNameLike("%"+date.getName()+"%");
        }
        Date[] parsewithDoa=null;
        if (date.getTimes().length()>0){
        	 parsewithDoa = DateUtils.parsewithDoa(date.getTimes());
        }else{
        	parsewithDoa = DateUtils.parsewithDoaToday();
        }
        criteria.andUptimeBetween(parsewithDoa[0],parsewithDoa[1]);
        String[] erInteger=date.getStatus().split(",");
        List<Integer> woIntegers=new ArrayList<Integer>();
        
        for (String string : erInteger) {
    		woIntegers.add(Integer.parseInt(string));
		}
    	criteria.andUpstatusIn(woIntegers);
        criteria.andStatusNotEqualTo(0);
        criteria.andDidEqualTo(did);

        List<DAppointment> allByOrder = dAppointmentMapper.selectByExample(example);
        return  allByOrder;
    }
    public List<DAppointment> queryAlldBackAppointment(int pageNum, int pageSize, String order,int did){
        PageHelper page=new PageHelper();
        page.startPage(pageNum, pageSize);

        DAppointmentExample example =new DAppointmentExample();
        DAppointmentExample.Criteria criteria = example.createCriteria();
        criteria.andUpstatusEqualTo(2);
        criteria.andStatusNotEqualTo(0);
        criteria.andDidEqualTo(did);
        List<DAppointment> allByOrder = dAppointmentMapper.selectByExample(example);
        return  allByOrder;
    }
    public List<DAppointment> queryAlldBackAppointmenttest(LaytableDate date,int did){
    	DAppointmentExample example =new DAppointmentExample();
    	DAppointmentExample.Criteria criteria = example.createCriteria();
    	criteria.andUpstatusEqualTo(2);
    	criteria.andDidEqualTo(did);
    	example.setOrderByClause(date.getOrder());
    	String[] erInteger=date.getStatus().split(",");
    	List<Integer> woIntegers=new ArrayList<Integer>();
    	for (String string : erInteger) {
    		woIntegers.add(Integer.parseInt(string));
		}
    	
    	 Date[] parsewithDoa=null;
         if (date.getTimes().length()>0){
         	 parsewithDoa = DateUtils.parsewithDoa(date.getTimes());
         }else{
         	parsewithDoa = DateUtils.parsewithDoaToday();
         }
         criteria.andBacktimeBetween(parsewithDoa[0],parsewithDoa[1]);
    	
    	 
    	
    	
    	if (date.getName().length()>0) {
    		criteria.andNameLike("%"+date.getName()+"%");
		}
    	criteria.andBacktypeIn(woIntegers);
    	List<DAppointment> allByOrder = dAppointmentMapper.selectByExample(example);
    	return  allByOrder;
    }

    public Integer  addAppointment(DAppointment dPatient){
    	
    	
    	DPatientExample example =new DPatientExample();
    	DPatientExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(dPatient.getPid());
    	
        int i =-1;
    	List<DPatient> selectByExample = dPatientMapper.selectByExample(example);
    	if (selectByExample.size()>0) {
    		if (selectByExample.get(0).getDid()==dPatient.getDid()) {
    			i = dAppointmentMapper.insertSelective(dPatient);
			}
			
		}
        return  i;
    }

    public Integer  addMoneyAppointment(DAppointment dPatient){
        DAppointmentExample example =new DAppointmentExample();
        DAppointmentExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(dPatient.getId());
        criteria.andDidEqualTo(dPatient.getDid());
        int i = dAppointmentMapper.updateByExampleSelective(dPatient,example);
        return  i;
    }
    public DAppointment  findApp(DAppointment dPatient){
    	DAppointmentExample example =new DAppointmentExample();
    	DAppointmentExample.Criteria criteria = example.createCriteria();
    	criteria.andIdEqualTo(dPatient.getId());
    	criteria.andDidEqualTo(dPatient.getDid());
    	List<DAppointment> selectByExample = dAppointmentMapper.selectByExample(example);
    	if (selectByExample.size()>0) {
    		return  selectByExample.get(0);
		}
    	return  null;
    }
     




}
