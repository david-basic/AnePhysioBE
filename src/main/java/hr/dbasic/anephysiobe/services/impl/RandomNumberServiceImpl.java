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
    public BigInteger generateRandomBigInteger(Boolean yearIsPrefix, Integer numberOfDigits) {
        Random random = new Random();
        BigInteger minLimit = BigInteger.TEN.pow(numberOfDigits - 1);
        BigInteger maxLimit = BigInteger.TEN.pow(numberOfDigits).subtract(BigInteger.ONE);
        
        BigInteger randomBigInt = new BigInteger(maxLimit.bitLength(), random);
        while (randomBigInt.compareTo(minLimit) < 0) {
            randomBigInt = new BigInteger(maxLimit.bitLength(), random);
        }
        
        if (yearIsPrefix) {
            String str = LocalDate.now().getYear() + String.valueOf(randomBigInt);
            return BigInteger.valueOf(Integer.parseInt(str));
        }
        
        return randomBigInt;
    }
}
