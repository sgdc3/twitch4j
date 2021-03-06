package me.philippheuer.twitch4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Model representing a twitch community.
 *
 * @author Philipp Heuer [https://github.com/PhilippHeuer]
 * @version %I%, %G%
 * @since 1.0
 */
@Data
public class Community {

	@JsonProperty("_id")
	private String id;

	private String name;

	private String summary;

	private String description;

	private String descriptionHtml;

	private String rules;

	private String rulesHtml;

	private Long ownerId;

	private String avatarImageUrl;

	private String coverImageUrl;

}
