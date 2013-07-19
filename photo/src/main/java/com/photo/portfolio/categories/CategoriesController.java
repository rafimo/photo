package com.photo.portfolio.categories;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the categories page.
 */
@RequestMapping("/categories")
@Controller
public class CategoriesController {

	private static final Logger logger = LoggerFactory
			.getLogger(CategoriesController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String list(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		List<String> categories = Arrays.asList("Nature", "Fashion");

		model.addAttribute("categories", categories);

		return "categories/list";
	}
}
