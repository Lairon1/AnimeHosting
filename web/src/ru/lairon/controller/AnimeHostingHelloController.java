/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package ru.lairon.controller;

import static ru.lairon.constants.AnimeHostingConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.lairon.service.AnimeHostingService;


@Controller
public class AnimeHostingHelloController
{
	@Autowired
	private AnimeHostingService AnimeHostingService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", AnimeHostingService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
