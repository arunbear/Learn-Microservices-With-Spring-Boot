package microservices.book.multiplication.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class ChallengeGeneratorServiceTest {

    private ChallengeGeneratorService challengeGeneratorService;

    @Mock
    private Random random;

    @BeforeEach
    void setUp() {
        challengeGeneratorService = new ChallengeGeneratorServiceImpl(random);
    }

    @Test
    void generatedRandomFactorIsBetweenExpectedLimits() {
        // To generate numbers between 11 and 99,
        // get a random number between 0 and 88 and add 11
        final int offset = 11;

        final int randomA = 20;
        final int randomB = 30;
        given(random.nextInt(89)).willReturn(randomA, randomB);

        // when
        Challenge challenge = challengeGeneratorService.randomChallenge();

        then(challenge).isEqualTo(new Challenge(randomA + offset, randomB + offset));
    }
}