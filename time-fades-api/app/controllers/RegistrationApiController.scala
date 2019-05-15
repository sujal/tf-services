// Registration API Controller
// Copyright 2019 Forche LLC

package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class RegistrationApiController @Inject()(components: ControllerComponents) extends AbstractController(components) {

    def ping = Action { implicit request => 
        Ok("Hello World!\n\n")
    }

}