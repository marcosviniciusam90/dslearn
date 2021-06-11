package com.devsuperior.dslearnbds.mappers;

import com.devsuperior.dslearnbds.dto.NotificationDTO;
import com.devsuperior.dslearnbds.entities.Notification;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NotificationMapper {

    NotificationMapper INSTANCE = Mappers.getMapper(NotificationMapper.class);

    Notification dtoToEntity(NotificationDTO dto);

    @Mapping(source = "user.id", target = "userId")
    NotificationDTO entityToDTO(Notification entity);
}
