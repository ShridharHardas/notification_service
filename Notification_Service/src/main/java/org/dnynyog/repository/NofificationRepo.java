package org.dnynyog.repository;

import org.dnynyog.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NofificationRepo extends JpaRepository<Notification, Long>{

}
 