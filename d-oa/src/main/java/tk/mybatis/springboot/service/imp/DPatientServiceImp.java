package tk.mybatis.springboot.service.imp;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.mapper.DPatientMapper;
import tk.mybatis.springboot.model.DPatient;
import tk.mybatis.springboot.model.DPatientExample;
import tk.mybatis.springboot.model.DPatientExample.Criteria;
import tk.mybatis.springboot.service.DPatientService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 说明：
 *
 * @Author: Alan
 * 2018-01-07  16:57:26
 * 星期日
 */
@Service
public class DPatientServiceImp  implements DPatientService{
    @Resource
    private DPatientMapper dPatientMapper;


    public List<DPatient> queryAllPatient( int did,int pageNum,int pageSize,String order){
        PageHelper page=new PageHelper();
        page.startPage(pageNum, pageSize);
        List<DPatient> allByOrder = dPatientMapper.findAllByOrder(order,did);
        return  allByOrder;
    }
    public DPatient queryOnePatient( int id){
    	DPatientExample example=new DPatientExample();
    	Criteria createCriteria = example.createCriteria();
    	createCriteria.andIdEqualTo(id);
    	List<DPatient> allByOrder = dPatientMapper.selectByExample(example);
    	return  allByOrder.get(0);
    }

    public void  addPatient(DPatient dPatient){
        dPatientMapper.insertSelective(dPatient);
    }
    
    
    
    
    public Integer updatePatient(DPatient dPatient,int did){
    	DPatientExample example1=new DPatientExample();
    	Criteria createCriteria1 = example1.createCriteria();
    	createCriteria1.andIdEqualTo(dPatient.getId());
    	createCriteria1.andDidEqualTo(did);
    	List<DPatient> selectByExample = dPatientMapper.selectByExample(example1);
    	if (selectByExample.size()>0) {
    		DPatientExample example=new DPatientExample();
        	Criteria createCriteria = example.createCriteria();
        	createCriteria.andIdEqualTo(dPatient.getId());
        	return dPatientMapper.updateByExampleSelective(dPatient, example);
    		
			
		}
    	
    	return -1;
    }


}
