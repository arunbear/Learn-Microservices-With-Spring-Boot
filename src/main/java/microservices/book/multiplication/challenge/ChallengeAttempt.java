package microservices.book.multiplication.challenge;

/**
 * Identifies the attempt from a {@link microservices.book.multiplication.User} to solve a challenge
 */
public record ChallengeAttempt(
        Long id,
        Long userId,
        int factorA,
        int factorB,
        int resultAttempt,
        boolean correct
) {
}
