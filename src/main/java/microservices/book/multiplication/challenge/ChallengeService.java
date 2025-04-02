package microservices.book.multiplication.challenge;

public interface ChallengeService {
    /**
     * Create a random challenge.
     *
     * @return a randomly generated challenge with factors between 11 and 99
     */
    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt);
}
