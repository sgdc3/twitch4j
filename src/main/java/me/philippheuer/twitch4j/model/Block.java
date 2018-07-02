package me.philippheuer.twitch4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * Model representing a blocked user.
 *
 * @author Philipp Heuer [https://github.com/PhilippHeuer]
 * @version %I%, %G%
 * @since 1.0
 */
@Data
public class Block {

	@JsonProperty("_id")
	private Long id;

	private Date updated_at;

	private User user;

}
