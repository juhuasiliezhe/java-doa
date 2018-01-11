package tk.mybatis.springboot.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.springboot.model.DAppointment;
import tk.mybatis.springboot.model.DPatient;
import tk.mybatis.springboot.util.MyMapper;

import java.util.List;

public interface DAppointmentMapper  extends MyMapper<DAppointment> {

    @Select("SELECT * FROM d_appointment where 1=1 and status!=0 and did = #{did}   order by   #{myorder}")
    @ResultType(DAppointment.class)
    List<DAppointment> findAllByOrder(@Param("myorder") String myorder,@Param("did") Integer did);


}