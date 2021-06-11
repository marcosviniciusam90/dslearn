package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.dto.NotificationDTO;
import com.devsuperior.dslearnbds.entities.Notification;
import com.devsuperior.dslearnbds.entities.User;
import com.devsuperior.dslearnbds.mappers.NotificationMapper;
import com.devsuperior.dslearnbds.repositories.NotificationRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class NotificationService {

    private static final NotificationMapper NOTIFICATION_MAPPER = NotificationMapper.INSTANCE;
    private final NotificationRepository repository;
    private final AuthService authService;

    @Transactional(readOnly = true)
    public Page<NotificationDTO> findNotificationsForCurrentUser(Pageable pageable) {
        User user = authService.getAuthenticatedUser();
        Page<Notification> page = repository.findByUser(user, pageable);
        return page.map(NOTIFICATION_MAPPER::entityToDTO);
    }

}
