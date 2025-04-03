package microservices.book.multiplication.challenge;

import microservices.book.multiplication.User;

/**
 * Identifies the attempt from a {@link User} to solve a challenge
 */
public record ChallengeAttempt(
        Long id,
        User userId,
        int factorA,
        int factorB,
        int resultAttempt,
        boolean correct
) {
}
