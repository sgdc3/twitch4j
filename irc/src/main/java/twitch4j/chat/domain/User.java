package twitch4j.chat.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    /**
     * User Id
     */
    private final Long id;

    /**
     * User Name
     */
    private final String name;

}
