package com.timefades.api.functions

import com.amazonaws.services.lambda.runtime.{Context, RequestHandler}
import scala.collection.JavaConverters
import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._

class Handler extends RequestHandler[Request, Response] {

  def handleRequest(input: Request, context: Context): Response = {
    Response("Go Serverless v1.0! Your function executed successfully!", input)
  }
}

class ApiGatewayHandler extends RequestHandler[Request, ApiGatewayResponse] {

  def handleRequest(input: Request, context: Context): ApiGatewayResponse = {
    val headers = Map("x-custom-response-header" -> "my custom response header value")

    val jsonOutput = Map[String, String](
    	"message" -> "Go Serverless v1.0! Your function executed successfully!"
    )

    ApiGatewayResponse(200, jsonOutput.asJson.noSpaces,
      JavaConverters.mapAsJavaMap[String, Object](headers),
      true)
  }
}
