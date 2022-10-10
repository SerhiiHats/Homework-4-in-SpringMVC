package testcase.services.servisImpl;

import org.springframework.stereotype.Service;
import testcase.services.UUIDService;
import testcase.utils.randomUUID.GenerateUUID;

import java.util.UUID;
@Service
public class UUIDServiceImpl implements UUIDService {

    @Override
    public UUID getRandomUuid() {
        return GenerateUUID.getRandomUuid();
    }
}
