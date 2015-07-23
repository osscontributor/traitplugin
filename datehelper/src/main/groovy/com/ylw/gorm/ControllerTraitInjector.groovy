package com.ylw.gorm

import grails.compiler.traits.TraitInjector
import groovy.transform.CompileStatic


@CompileStatic
class ControllerTraitInjector implements TraitInjector {

    @Override
    Class getTrait() {
        DateTrait
    }

    @Override
    String[] getArtefactTypes() {
        ['Controller'] as String[]
    }
}
