package com.dams.api.v1.mapper;

import com.dams.domain.Category;
import com.dams.api.v1.model.CategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by jt on 9/25/17.
 */
@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);


    CategoryDTO categoryToCategoryDTO(Category category);
}
