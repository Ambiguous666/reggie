package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.dto.DishDto;
import com.itheima.entity.Dish;

public interface DishService extends IService<Dish> {
    /**
     * 新增菜品，同时保存对应的口味数据
     * @param dishDto
     */
    public void saveWithFlavor(DishDto dishDto);

    /**
     * 根据id查询菜品信息和对应的口味信息
     * @param id
     * @return
     */
    public DishDto getByIdWithFlavor(Long id);

    /**
     * 更新菜品信息，同时更新对应的口味信息
     * @param dishDto
     */
    public void updateWithFlavor(DishDto dishDto);
}
