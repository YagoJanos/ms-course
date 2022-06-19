package com.github.yagojanos.cloud.repositories;

import com.github.yagojanos.cloud.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
