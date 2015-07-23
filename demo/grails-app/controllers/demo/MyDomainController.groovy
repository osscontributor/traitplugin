package demo

import grails.transaction.Transactional

@Transactional(readOnly = true)
class MyDomainController {

    def index() {
        render "The current date is -> " + currentDate()
    }
}
