package com.xun.kuaida.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.xun.kuaida.model.dto.AppQueryRequest;
import com.xun.kuaida.model.entity.App;
import com.xun.kuaida.model.vo.AppVO;

import java.util.List;

/**
 * 应用 服务层。
 *
 */
public interface AppService extends IService<App> {

    AppVO getAppVO(App app);

    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    List<AppVO> getAppVOList(List<App> appList);
}
