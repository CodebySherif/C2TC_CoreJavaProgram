package com.tnsif.placementmanagement.certificate;

public class CertificateService {
	 @Autowired
	    private CertificateRepository certificateRepository;

	    public Certificate saveCertificate(Certificate certificate) {
	        return certificateRepository.save(certificate);
	    }

	    public List<Certificate> getAllCertificates() {
	        return certificateRepository.findAll();
	    }

	    public Certificate getCertificateById(Long id) {
	        return certificateRepository.findById(id).orElse(null);
	    }

	    public void deleteCertificate(Long id) {
	        certificateRepository.deleteById(id);
	    }
}
