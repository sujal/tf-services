// Registration API Controller
// Copyright 2019 Forche LLC

package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}
import auth.AuthAction

@Singleton
class RegistrationApiController @Inject()(
    components: ControllerComponents,
    authAction: AuthAction
  ) extends AbstractController(components) {

  def ping = authAction { implicit request => 
    Ok("Hello World!\n\n")
  }

}