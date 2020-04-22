package com.chj.dubbo;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.cluster.LoadBalance;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/3/8 17:12
 * @params :
 */
public class DemoLoadBalance implements LoadBalance {
    /** 方法描述
    * @Description: 继承LoadBalance可以重写负载均衡方法
     * invokers     所有服务Provider列表
     * url          配置信息
     * invocation   RPC调用信息
    * @Param: [invokers, url, invocation]
    * @return: com.alibaba.dubbo.rpc.Invoker<T>
    * @Author: chj
    * @Date: 2020/3/8
    */

    @Override
    public <T> Invoker<T> select(List<Invoker<T>> invokers, URL url, Invocation invocation) throws RpcException {
        return null;
    }
}
