package ch.usi.inf.confidentialstorm.common;

import org.apache.teaclave.javasdk.common.annotations.EnclaveService;

public interface BoltService {
    void confidentialExecute(String field, int value);
}