package tk.mybatis.springboot.service.imp;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.mapper.DAppointmentMapper;
import tk.mybatis.springboot.mapper.DPatientMapper;
import tk.mybatis.springboot.model.DAppointment;
import tk.mybatis.springboot.model.DAppointmentExample;
import tk.mybatis.springboot.model.DPatient;
import tk.mybatis.springboot.service.DAppointmentService;
import tk.mybatis.springboot.service.DPatientService;
import tk.mybatis.springboot.util.DateUtils;

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
public class DAppointmentServiceImp implements DAppointmentService {
    @Resource
    private DAppointmentMapper dAppointmentMapper;


    public List<DAppointment> queryAlldAppointment(int pageNum, int pageSize, String order){
        PageHelper page=new PageHelper();
        page.startPage(pageNum, pageSize);
        List<DAppointment> allByOrder = dAppointmentMapper.findAllByOrder(order,1);
        return  allByOrder;
    }
    public List<DAppointment> queryByRolr(int pageNum, int pageSize, String order,String name,String time,int did){
        PageHelper page=new PageHelper();
        page.startPage(pageNum, pageSize);

        DAppointmentExample example =new DAppointmentExample();
        DAppointmentExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(order);
        if (!"".equals(name)&&!"null".equals(name)){
            criteria.andNameLike("%"+name+"%");
        }
        if (time!=null){
            criteria.andApptimeLike("%"+time+"%");
        }else{
            criteria.andApptimeLike("%"+ DateUtils.getNowTime2()+"%");
        }
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

    public Integer  addAppointment(DAppointment dPatient){

        int i = dAppointmentMapper.insertSelective(dPatient);
        return  i;
    }

    public Integer  addMoneyAppointment(DAppointment dPatient){
        DAppointmentExample example =new DAppointmentExample();
        DAppointmentExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(dPatient.getId());
        int i = dAppointmentMapper.updateByExampleSelective(dPatient,example);
        return  i;
    }
     




}
