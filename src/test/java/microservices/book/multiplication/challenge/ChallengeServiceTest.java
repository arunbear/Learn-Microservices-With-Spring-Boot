package microservices.book.multiplication.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class ChallengeServiceTest {

    ChallengeService challengeService;

    @BeforeEach
    void setUp() {
        challengeService = new ChallengeServiceImpl();
    }

    @Test
    void canVerifyCorrectAttempt() {
        // given
        var attemptDTO = new ChallengeAttemptDTO(50, 60, "john_doe", 3000);

        // when
        var challengeAttempt = challengeService.verifyAttempt(attemptDTO);

        then(challengeAttempt.correct()).isTrue();
    }

    @Test
    void canVerifyIncorrectAttempt() {
        // given
        var attemptDTO = new ChallengeAttemptDTO(50, 60, "john_doe", 5000);

        // when
        var challengeAttempt = challengeService.verifyAttempt(attemptDTO);

        then(challengeAttempt.correct()).isTrue();
    }
}