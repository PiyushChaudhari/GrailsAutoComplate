package com.controller

import grails.converters.JSON

import com.grails.Domain.AutoComplate

class AutoComplateController {

    def index() { }
	
	def autoComplate={
		def names = AutoComplate.withCriteria {ilike 'name', params.term + '%'}
		render (names?.'name' as JSON)
	}
}
