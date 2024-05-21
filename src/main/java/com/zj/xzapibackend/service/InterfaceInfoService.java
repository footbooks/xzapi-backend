package com.zj.xzapibackend.service;

import com.zj.xzapibackend.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 86199
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-05-21 21:17:11
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
