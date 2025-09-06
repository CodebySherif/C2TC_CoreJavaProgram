package com.tnsif.placement.Controller;

import com.tnsif.placement.entity.Certificate;
import com.tnsif.placement.Service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/certificate")
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @PostMapping
    public Certificate addCertificate(@RequestBody Certificate certificate) {
        return certificateService.saveCertificate(certificate);
    }

    @GetMapping("/{id}")
    public Certificate getCertificateById(@PathVariable long id) {
        return certificateService.getCertificateById(id);
    }
    @GetMapping
    public List<Certificate> getAllCertificates() {
        return certificateService.getAllCertificates();
    }
    
    @DeleteMapping("/{id}")
    public void deleteCertificate(@PathVariable long id) {
		Certificate certificate = certificateService.getCertificateById(id);
		if (certificate != null) {
			certificateService.deleteCertificate(certificate);
		}
	}
    
    @PutMapping("/{id}")
    public Certificate updateCertificate(@PathVariable long id, @RequestBody Certificate certificateDetails) {
		Certificate certificate = certificateService.getCertificateById(id);
		if (certificate != null) {
			certificate.setYear(certificateDetails.getYear());
			certificate.setDescription(certificateDetails.getDescription());
	        certificate.setStudentName(certificateDetails.getStudentName()); // 👈 Add this

			return certificateService.saveCertificate(certificate);
		}
		return null;
	}
}
//