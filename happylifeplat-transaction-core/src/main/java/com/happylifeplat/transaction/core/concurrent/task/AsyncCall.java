package com.happylifeplat.transaction.core.concurrent.task;

/**
 * <p>Description: .</p>
 * <p>Company: 深圳市旺生活互联网科技有限公司</p>
 * <p>Copyright: 2015-2017 happylifeplat.com All Rights Reserved</p>
 * task 回调接口
 *
 * @author yu.xiao@happylifeplat.com
 * @version 1.0
 * @date 2017/7/20 18:10
 * @since JDK 1.8
 */
@FunctionalInterface
public interface AsyncCall {

    /**
     * 回调处理
     *
     * @param objects 参数
     * @return Object
     * @throws Throwable 异常
     */
    Object callBack(Object... objects) throws Throwable;
}
