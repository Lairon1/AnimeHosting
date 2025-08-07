/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package ru.lairon.service;

public interface AnimeHostingService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
