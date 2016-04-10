package utils

import play.api.mvc.RequestHeader
/**
  * Created by knoldus on 7/4/16.
  */
object helper {


  def findSession(request:RequestHeader,element:String):String ={
    request.session.get(element).map(sessionValue =>sessionValue)}.getOrElse{
    " "
  }

  def findFlash(request:RequestHeader,element:String):String ={
    request.flash.get(element).getOrElse{
    " "
    }

  }
}
