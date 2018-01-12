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

    public void  addPatient(DPatient dPatient){
        dPatientMapper.insertSelective(dPatient);
    }
    
    public Integer updatePatient(DPatient dPatient){
    	DPatientExample example=new DPatientExample();
    	Criteria createCriteria = example.createCriteria();
    	createCriteria.andIdEqualTo(dPatient.getId());
    	return dPatientMapper.updateByExampleSelective(dPatient, example);
    }


}
