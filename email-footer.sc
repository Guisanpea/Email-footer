#! /usr/bin/env scala

import sys.process._
import scala.language.postfixOps

/**
 * Simple E-mail footer generator with some coupling but does it job
 */
val fortune = "fortune -s" !!
val cowFortune = s"cowthink $fortune" !!

/**
 * Shell function
 * @param name Your name
 * @param linkedin Your Linkedin username
 * @param github Your Github username
 */
@main
def main (name: String, linkedin: String, github: String){
  println(s"""
    #--
    #$name 
    #Linkedin -> https://www.linkedin.com/in/$linkedin/
    #Github -> https://github.com/$github/
    #
    #$cowFortune
    """.stripMargin('#'))
}
