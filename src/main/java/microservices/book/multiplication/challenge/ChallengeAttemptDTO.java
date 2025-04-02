package microservices.book.multiplication.challenge;

public record ChallengeAttemptDTO(
        int factorA,
        int factorB,
        String userAlias,
        int guess
) { }
