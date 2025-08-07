/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package ru.lairon.setup;

import static ru.lairon.constants.AnimeHostingConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import ru.lairon.constants.AnimeHostingConstants;
import ru.lairon.service.AnimeHostingService;


@SystemSetup(extension = AnimeHostingConstants.EXTENSIONNAME)
public class AnimeHostingSystemSetup
{
	private final AnimeHostingService AnimeHostingService;

	public AnimeHostingSystemSetup(final AnimeHostingService AnimeHostingService)
	{
		this.AnimeHostingService = AnimeHostingService;
	}

	@SystemSetup(process = SystemSetup.Process.ALL, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		AnimeHostingService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return AnimeHostingSystemSetup.class.getResourceAsStream("/AnimeHosting/sap-hybris-platform.png");
	}
}
