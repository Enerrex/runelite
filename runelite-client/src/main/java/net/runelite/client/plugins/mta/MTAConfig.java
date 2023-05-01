/*
 * Copyright (c) 2018, Jasper Ketelaar <Jasper0781@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.mta;

import java.awt.Color;
import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup(MTAPlugin.MTA_CONFIG_KEY)
public interface MTAConfig extends Config
{
	@ConfigSection(
		name = "Alchemy",
		description = "Alchemy room configuration",
		position = 0
	)
	String alchemyRoomSection = "alchemyRoom";

	@ConfigItem(
		keyName = "alchemy",
		name = "Enable",
		description = "Configures whether or not the alchemy room overlay is enabled.",
		section = alchemyRoomSection
	)
	default boolean alchemy()
	{
		return true;
	}

	@ConfigSection(
		name = "Graveyard",
		description = "Graveyard room configuration",
		position = 1
	)
	String graveyardRoomSection = "graveyardRoom";

	@ConfigItem(
		keyName = "graveyard",
		name = "Enable",
		description = "Configures whether or not the graveyard room overlay is enabled.",
		section = graveyardRoomSection
	)
	default boolean graveyard()
	{
		return true;
	}

	@ConfigSection(
		name = "Telekinetic",
		description = "Telekinetic room configuration",
		position = 2
	)
	String telekineticRoomSection = "telekineticRoom";

	@ConfigItem(
		keyName = "telekinetic",
		name = "Enable",
		description = "Configures whether or not the telekinetic room overlay is enabled.",
		section = telekineticRoomSection,
		position = 0
	)
	default boolean telekinetic()
	{
		return true;
	}

	@ConfigItem(
		keyName = "telekineticSteps",
		name = "Display #",
		description = "Configures the number of moves to display.",
		section = telekineticRoomSection,
		position = 1
	)
	default int telekineticSteps()
	{
		return 1;
	}

	@Alpha
	@ConfigItem(
		keyName = "targetColor",
		name = "Current Target",
		description = "Color of the current target point.",
		section = telekineticRoomSection,
		position = 2
	)
	default Color getTargetColor()
	{
		return Color.RED;
	}

	@Alpha
	@ConfigItem(
		keyName = "nextTargetColor",
		name = "Next Target",
		description = "Color of the next target point.",
		section = telekineticRoomSection,
		position = 2
	)
	default Color getNextTargetColor()
	{
		return Color.ORANGE;
	}

	@Alpha
	@ConfigItem(
		keyName = "futureTargetColor",
		name = "Future Targets",
		description = "Color of the future target points.",
		section = telekineticRoomSection,
		position = 2
	)
	default Color getFutureTargetColor()
	{
		return Color.CYAN;
	}

	@ConfigSection(
		name = "Enchantment",
		description = "Enchantment room configuration",
		position = 3
	)
	String enchantmentRoomSection = "enchantmentRoom";

	@ConfigItem(
		keyName = "enchantment",
		name = "Enable",
		description = "Configures whether or not the enchantment room overlay is enabled.",
		section = enchantmentRoomSection
	)
	default boolean enchantment()
	{
		return true;
	}
}
