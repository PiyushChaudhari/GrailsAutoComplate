package com.service

import com.grails.Domain.AutoComplate

class AutoComplateService {

    def getAutoComplateName(params){
		def names = AutoComplate.withCriteria {ilike 'name', params.term + '%'}
		return names
	}
}
