package ru.javamentor.predProject9.predProject9.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javamentor.predProject9.predProject9.domain.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
