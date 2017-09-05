package com.websystique.springmvc.viewresolver;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

public class PdfViewResolver //implements ViewResolver
{

	
	public PdfView resolveViewName(String viewName, Locale locale) throws Exception {
		PdfView view = new PdfView();
		return view;
      }
	
}