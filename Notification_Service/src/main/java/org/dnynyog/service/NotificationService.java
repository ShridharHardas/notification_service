package org.dnynyog.service;

import org.dnynyog.dto.NotificationRequest;
import org.dnynyog.dto.NotificationResponce;

public interface NotificationService {
	
	public NotificationResponce sendNotification(NotificationRequest request);
	
	
}
