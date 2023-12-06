package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.services.RandomNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class RandomNumberServiceImpl implements RandomNumberService {
    @Override
    public BigInteger generateRandomBigInteger() {
        Random random = new Random();
        BigInteger minLimit = BigInteger.TEN.pow(4);
        BigInteger maxLimit = BigInteger.TEN.pow(5).subtract(BigInteger.ONE);
        
        BigInteger randomBigInt = new BigInteger(maxLimit.bitLength(), random);
        while (randomBigInt.compareTo(minLimit) < 0) {
            randomBigInt = new BigInteger(maxLimit.bitLength(), random);
        }
        
        String str = LocalDate.now().getYear() + String.valueOf(randomBigInt);
        
        return BigInteger.valueOf(Integer.parseInt(str));
    }
}
