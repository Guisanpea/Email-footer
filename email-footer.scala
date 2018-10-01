#! /usr/bin/env scala

import sys.process._
import scala.language.postfixOps

/**
 * Simple E-mail footer generator with some coupling but does it job
 */
object MailFooter {
  val fortune = "fortune -s" !!
  val cowFortune = s"cowthink $fortune" !!

 /**
  * Shell function
  * @param args(0) Your name
  * @param args(1) Your github username
  * @param args(2) Your linkedin username
  */
 def main (args: Array[String]){
   val name = args(0)
   val github = args(2)
   val linkedin = args(1)

   println(s"""
     #--
     #$name 
     #Linkedin: https://www.linkedin.com/in/$linkedin
     #Github: https://github.com/$github
     #
     #$cowFortune
     """.stripMargin('#'))
 }
}
