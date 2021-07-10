package com.assembly.demo.repositories

import com.assembly.demo.models.Demo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DemoRepository extends JpaRepository<Demo, Integer> {}