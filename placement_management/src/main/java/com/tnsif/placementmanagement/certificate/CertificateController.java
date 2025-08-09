package com.tnsif.placementmanagement.certificate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tnsif.placement.entity.Certificate ;
import com.tnsif.placement.service.CertificateService;

public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @PostMapping
    public Certificate addCertificate(@RequestBody Certificate certificate) {
        return certificateService.saveCertificate(certificate);
    }

    @GetMapping("/{id}")
    public Certificate getCertificateById(@PathVariable Long id) {
        return certificateService.getCertificateById(id);
    }
}
