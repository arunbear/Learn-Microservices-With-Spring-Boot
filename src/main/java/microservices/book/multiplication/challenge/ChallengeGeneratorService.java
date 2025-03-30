package microservices.book.multiplication.challenge;

public interface ChallengeGeneratorService {
    /**
     * Create a random challenge.
     *
     * @return a randomly generated challenge with factors between 11 and 99
     */
    Challenge randomChallenge();
}
