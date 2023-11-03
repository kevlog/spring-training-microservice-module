package com.metrodataacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metrodataacademy.domain.entity.Advertisement;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, String> {

}
