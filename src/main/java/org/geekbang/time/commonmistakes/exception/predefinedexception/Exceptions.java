package org.geekbang.time.commonmistakes.exception.predefinedexception;

public class Exceptions {

    // 错误  这个是变量 每次调用  都还是原来的值
    public static BusinessException ORDEREXISTS = new BusinessException("订单已经存在", 3001);
    // 正确   这是 方法 ， 每次调用都会新建一个对象
    public static BusinessException orderExists() {
        return new BusinessException("订单已经存在", 3001);
    }
}
