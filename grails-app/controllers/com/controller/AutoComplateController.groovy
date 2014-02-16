package com.controller

import grails.converters.JSON

import com.grails.Domain.AutoComplate

class AutoComplateController {

	def autoComplateService
    
	def autoComplate={
		def names = autoComplateService.getAutoComplateName(params)
		render (names?.'name' as JSON)
	}
}
