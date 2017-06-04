package com.epam.ration.dao;

import com.epam.ration.entity.Ration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RationRepository extends JpaRepository<Ration, Long>{
}
