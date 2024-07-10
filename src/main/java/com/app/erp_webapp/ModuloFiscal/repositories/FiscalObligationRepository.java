package com.app.erp_webapp.ModuloFiscal.repositories;

import com.app.erp_webapp.ModuloFiscal.models.FiscalObligation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiscalObligationRepository extends JpaRepository<FiscalObligation, Long> {
}
