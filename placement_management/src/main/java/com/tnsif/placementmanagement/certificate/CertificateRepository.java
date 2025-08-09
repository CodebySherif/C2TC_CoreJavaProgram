package com.tnsif.placementmanagement.certificate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.placement.entity.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
}