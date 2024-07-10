package com.app.erp_webapp.ModuloFiscal.models;


import com.app.erp_webapp.ModuloFiscal.enums.ObligationStatusEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "observacao_fiscal_tb")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class FiscalObligation {

    private Long id;
    private String taxType;
    private BigDecimal baseDeCalculo;
    private BigDecimal valorDevido;
    private LocalDate prazoDePagamento;
    private ObligationStatusEnum status;
}
