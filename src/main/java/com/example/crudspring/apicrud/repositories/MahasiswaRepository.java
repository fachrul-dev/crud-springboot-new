package com.example.crudspring.apicrud.repositories;

import com.example.crudspring.apicrud.entities.MahasiswaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaRepository extends JpaRepository<MahasiswaEntity,Integer> {


}
