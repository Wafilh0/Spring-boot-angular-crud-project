package io.github.Wafilh0.DeskHelp.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.github.Wafilh0.DeskHelp.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);	
}
