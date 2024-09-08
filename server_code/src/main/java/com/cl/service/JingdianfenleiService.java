package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JingdianfenleiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JingdianfenleiView;


/**
 * 景点分类
 *
 * @author 
 * @email 
 * @date 2024-04-23 14:27:00
 */
public interface JingdianfenleiService extends IService<JingdianfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingdianfenleiView> selectListView(Wrapper<JingdianfenleiEntity> wrapper);
   	
   	JingdianfenleiView selectView(@Param("ew") Wrapper<JingdianfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingdianfenleiEntity> wrapper);
   	

}

