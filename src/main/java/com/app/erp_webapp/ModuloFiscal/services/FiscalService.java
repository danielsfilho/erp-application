package com.app.erp_webapp.ModuloFiscal.services;


import com.app.erp_webapp.ModuloFiscal.models.FiscalObligation;
import com.app.erp_webapp.ModuloFiscal.repositories.FiscalObligationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FiscalService {
    private final FiscalObligationRepository repository;

    public FiscalService(FiscalObligationRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public FiscalObligation create(FiscalObligation body) {
        return this.repository.save(body);
    }
}
