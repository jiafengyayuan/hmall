package com.hema.trade.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.hema.trade.domain.po.OrderDetail;
import com.hema.trade.mapper.OrderDetailMapper;
import com.hema.trade.service.IOrderDetailService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单详情表 服务实现类
 * </p>
 *
 * @author 虎哥
 * @since 2023-05-05
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements IOrderDetailService {

}
