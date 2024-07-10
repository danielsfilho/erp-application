package com.app.erp_webapp.ModuloFiscal.controllers;


import com.app.erp_webapp.ModuloFiscal.models.FiscalObligation;
import com.app.erp_webapp.ModuloFiscal.services.FiscalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/modulo-fiscal")
public class FiscalObligationController {
    private final FiscalService service;

    public FiscalObligationController(FiscalService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<FiscalObligation> save(@RequestBody FiscalObligation fiscalObligation) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.create(fiscalObligation));
    }
}
