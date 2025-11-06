package ch.usi.inf.confidentialstorm.enclave;

import ch.usi.inf.confidentialstorm.common.BoltService;
import com.google.auto.service.AutoService;

@AutoService(BoltService.class)
public class BoltServiceImpl implements BoltService {

    @Override
    public void confidentialExecute(String field, int value) {
        // NOP (for now!)
    }
}
