package com.groupthree.lms.repositories.courseRepository;

import com.groupthree.lms.models.courseModel.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {
}
