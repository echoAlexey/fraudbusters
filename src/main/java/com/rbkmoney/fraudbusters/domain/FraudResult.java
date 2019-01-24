package com.rbkmoney.fraudbusters.domain;

import com.rbkmoney.fraudo.model.FraudModel;
import com.rbkmoney.fraudo.model.ResultModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FraudResult {

    private FraudRequest fraudRequest;
    private ResultModel resultModel;

}
