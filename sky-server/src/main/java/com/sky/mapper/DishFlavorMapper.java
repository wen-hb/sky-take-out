package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {
    /**
     * 批量添加口味
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);

    /**
     * 根据菜品id删除口味数据
     * @param id
     */
    @Delete("delete from sky_take_out.dish_flavor where dish_id=#{id}")
    void deleteByDishId(Long id);

    /**
     * 批量删除口味数据
     * @param ids
     */
    void deleteByDishIds(List<Long> ids);

    /**
     * 根据id查询菜品相应的id
     * @param id
     * @return
     */
    @Select("select *from sky_take_out.dish_flavor where dish_id=#{id}")
    List<DishFlavor> getById(Long id);
}
