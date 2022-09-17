package service;

import dao.CertificateDao;
import dao.CertificateDaoImpl;
import entities.Certificate;

public class CertificateServiceImpl implements CertificateService{
	private CertificateDao dao;
	
	public CertificateServiceImpl() {
		super();
		dao=new CertificateDaoImpl();
	}

	@Override
	public Certificate addCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		Certificate certificate=dao.searchCertificate(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(int id) {
		Certificate certificate=dao.searchCertificate(id);
				return certificate;
	

	}
	


}
