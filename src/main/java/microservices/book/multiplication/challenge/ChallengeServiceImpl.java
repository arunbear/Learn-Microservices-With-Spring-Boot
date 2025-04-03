package microservices.book.multiplication.challenge;

import microservices.book.multiplication.User;

public class ChallengeServiceImpl implements ChallengeService {

    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO attemptDTO) {

        boolean isCorrect =
                attemptDTO.guess() == attemptDTO.factorA() * attemptDTO.factorB();
        var user = new User(null, attemptDTO.userAlias());

        return new ChallengeAttempt(null,
                user,
                attemptDTO.factorA(),
                attemptDTO.factorB(),
                attemptDTO.guess(),
                isCorrect);
    }
}
