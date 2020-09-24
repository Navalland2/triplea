package games.strategy.engine.lobby.client.login;

import lombok.Builder;
import lombok.Getter;
import org.triplea.domain.data.ApiKey;
import org.triplea.domain.data.UserName;

@Builder
@Getter
public class LoginResult {
  private final ApiKey apiKey;
  private final UserName username;
  private final boolean anonymousLogin;
  private final boolean moderator;
  private final boolean passwordChangeRequired;
}
