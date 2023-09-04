package com.itheima.common;

public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置id值
     * @param id
     */
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    /**
     * 获取id值
     * @return
     */
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
