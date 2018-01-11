package tk.mybatis.springboot.service.imp;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.mapper.DAppointmentMapper;
import tk.mybatis.springboot.mapper.DUserMapper;
import tk.mybatis.springboot.model.DAppointment;
import tk.mybatis.springboot.model.DAppointmentExample;
import tk.mybatis.springboot.model.DUser;
import tk.mybatis.springboot.model.DUserExample;
import tk.mybatis.springboot.service.DAppointmentService;
import tk.mybatis.springboot.service.DUserService;

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
public class DuserServiceImp implements DUserService {
    @Resource
    private DUserMapper dUserMapper;




    public DUser uplogin(DUser dUser){
        DUserExample example =new DUserExample();
        DUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(dUser.getUsername());
        criteria.andPasswordEqualTo(dUser.getPassword());
        criteria.andStatusNotEqualTo(0);
        List<DUser> dUsers = dUserMapper.selectByExample(example);
         
        return dUsers.get(0);
    }
    public Integer uplogin(String username){
        DUserExample example =new DUserExample();
        DUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andStatusNotEqualTo(0);
        List<DUser> dUsers = dUserMapper.selectByExample(example);
        if (dUsers.size()>0){
            return 1;
        }
        return 0;
    }





}
